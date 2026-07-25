Atue também como engenheiro de prompt e crie o `AGENTS.md` conforme as
instruções abaixo.

- A estrutura contém `prompts/` com os prompts reutilizáveis, `skills/` com as
  habilidades usadas pela IA e `README.md` com os dados da disciplina.
- A infraestrutura deve ser independente de nome, código, curso, professor,
  proprietário do GitHub, repositório e semestre.
- Cada instância da base representa uma disciplina e mantém seus metadados
  públicos em `course.config.json`, sua prosa nos READMEs e as configurações
  específicas nos slides.
- O objetivo é disponibilizar aos estudantes os materiais necessários, como
  slides, atividades, códigos de demonstração e materiais de apoio.
- O semestre vigente do CI fica em `course.config.json`; `SEMESTER` no `.env`
  deve coincidir com ele.
- O `.env` também define `ANALYTICAL_PROGRAM` e o nome exato da aba em `TAB`.
- A skill `skills/update-cronogram/SKILL.md` importa o cabeçalho literal `ID`
  para `<SEMESTER>/schedule.json` e regenera somente a seção `Cronograma` do
  README desse semestre.
- O build gera links `aula-NN` apenas quando a pasta direta e real existe,
  preserva IDs repetidos e mantém texto simples para aulas ainda ausentes.
