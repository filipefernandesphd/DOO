import assert from "node:assert/strict";
import { mkdir, mkdtemp, rm, writeFile } from "node:fs/promises";
import os from "node:os";
import path from "node:path";
import test from "node:test";

import {
  findRepositoryRoot,
  validateHandsonStructure,
} from "./check-content.mjs";

test("finds a versioned repository checkout without AGENTS.md", async (t) => {
  const root = await mkdtemp(path.join(os.tmpdir(), "course-repository-root-"));
  t.after(() => rm(root, { recursive: true, force: true }));

  await Promise.all(
    ["course.config.json", "course.config.schema.json", "package.json"].map(
      (name) => writeFile(path.join(root, name), "{}\n"),
    ),
  );
  const nested = path.join(root, "2026.2", "aula-01", "slides");
  await mkdir(nested, { recursive: true });

  assert.equal(await findRepositoryRoot(nested), root);
});

test("does not accept an incomplete repository marker set", async (t) => {
  const directory = await mkdtemp(
    path.join(os.tmpdir(), "course-incomplete-root-"),
  );
  t.after(() => rm(directory, { recursive: true, force: true }));
  await writeFile(path.join(directory, "course.config.json"), "{}\n");

  await assert.rejects(
    findRepositoryRoot(directory),
    /Raiz do repositório não encontrada/u,
  );
});

test("accepts a handson with a non-empty README and additional Markdown", async (t) => {
  const root = await mkdtemp(path.join(os.tmpdir(), "course-handson-"));
  t.after(() => rm(root, { recursive: true, force: true }));
  const directory = path.join(root, "2026.2", "handson-01");
  await mkdir(directory, { recursive: true });
  await writeFile(path.join(directory, "README.md"), "# Exercícios\n");
  await writeFile(path.join(directory, "parte-01.md"), "## Parte 1\n");

  await validateHandsonStructure(root, "2026.2", "handson-01");
});

test("rejects non-Markdown content in a handson", async (t) => {
  const root = await mkdtemp(path.join(os.tmpdir(), "course-handson-invalid-"));
  t.after(() => rm(root, { recursive: true, force: true }));
  const directory = path.join(root, "2026.2", "handson-01");
  await mkdir(directory, { recursive: true });
  await writeFile(path.join(directory, "README.md"), "# Exercícios\n");
  await writeFile(path.join(directory, "Main.java"), "class Main {}\n");

  await assert.rejects(
    validateHandsonStructure(root, "2026.2", "handson-01"),
    /extensão \.md/u,
  );
});
