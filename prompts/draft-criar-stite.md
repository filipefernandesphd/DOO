## Papel

Atue como engenheiro de prompt e engenheiro de software e estruture o projeto conforme as instruções abaixo.

## Objetivo

Estruturar uma base reutilizável para repositórios de disciplinas e gerar um
site para a disciplina configurada em cada instância. Todo commit em qualquer
branch deve validar e construir o site; somente a branch padrão pode publicar
no GitHub Pages.

Nome, código, curso, professor, semestre, proprietário do GitHub e nome do
repositório são dados configuráveis. Não os fixe no gerador, nos templates ou
no workflow.

## Resultado experado

Um site no github pages que facilite o aluno encontrar os materiais da disciplina que estão no proprio repositorio.

## Cenários de uso

**Do ponto de vista do aluno:**

* O aluno acessa o link do site criado pelo Pages. Ex:
  `<conta>.github.io/<repositorio>/`.
* O aluno visualiza os dados básicos da disciplina e uma lista de semestres, cada um com um link
* Quando o aluno acessa o semestre, por exemplo 2026.2, o aluno é redirecionado
  para `<conta>.github.io/<repositorio>/2026.2/`.
* Nesta página, aparece os mesmos dados básicos que serão mostrados quando acessa o site na sua raiz, mas no lugar de listar os semestres, mostra o cronograma/planejamento da discilinas, contendo a data, dia da semana, módulo, tópico.
* Cada tópico de aula terá um link para
  `<conta>.github.io/<repositorio>/2026.2/aula-01/`. As pastas seguem
  `aula-00`, `aula-01`, `aula-02` etc.
* Quando o aluno acessar a aula, uma página HTML mostrará o conteúdo que está
  no repositório. Pastas como `atividades` e `materiais_de_apoio` apontarão
  para o GitHub, e não para uma cópia no Pages.
* A exceção é a pasta `slides`, obrigatória em toda aula. Ela contém slides
  Slidev e abre em
  `<conta>.github.io/<repositorio>/2026.2/aula-01/slides/`.

**Do ponto de vista do professor**

* O professor cria a estrutura padrão da disciplina, bem como as configurações básicas no início do semestre.
* A cada aula planejada do semestre, no seu computador, ele cria a estrutura que deve ser seguida e os conteúdos.
* Depois do push, o GitHub valida qualquer branch. O site público é atualizado
  automaticamente quando a mudança chega à branch padrão.
* Os slides SEMPRE devem ser preparados conforme o template disponibilizado em `git@github.com:filipefernandesphd/my-slidev-template.git `

## Estrutura

O repositório terá a seguinte estrutura, conforme o exemplo abaixo

```
| 2026.2/
| |-- aula-00/
| |   |-- slides/
| |-- aula-01/
| |   |-- slides/
| 2026.1/
| 2025.2/
| 2025.1/
| README.md
| index.html
```

Na raiz, várias pastas serão criadas para indicar o semestre. Os READMEs
contêm a prosa, `course.config.json` contém os metadados públicos e cada
`AAAA.S/schedule.json` é a fonte de verdade do cronograma. O build gera os
`index.html` correspondentes em `_site/`.

O conteúdo da index.html/README.md será, basicamente, o nome da disciplina, dados principais (nome do curso, código disciplina, nome professor etc) e listando as pastas que referem-se aos períodos, com o link para index.html da pasta do semestre. Ex: http://contagithub.io/repositorio/2026.2/index.html.

### index.html do semestre

No `index.html` gerado para cada semestre haverá o cronograma da disciplina.
Sua prosa vem do README e sua tabela vem de `schedule.json`.

## Configuração do semestre vigente

O `.env` raiz contém somente configuração local:

```dotenv
SEMESTER=2026.2
ANALYTICAL_PROGRAM=https://endereco-da-planilha
TAB=Program
```

`SEMESTER` seleciona o cronograma atualizado pela skill
`skills/update-cronogram/SKILL.md`; `TAB` seleciona a aba por igualdade
literal. A skill deve persistir `<SEMESTER>/schedule.json`, exigir o cabeçalho
literal `ID`, aceitar células vazias ou valores `aula-NN` e preservar IDs
repetidos. A tabela de `<SEMESTER>/README.md` é uma projeção sem a coluna `ID`.
O CI não lê `.env` nem acessa a planilha: usa o semestre público de
`course.config.json` e cria links apenas para pastas `aula-*` diretas e reais
que existirem no checkout.

## Tarefa

* Leia todas as instruções acima
* Planeje uma arquitetura independente de disciplina e aplique as instruções
  em `AGENTS.md` e `INSTRUCTIONS.md`.
* Atualize `skills/update-cronogram/SKILL.md`, `course.config.json`, os schemas,
  `.env.example` e as regras de versionamento necessárias.
* Fique à vontade para criar skills em `./skills` e/ou prompts em `./prompts`
* O que vc decidir deve conter em AGENTS.md e INSTRUCTIONS.md
