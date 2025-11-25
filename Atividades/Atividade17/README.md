# ATIVIDADE 17

## Conceito: Tratamento de Exceções (try, catch, finally)

### Exercício 1: Divisão Segura
**Cenário:**  
Um sistema simples precisa dividir dois números fornecidos pelo usuário, mas valores inválidos podem causar erros.  
**Tarefa:**  
- Peça dois números ao usuário.  
- Use `try` para realizar a divisão.  
- Use `catch` para tratar qualquer exceção que ocorra.  
- No bloco `finally`, exiba a mensagem: “Operação finalizada.”  

### Exercício 2: Acesso Seguro ao Array  
**Cenário:**  
Um programa precisa acessar um índice específico de um array, mas o usuário pode informar uma posição inválida.  
**Tarefa:**  
- Crie um array com 5 números.  
- Solicite ao usuário um índice.  
- Use `try` para acessar o índice informado.  
- Capture `Exception` em `catch`.  
- No `finally`, mostre “Obrigado por usar o sistema.”  

### Exercício 3: Leitura de Texto com Tratamento  
**Cenário:**  
O usuário deve digitar um texto. Caso forneça `null` ou uma string vazia, o sistema não deve quebrar.  
**Tarefa:**  
- Leia uma string.  
- No `try`, exiba seu comprimento usando `length()`.  
- No `catch`, mostre uma mensagem amigável ao usuário.  
- No `finally`, imprima “Encerrando leitura.”  

## Conceito: Uso de Exceções Comuns do Java

### Exercício 4: Conversão de Número
**Cenário:**  
O sistema deve converter uma entrada de texto para número, mas a entrada pode ser inválida.  
**Tarefa:**  
- Leia uma string.  
- No `try`, converta para inteiro usando `Integer.parseInt()`.  
- Trate `NumberFormatException`.  
- Mostre ao usuário se a conversão foi bem-sucedida.  

### Exercício 5: Arquivo Inexistente
**Cenário:**  
O sistema precisa tentar abrir um arquivo chamado “dados.txt”.  
**Tarefa:**  
- No `try`, abra o arquivo usando `FileInputStream`.  
- Capture `FileNotFoundException`.  
- Capture também `IOException` genérica caso ocorra outro erro.  
- Mostre mensagens adequadas para cada tipo de exceção.  

### Exercício 6: Operação Aritmética Perigosa
**Cenário:**  
Um módulo simples realiza operações matemáticas, mas o cálculo pode gerar erros.  
**Tarefa:**  
- Leia dois números.  
- Realize uma divisão dentro do `try`.  
- Trate `ArithmeticException` caso ocorra divisão por zero.  
- Exiba a mensagem “Cálculo concluído” no `finally`.  

## Conceito: Criação de Exceções Personalizadas

### Exercício 7: Idade Inválida
**Cenário:**  
Um sistema precisa validar a idade informada para cadastro.  
**Tarefa:**  
- Crie a exceção personalizada `IdadeInvalidaException` (estendendo `Exception`).  
- No método `validarIdade(int idade)`, lance a exceção se a idade for menor que 0 ou maior que 120.  
- No `main`, capture e trate a exceção.  

### Exercício 8: Saldo Insuficiente
**Cenário:**  
Uma conta bancária deve impedir saques quando não houver saldo.  
**Tarefa:**  
- Crie a exceção `SaldoInsuficienteException`.  
- Na classe `Conta`, implemente `sacar(double valor)` lançando a exceção quando o saldo for insuficiente.  
- No `try/catch`, tente sacar um valor maior que o saldo.  

### Exercício 9: Nome Vazio
**Cenário:**  
Um cadastro deve impedir que nomes vazios sejam usados no sistema.  
**Tarefa:**  
- Crie a exceção `NomeVazioException` estendendo `RuntimeException`.  
- No método `cadastrar(String nome)`, lance a exceção se o nome for vazio ou `null`.  
- Teste a função no `main` com nomes válidos e inválidos.  