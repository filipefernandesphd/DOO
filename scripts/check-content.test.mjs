import assert from "node:assert/strict";
import { mkdir, mkdtemp, rm, writeFile } from "node:fs/promises";
import os from "node:os";
import path from "node:path";
import test from "node:test";

import { findRepositoryRoot } from "./check-content.mjs";

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
