# Atividade 18

## Padrão Composite

### Cenário 1 – Estrutura de Menu em um Sistema de Restaurante

Um sistema de restaurante precisa representar seu cardápio digital. Um item do cardápio pode ser um prato simples (como “Suco” ou “Hambúrguer”) ou um combo (como “Combo Família”), que por sua vez pode conter outros itens e até outros combos.

Defina uma estrutura que permita tratar pratos individuais e combos de forma uniforme. O cliente do sistema deve poder consultar o nome e o preço de qualquer item do cardápio sem precisar saber se ele é simples ou composto. O foco é permitir que objetos individuais e composições sejam manipulados da mesma forma.


### Cenário 2 – Organização de Pastas e Arquivos em um Sistema Operacional

Um sistema precisa representar a estrutura de um sistema de arquivos. Um arquivo é uma unidade simples, enquanto uma pasta pode conter arquivos e outras pastas, formando uma hierarquia.

Modele a solução de forma que tanto arquivos quanto pastas possam ser tratados como “elementos do sistema de arquivos”. O sistema deve permitir operações como exibir o nome e calcular o tamanho total, independentemente de o elemento ser um arquivo ou uma pasta.

### Cenário 3 – Montagem de Provas Acadêmicas

Um professor monta provas compostas por questões individuais e por blocos de questões (por exemplo, “Questões de Programação”, “Questões Teóricas”). Cada bloco pode conter outras questões ou até sub-blocos.

Projete uma solução em que questões individuais e blocos de questões sejam tratados de forma uniforme. O sistema deve permitir calcular a pontuação total da prova e listar todos os elementos, sem distinguir explicitamente se são folhas ou composições.


## Padrão Decorator

### Cenário 4 – Customização de Bebidas em uma Cafeteria

Uma cafeteria vende bebidas básicas, como café e chá. O cliente pode adicionar ingredientes extras, como leite, chantilly, chocolate ou canela. Cada adicional altera o preço e a descrição da bebida.

Modele a solução de forma que os adicionais possam ser combinados dinamicamente, sem criar subclasses para cada combinação possível. O sistema deve permitir adicionar e remover complementos sem alterar a classe original da bebida.


### Cenário 5 – Notificações em um Sistema de Monitoramento

Um sistema de monitoramento envia notificações básicas por e-mail. Dependendo da configuração, o usuário pode desejar que a notificação também seja enviada por SMS, WhatsApp ou registrada em log.

Projete uma estrutura que permita adicionar novas formas de notificação dinamicamente, sem modificar a implementação da notificação básica. O sistema deve permitir empilhar comportamentos adicionais conforme a necessidade.


### Cenário 6 – Segurança em Requisições de uma API

Uma API possui um serviço básico de processamento de requisições. Em alguns contextos, é necessário adicionar validação de autenticação, autorização e registro de auditoria.

Defina uma solução que permita adicionar camadas de segurança de forma flexível, sem alterar o serviço principal. O objetivo é encapsular responsabilidades adicionais de maneira modular e reutilizável.