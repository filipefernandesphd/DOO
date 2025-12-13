# Revisão 3

## Cenário 1 – Sistema de Notificações Acadêmicas

**Tópicos:**
- Modificadores de acesso
- Classe abstrata
- Interface
- Sobrescrita
- Polimorfismo

Uma instituição de ensino deseja implementar um sistema de notificações para comunicar alunos e professores sobre eventos importantes, como divulgação de notas, prazos de matrícula e avisos administrativos. O sistema deve permitir o envio de notificações por diferentes meios, como e-mail e mensagem no sistema acadêmico. No futuro, novos tipos de notificação poderão ser adicionados.

Cada tipo de notificação possui um comportamento específico para o envio da mensagem, mas todas compartilham informações comuns, como destinatário e conteúdo da mensagem. O sistema deve permitir tratar todas as notificações de forma uniforme, independentemente do tipo concreto.

**Orientações:**
Modele uma abstração que represente uma notificação genérica, contendo os atributos e comportamentos comuns. Utilize uma interface para definir o contrato de envio da notificação. Crie diferentes tipos concretos de notificação que especializam o comportamento de envio, sobrescrevendo métodos quando necessário. Utilize modificadores de acesso adequados para proteger os atributos internos e permita que o sistema trate todas as notificações de forma polimórfica.

## Cenário 2 – Controle de Usuários em um Sistema Institucional

**Tópicos:**
- Modificadores de acesso
- Modificadores de estado
- Método construtor
- Package e import

Uma instituição deseja desenvolver um sistema para gerenciar usuários internos, como alunos, professores e técnicos administrativos. Cada usuário possui dados básicos que devem ser inicializados no momento da criação do objeto e alguns atributos que não podem ser alterados após definidos.

O sistema será organizado em pacotes distintos para separar responsabilidades, como domínio, serviços e aplicação principal.

**Orientações:**
Utilize modificadores de acesso para proteger os atributos internos das classes e modificadores de estado para garantir imutabilidade onde necessário. Defina construtores adequados para inicializar corretamente os objetos. Organize as classes em pacotes coerentes e utilize importações para permitir a comunicação entre eles.


## Cenário 3 – Processamento de Pagamentos em um Sistema de E-commerce

**Tópicos:**
- Interface
- Classe abstrata
- Sobrecarga
- Sobrescrita

Um sistema de e-commerce precisa processar pagamentos por diferentes meios, como cartão de crédito, boleto e pix. Apesar de cada meio possuir regras próprias, todos seguem um fluxo geral de processamento.

Além disso, algumas formas de pagamento permitem variações no processamento, como parcelamento ou desconto à vista.

**Orientações:**
Defina uma abstração que represente um pagamento genérico, estabelecendo um contrato comum. Utilize sobrecarga para lidar com variações no processamento e sobrescrita para especializar o comportamento de cada forma de pagamento concreta, respeitando o contrato definido.


## Cenário 4 – Relatórios Dinâmicos em um Sistema Acadêmico

**Tópicos:**
- Classe interna não estática
- Classe local
- Encapsulamento
- Polimorfismo

Um sistema acadêmico gera relatórios de desempenho dos alunos. Cada relatório pode conter cálculos auxiliares e regras específicas que só fazem sentido dentro do contexto da geração do relatório.

Algumas dessas regras são temporárias e usadas apenas durante a execução de um método específico.

**Orientações:**
Utilize classes internas para representar comportamentos fortemente associados à classe principal do relatório. Empregue classes locais para encapsular lógicas temporárias, garantindo encapsulamento e permitindo que diferentes tipos de relatórios sejam tratados de forma polimórfica.


## Cenário 5 – Sistema de Auditoria com Comportamentos Variáveis

**Tópicos:**
- Classe anônima
- Interface
- Tratamento de exceções
- Exceções personalizadas

Um sistema corporativo precisa registrar auditorias em diferentes formatos, dependendo do contexto da execução. Em alguns casos, o comportamento de auditoria é definido apenas no momento da execução.

Durante o processo, podem ocorrer falhas específicas que precisam ser tratadas de forma controlada e sem expor detalhes internos do sistema.

**Orientações:**
Utilize interfaces para definir o comportamento esperado da auditoria e implemente esse comportamento dinamicamente por meio de classes anônimas. Trate erros utilizando exceções apropriadas e crie exceções personalizadas para representar falhas específicas do domínio.


## Cenário 6 – Estrutura Hierárquica de Componentes Gráficos

**Tópicos:**
- Composite
- Herança
- Polimorfismo
- Agregação

Um editor gráfico permite criar elementos simples, como botões e textos, e também elementos compostos, como painéis que agrupam outros componentes gráficos. Um painel pode conter tanto elementos simples quanto outros painéis.

O sistema deve permitir que todos os componentes sejam tratados de forma uniforme.

**Orientações:**
Modele uma hierarquia que permita representar componentes simples e compostos de maneira transparente. Utilize herança para compartilhar comportamentos comuns, polimorfismo para tratar todos os componentes de forma uniforme e agregação para representar a relação entre componentes e seus agrupamentos.


## Cenário 7 – Customização de Serviços em uma Plataforma de Streaming

**Tópicos:**
- Decorator
- Interface
- Composição
- Polimorfismo

Uma plataforma de streaming oferece um serviço básico de assinatura. O usuário pode adicionar funcionalidades extras, como conteúdo premium, múltiplas telas ou downloads offline.

Essas funcionalidades podem ser combinadas livremente e alteradas sem modificar a estrutura original do serviço básico.

**Orientações:**
Defina um contrato comum para os serviços da plataforma. Utilize composição para encapsular o serviço base e aplique o padrão Decorator para adicionar funcionalidades de forma dinâmica, mantendo o tratamento polimórfico dos serviços.


## Cenário 8 – Repositório Genérico com Processamento Concorrente

**Tópicos:**
- Classe genérica
- Concorrência
- Encapsulamento
- Tratamento de exceções

Um sistema precisa armazenar diferentes tipos de objetos em memória, permitindo acesso simultâneo por múltiplas threads. O repositório deve garantir segurança no acesso aos dados e preservar a tipagem correta dos objetos armazenados.

Falhas de acesso concorrente devem ser tratadas de forma controlada.

**Orientações:**
Utilize classes genéricas para permitir o armazenamento de diferentes tipos com segurança de tipos. Garanta o encapsulamento do estado interno do repositório e implemente mecanismos para lidar com acesso concorrente. Trate possíveis falhas utilizando exceções adequadas ao contexto.