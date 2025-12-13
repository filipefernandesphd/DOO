# Atividade 20

## Cenário 1 – Contador de Acessos a um Sistema

Um sistema web mantém um contador de acessos que é incrementado sempre que um usuário entra na aplicação. Vários usuários podem acessar o sistema ao mesmo tempo.

Descreva como o contador deve ser implementado para evitar resultados incorretos quando múltiplas threads tentam atualizá-lo simultaneamente. O foco é garantir consistência dos dados em um ambiente concorrente.


## Cenário 2 – Impressora Compartilhada em um Laboratório

Em um laboratório de informática, vários computadores enviam documentos para uma única impressora compartilhada. Apenas um documento pode ser impresso por vez.

Defina como o acesso à impressora deve ser controlado para evitar conflitos entre requisições simultâneas. O objetivo é garantir que os trabalhos sejam processados de forma ordenada e segura.


## Cenário 3 – Atualização de Saldo em Conta Bancária

Um sistema bancário permite que diferentes operações, como depósito e saque, ocorram simultaneamente na mesma conta. Cada operação é executada por uma thread distinta.

Explique como garantir que o saldo da conta permaneça consistente mesmo com múltiplas operações concorrentes. O foco é evitar condições de corrida e inconsistências nos dados.


## Cenário 4 – Sistema de Reservas de Assentos

Um sistema de reservas permite que vários usuários tentem reservar o mesmo assento em um evento ao mesmo tempo. Apenas uma reserva deve ser confirmada.

Descreva como o sistema deve lidar com acessos simultâneos ao mesmo recurso para evitar reservas duplicadas. O objetivo é garantir exclusividade no acesso ao assento, mesmo em cenários de alta concorrência.


## Cenário 5 – Processamento de Pedidos em um E-commerce

Um e-commerce processa pedidos em paralelo para melhorar o desempenho. Cada pedido passa por etapas como validação, pagamento e atualização de estoque.

Defina como coordenar a execução concorrente das etapas de processamento dos pedidos, garantindo que recursos compartilhados, como o estoque, não sejam atualizados de forma incorreta.