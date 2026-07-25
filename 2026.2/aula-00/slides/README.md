# Referências e citações

Este deck usa `slidev-addon-citations` e mantém sua bibliografia padrão em
`public/biblio/references.bib`.

## Adicionar uma referência

Crie ou cole uma entrada BibTeX válida no arquivo `.bib` e escolha uma chave
única, como `RAG2018`:

```bibtex
@techreport{RAG2018,
  author      = {{Instituição responsável}},
  title       = {Título da publicação},
  institution = {Instituição responsável},
  year        = {2018}
}
```

A chave usada no slide deve corresponder exatamente à chave existente no
arquivo BibTeX.

## Citar no slide

Use a sintaxe Markdown processada pelo transformer local:

```md
Texto apoiado pela referência [@RAG2018]
```

Também é possível usar diretamente o componente:

```md
Texto apoiado pela referência <Cite bref="RAG2018" />
```

## Mostrar a bibliografia

O deck usa um slide `default` do Tahta para preservar sua identidade visual:

```md
---
layout: default
title: Referências
---

<BiblioList />
```

O addon também oferece `layout: biblio` como alternativa. No headmatter,
`show_full_bib: true` garante que todas as entradas do arquivo sejam exibidas
mesmo quando o slide de referências é aberto diretamente; `show_id: false`
oculta as chaves internas na lista final.

Para trocar o arquivo, altere `biblio.filename` no headmatter e mantenha o novo
arquivo em `public/biblio/`. A versão instalada também aceita uma lista:

```yaml
biblio:
  filename:
    - references.bib
    - additional-references.bib
```

`references.bib` continua sendo o padrão deste deck.

## Estrutura

```text
slides/
├── public/
│   └── biblio/
│       └── references.bib
├── setup/
│   └── transformers.ts
├── README.md
└── slides.md
```

As dependências são compartilhadas pelo `package.json` da raiz do repositório.
Os overrides de `@citation-js/*@0.7.21` evitam uma incompatibilidade observada
no navegador com a série `0.8`; só devem ser removidos após nova validação de
build e runtime no navegador.
