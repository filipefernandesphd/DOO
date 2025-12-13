# Atividade 19

## Cenário 1 – Repositório de Dados Acadêmicos

Um sistema acadêmico precisa armazenar diferentes tipos de entidades, como alunos, professores e disciplinas. Atualmente, há uma classe específica de repositório para cada tipo de entidade, o que gera repetição de código e dificuldade de manutenção.

Defina uma solução que permita criar um único repositório capaz de armazenar qualquer tipo de entidade. O objetivo é garantir reutilização de código, mantendo a segurança de tipos em tempo de compilação, evitando o uso de estruturas genéricas não tipadas.


## Cenário 2 – Caixa de Armazenamento em um Sistema Logístico

Um sistema logístico trabalha com diferentes tipos de produtos, como eletrônicos, alimentos e documentos. Cada tipo possui regras próprias, mas a estrutura de armazenamento é a mesma: adicionar, remover e listar itens.

Projete uma classe de caixa que possa armazenar qualquer tipo de item, sem perder a tipagem específica do conteúdo. O foco é permitir que a mesma estrutura seja reutilizada para diferentes tipos, sem duplicar código.


## Cenário 3 – Histórico de Operações em um Sistema Bancário

Um sistema bancário precisa registrar diferentes tipos de operações, como depósitos, saques e transferências. O histórico dessas operações segue a mesma lógica de armazenamento, independentemente do tipo da operação.

Defina uma estrutura genérica que permita armazenar e recuperar registros de diferentes tipos de operações. A solução deve permitir que o tipo da operação seja conhecido em tempo de compilação, garantindo maior segurança e clareza no código.


## Cenário 4 – Comparador de Elementos em um Sistema de Avaliação

Um sistema de avaliação precisa comparar elementos de diferentes naturezas, como notas, médias finais e conceitos. A lógica de comparação é semelhante, mas os tipos envolvidos variam.

Projete uma solução que permita comparar elementos de diferentes tipos utilizando uma única estrutura genérica. O objetivo é evitar a criação de múltiplas versões da mesma lógica de comparação para cada tipo de dado.


## Cenário 5 – Serviço de Cache em um Sistema Web

Um sistema web utiliza cache para armazenar diferentes tipos de dados, como páginas, objetos de sessão e resultados de consultas. Apesar da diversidade de dados, o comportamento do cache é o mesmo.

Defina uma classe de cache genérica que permita armazenar e recuperar diferentes tipos de dados, garantindo que o tipo correto seja retornado sem necessidade de conversões explícitas.