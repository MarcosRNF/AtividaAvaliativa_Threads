# Projeto: Calculadora com Threads em Java

## Descrição

Este projeto demonstra o uso de threads em Java para realizar operações matemáticas de forma concorrente. Utiliza sincronização para garantir a integridade dos dados ao acessar um recurso compartilhado.

## Estrutura do Projeto

O projeto é composto por três classes principais:

- **Contador**: Classe responsável por manter um contador sincronizado.
- **Calculadora**: Classe que implementa `Runnable` para executar operações matemáticas.
- **Main**: Classe que cria e gerencia as threads.

## Passo a Passo

1. **Classe Contador**

   A classe `Contador` contém um método sincronizado para incrementar o valor do contador.

2. **Classe Calculadora**

   A classe `Calculadora` implementa a interface `Runnable` e realiza uma operação matemática especificada.

3. **Classe Main**

   A classe `Main` cria e inicia as threads, e então exibe o valor final do contador.

## Como Executar o Projeto

### Compilar as Classes:

Compile as três classes: `Contador`, `Calculadora` e `Main`.

### Executar a Classe Main:

Execute a classe `Main` para iniciar as threads e realizar as operações matemáticas de forma concorrente.

## Funcionamento

- A classe `Main` cria quatro threads, cada uma realizando uma operação diferente (`add`, `sub`, `mul`, `div`).
- Cada thread incrementa um contador compartilhado após realizar sua operação.
- O método `incrementar` da classe `Contador` é sincronizado para evitar condições de corrida.
- A ordem de execução das threads pode variar, mas o valor final do contador será consistente devido à sincronização.
