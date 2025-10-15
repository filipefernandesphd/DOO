# Revisão 1

## Objetivo

- Aplicar e revisar conceitos de **DOO** vistos até agora .
- Desenvolver a habilidade de **abstrair objetos do mundo real** para a programação orientada a objetos.
- Servir como revisão para a avaliação. 


## Sistema de Cinema
Imagine que você está desenvolvendo um sistema para um cinema. O objetivo é controlar os filmes, ingressos, sessões e clientes de maneira organizada. Para isso, algumas regras e relações entre os objetos devem ser seguidas:

### Filmes
- Cada filme possui um título, duração em minutos e classificação indicativa.
- Além disso, cada filme pode ter um diretor, que é obrigatório ter um nome.
- Para cadastrar um novo filme o sistema pode inserir todas as informações sobre ele ou você pode inserir apenas ás mais importantes como nome ,diretor,etc

### Sessões
Cada sessão representa uma exibição de um filme em um horário específico e em uma sala.

### Ingressos

Cada ingresso corresponde à reserva de um assento para um filme e possui um preço.
Os ingressos são associados diretamente aos clientes, ou seja, cada cliente controla seus próprios ingressos.

### Clientes

Cada cliente possui um nome e pode  comprar vários  ingressos
- Ele pode doar ingressos para outros clientes, ao doar , o ingresso deve ser associado ao ao cliente recebeu o ingresso.

### Regras importantes

Criar formas de construir os objetos de maneira que possamos passar pare ele  todos seus atributos durante sua construção,  mas que também possamos fazer isso de forma  simplificada, preenchendo apenas valores mais importantes.

As sessões sempre devem estar ligadas a um filme, e cada cliente deve cuidar dos próprios ingressos.

Os métodos devem mostrar informações de maneira clara, para que qualquer pessoa consiga entender rapidamente o que está acontecendo no sistema.

## Conceitos avaliados

- Abstração de objetos do mundo real
- Instanciação de objetos
- Métodos com parâmetros
- Construtores
- Agregação e composição
- Modificadores de acesso e de estado `static` e `final`
