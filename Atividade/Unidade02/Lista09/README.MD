# Lista de Exercícios 9 - Resumo Objetivo

## Questão 1: Implementação do Diagrama de Classes

### Classes Envolvidas:
1. **ContaBancaria**:
   - **Métodos**:
     - `setSaldo()`: Define o saldo da conta. O modificador de acesso deve ser **protected** para permitir que subclasses possam reutilizá-lo, mas não ser público.
     - **Atributos**:
       - `saldo`: Armazena o saldo da conta.
   - **Método Sacar()**: Define a lógica para saques na conta bancária.

2. **ContaEspecial** (subclasse de ContaBancaria):
   - **Métodos**:
     - `sacar()`: Sobrescreve o método `sacar()` da superclasse para permitir saques que ultrapassem o saldo, mas não excedam o limite de crédito.
     - **Atributos**:
       - `limiteCredito`: Limite de crédito disponível na conta especial.
   
### Funcionalidade:
- A **ContaEspecial** permite saques além do saldo, respeitando o limite de crédito. O método `sacar()` deve ser sobrescrito para lidar com esse comportamento.

## Questão 2: Plano de Testes para a Classe ContaEspecial

### Casos de Teste:

| **Caso** | **Descrição** | **Entrada** | **Saída Esperada** |
| --- | --- | --- | --- |
| **1** | Conferir se o método `sacar()` permite sacar valor superior ao saldo | ContaEspecial com limite de crédito de R$ 100,00, depósito de R$ 20,00, saque de R$ 50,00 | `getSaldo()` retorna -R$ 30,00 |
| **2** | Conferir se o método `sacar()` permite sacar valor superior ao saldo mas inferior ao limite | ContaEspecial com limite de crédito de R$ 100,00, depósito de R$ 20,00, saque de R$ 120,00 | `getSaldo()` retorna -R$ 100,00 |
| **3** | Conferir se o método `sacar()` impede saques superiores ao saldo e limite de crédito | ContaEspecial com limite de crédito de R$ 100,00, depósito de R$ 20,00, saque de R$ 120,01 | Exceção `RuntimeException` lançada |

## Questão 3: Histórico de Movimentação de Conta Bancária

### Classes Envolvidas:
1. **ContaBancaria**:
   - **Métodos**:
     - `depositar()`: Adiciona um depósito à conta e cria um objeto **Movimento** do tipo crédito.
     - `sacar()`: Realiza um saque e cria um objeto **Movimento** do tipo débito.
     - `getMovimentos()`: Retorna a lista de movimentos (débitos e créditos) da conta.
   
2. **Movimento**:
   - **Atributos**:
     - `tipo`: Tipo de movimento (débito ou crédito).
     - `valor`: Valor do movimento.
     - `dataHora`: Data e hora do movimento (utilizando `LocalDate` e `LocalTime` da API Java).
   - **Construtores**:
     - O construtor deve automaticamente atribuir a data e hora atuais usando `LocalDate.now()` e `LocalTime.now()`.

3. **Cliente**: Representa o cliente associado à conta bancária.

### Funcionalidade:
- O método `depositar()` e `sacar()` da **ContaBancaria** devem criar objetos da classe **Movimento** e adicioná-los à lista **movimentos** da conta, com data e hora atuais.
- **LocalDate** e **LocalTime** são usados para registrar a data e hora de cada movimento.

## Questão 4: Validação de Funcionamento da Classe ContaEspecial

### Plano de Testes:

| **Caso** | **Descrição** | **Entrada** | **Saída Esperada** |
| --- | --- | --- | --- |
| **1** | Conferir se o método `sacar()` gera movimento de crédito e débito | Criar conta bancária, depositar R$ 1000,00, sacar R$ 250,00 | `getMovimentos()` retorna lista com 2 elementos: um de crédito de R$ 1000,00 e outro de débito de R$ 250,00 |

### Detalhes da Implementação:
- **Movimento**:
  - A cada depósito e saque, o histórico de **Movimento** é atualizado com o valor e a data/hora da operação.
  - Para verificar, o método `getMovimentos()` deve retornar a lista de **Movimento** após cada operação.

## Observação Importante:
- Utilize **LocalDate** e **LocalTime** para registrar data e hora de cada movimento.
- **RuntimeException** deve ser lançada quando um saque excede o saldo e o limite de crédito da conta especial.
