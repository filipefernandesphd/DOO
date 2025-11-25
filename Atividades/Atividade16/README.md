# ATIVIDADE 16

## Conceito: Classe Interna

### Exercício 1: Sistema de Carro e Motor
**Cenário:**  
Uma classe `Carro` precisa controlar um motor interno que só faz sentido existir dentro dele.  
**Tarefa:**  
- Crie a classe `Carro`.  
- Dentro dela, crie uma **classe interna** `Motor`.  
- A classe `Motor` deve ter um método `ligar()`.  
- Instancie `Motor` a partir de um objeto `Carro` e chame o método `ligar()`.

### Exercício 2: Pessoa e Documento
**Cenário:**  
Uma pessoa pode ter um documento de identidade. Esse documento não deve existir sem a pessoa.  
**Tarefa:**  
- Crie a classe `Pessoa`.  
- Crie uma **classe interna** `Documento` com atributos `numero` e `orgao`.  
- No método `mostrarDados()` da classe interna, exiba as informações do documento junto com o nome da pessoa.  
- No `main`, instancie `Pessoa` e seu `Documento`.

### Exercício 3: Computador e Processador
**Cenário:**  
Um computador possui um processador que é uma unidade interna dele.  
**Tarefa:**  
- Crie a classe `Computador` com atributo `marca`.  
- Crie uma **inner class** chamada `Processador` com atributo `velocidadeGHz`.  
- O método `detalhes()` da inner class deve exibir a marca do computador + velocidade.  
- Instancie e exiba os detalhes.


## Conceito: Classe Estática (Static Nested Class)

### Exercício 4: Configurações de Banco de Dados
**Cenário:**  
Um sistema precisa armazenar informações estáticas sobre configurações de banco.  
**Tarefa:**  
- Crie a classe `BDConfig`.  
- Dentro dela, declare uma **classe estática** `Credenciais` com atributos `usuario` e `senha`.  
- Acesse os atributos diretamente por `BDConfig.Credenciais`.

### Exercício 5: Conversor de Valores
**Cenário:**  
Uma calculadora possui conversores utilitários que não dependem de instância.  
**Tarefa:**  
- Crie a classe `Calculadora`.  
- Dentro dela, crie uma **static nested class** `Conversor` com métodos estáticos:  
  - `paraKm(double metros)`  
  - `paraCelsius(double fahrenheit)`  
- No `main`, use os métodos via `Calculadora.Conversor`.

### Exercício 6: Configurações Globais de Sistema
**Cenário:**  
Seu sistema precisa armazenar constantes de versão e nome da empresa.  
**Tarefa:**  
- Crie a classe `Sistema`.  
- Crie uma **classe estática** `Info` com atributos estáticos `VERSAO` e `EMPRESA`.  
- Mostre esses valores no `main` sem instanciar nada.


## Conceito: Classe Local (Local Class)

### Exercício 7: Saudação Condicional
**Cenário:**  
Um método precisa gerar mensagens localmente dependendo da hora do dia.  
**Tarefa:**  
- Dentro de um método `executar()`, crie uma **classe local** `Saudacao`.  
- Ela deve ter um método `dizer()` que retorna “Bom dia”, “Boa tarde” ou “Boa noite”.  
- Instancie-a dentro do próprio método.

### Exercício 8: Validador de Strings
**Cenário:**  
Um método deve validar textos de entrada sem expor essa lógica ao restante da classe.  
**Tarefa:**  
- Dentro de um método `processar(String s)`, crie a **classe local** `Validador`.  
- Ela deve ter método `valido()`, retornando se `s` não é nulo nem vazio.  
- Use a classe local para validar a entrada.

### Exercício 9: Calculadora de Soma Local
**Cenário:**  
Um método precisa somar dois números como operação interna.  
**Tarefa:**  
- No método `executarOperacao()`, crie uma **classe local** `Soma`.  
- Ela deve ter método `calcular(int a, int b)`.  
- Chame o método e mostre o resultado.


## Conceito: Classe Anônima

### Exercício 10: Runnable Personalizado
**Cenário:**  
Você quer rodar uma tarefa sem criar uma classe separada.  
**Tarefa:**  
- Crie uma instância de `Runnable` usando uma **classe anônima**.  
- No método `run()`, mostre “Executando tarefa…”.  
- Execute a tarefa.

### Exercício 11: Botão Simulado
**Cenário:**  
Um botão deve reagir quando clicado, mas sem criar uma classe só para isso.  
**Tarefa:**  
- Crie a interface `ClickListener` com método `onClick()`.  
- Instancie a interface usando **classe anônima**.  
- No método, exiba “Botão clicado!”.

### Exercício 12: Classe Base com Método Sobrescrito
**Cenário:**  
Uma classe base `Mensagem` tem um método `enviar()`.  
**Tarefa:**  
- Crie a classe `Mensagem` com método `enviar()`.  
- Instancie uma **classe anônima** estendendo `Mensagem` e sobrescrevendo `enviar()`.  
- Chame o método.