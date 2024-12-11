# Atividade 10

## Exercício 1: Agregação e Composição
Você está projetando um sistema para gerenciar uma biblioteca. O sistema deve representar uma biblioteca, suas estantes e os livros em cada estante. As estantes podem ser transferidas de uma biblioteca para outra, mas cada livro pertence exclusivamente à estante onde está guardado e não pode existir sem ela. Além disso, a biblioteca deve ser capaz de listar todos os livros disponíveis em todas as suas estantes. Implemente as classes necessárias para representar esse sistema, levando em conta as relações de agregação e composição entre os objetos.

## Exercício 2: Modificadores de Acesso
Um sistema de gerenciamento de funcionários em uma empresa deve permitir que informações confidenciais, como o salário, sejam protegidas contra acesso não autorizado. Cada funcionário tem um nome e um salário. O nome pode ser acessado e alterado livremente, mas o salário só pode ser consultado por classes que fazem parte do pacote de recursos humanos e nunca deve ser alterado após ser definido na criação do objeto. Implemente as classes considerando esses requisitos.

## Exercício 3: Modificadores de Estado (static e final)
Uma empresa de transporte quer implementar um sistema para gerenciar suas frotas. Cada veículo tem um identificador único, que nunca pode ser alterado após ser definido. A empresa também precisa rastrear o número total de veículos registrados no sistema. Implemente as classes necessárias, garantindo que os requisitos sejam atendidos usando modificadores de estado.

## Exercício 4: Herança
Um zoológico está desenvolvendo um sistema para catalogar os animais. Cada animal possui características básicas como nome, idade e espécie. Animais aquáticos, por exemplo, têm a capacidade de nadar, enquanto aves podem voar. Implemente as classes de modo que a reutilização de código seja maximizada e novas categorias de animais possam ser facilmente adicionadas no futuro.

## Exercício 5: Polimorfismo
Uma empresa de entregas quer automatizar seu sistema de cálculo de tarifas. Eles têm diferentes tipos de entregas, como padrão, expressa e internacional, cada uma com uma forma específica de calcular o custo final. Crie uma estrutura que permita calcular a tarifa de qualquer tipo de entrega sem que o código do sistema precise conhecer os detalhes de cada cálculo.

## Exercício 6: Agregação e Composição
Uma escola deseja criar um sistema para gerenciar suas turmas e alunos. Cada turma é composta por vários alunos, que podem ser adicionados ou removidos da turma sem afetar sua existência. Entretanto, cada aluno possui uma ficha de avaliação, que não pode existir sem o aluno. Implemente as classes necessárias para esse sistema.

## Exercício 7: Modificadores de Acesso e Herança
Um sistema de gerenciamento de contas bancárias deve proteger informações sensíveis, como o saldo, contra acesso indevido. As contas podem ser de dois tipos: corrente e poupança. Ambas têm métodos para consultar o saldo, mas os métodos para calcular juros e taxas são diferentes. Garanta que a implementação seja segura e permita a expansão para novos tipos de contas.

## Exercício 8: Modificadores de Estado (static e final)
Uma loja virtual precisa implementar um sistema para gerenciar os produtos e os pedidos realizados pelos clientes. Cada produto possui um código único, que nunca muda. Além disso, o sistema deve registrar o número total de pedidos feitos desde que foi iniciado. Implemente as classes necessárias para atender a esses requisitos.

## Exercício 9: Herança e Polimorfismo
Um sistema de gerenciamento de veículos deve ser capaz de registrar diferentes tipos de veículos, como carros, motos e caminhões. Todos os veículos têm métodos para acelerar e frear, mas cada tipo de veículo pode implementar esses comportamentos de forma diferente. Crie as classes necessárias para suportar essa funcionalidade.

## Exercício 10: Polimorfismo
Uma plataforma de streaming de música precisa implementar um sistema para reproduzir diferentes tipos de arquivos de áudio, como MP3, WAV e FLAC. Cada tipo de arquivo tem seu próprio método para ser reproduzido, mas o sistema principal deve ser capaz de executar qualquer tipo de arquivo sem saber os detalhes de como ele é reproduzido. Desenvolva as classes necessárias para essa funcionalidade.