# Lista de Exercícios 11 - Questão 1

## Objetivo:
Implementar um programa utilizando interfaces para calcular valores de contas de despesas diversas (conta de água, mensalidade de ensino, e previdência privada). O programa deve demonstrar o uso de polimorfismo com interfaces e realizar operações sobre objetos de diferentes tipos.

## Diagrama de Classes:
### Classes e Interfaces:
1. **Interface Pagavel**:
   - Método `calcularValorPagar()`: Cada classe que implementar esta interface deverá calcular seu valor a pagar de acordo com a fórmula específica.

2. **Classe ContaAgua** (implementa `Pagavel`):
   - Atributos: 
     - `metrosCubicos`: quantidade de metros cúbicos consumidos.
     - `precoMetroCubico`: preço por metro cúbico de água.
   - Método `calcularValorPagar()`: Multiplica `metrosCubicos` por `precoMetroCubico` e retorna o valor a ser pago.

3. **Classe MensalidadeEnsino** (implementa `Pagavel`):
   - Atributos:
     - `nrCreditos`: número de créditos cursados.
     - `precoCredito`: preço por crédito.
   - Método `calcularValorPagar()`: Multiplica `nrCreditos` por `precoCredito` e retorna o valor da mensalidade.

4. **Classe PrevidenciaPrivada** (implementa `Pagavel`):
   - Atributos:
     - `valorMensal`: valor a ser pago mensalmente.
     - `saldo`: saldo da previdência privada.
   - Método `calcularValorPagar()`: Retorna o `valorMensal` (a quantidade fixa a ser paga todo mês).
   - Método `mostrarSaldo()`: Retorna o `saldo` da previdência privada.

5. **Classe Contas**:
   - Atributo: `List<Pagavel> contas` (lista de objetos que implementam a interface `Pagavel`).
   - Método `incluirConta(Pagavel conta)`: Adiciona uma conta à lista de contas.
   - Método `calcularTotalContas()`: Soma os valores de todas as contas da lista e retorna o total.
   - Método `exibirContas()`: Exibe o valor de todas as contas. Se for uma conta de previdência privada, também exibe o saldo.

## Passos para Implementação:
1. **Interface `Pagavel`**:
   - Definir o método `calcularValorPagar()`.

2. **Classes `ContaAgua`, `MensalidadeEnsino`, `PrevidenciaPrivada`**:
   - Implementar a interface `Pagavel` em cada uma dessas classes.
   - Cada classe deve calcular o valor a pagar de acordo com a sua própria fórmula (conta de água, mensalidade, previdência).

3. **Classe `Contas`**:
   - Manter uma lista de contas (`Pagavel`).
   - Implementar os métodos para adicionar contas e calcular o total.

4. **Programa Principal**:
   - Criar instâncias de `ContaAgua`, `MensalidadeEnsino`, e `PrevidenciaPrivada`.
   - Adicionar essas instâncias à lista de contas usando `incluirConta()`.
   - Chamar `calcularTotalContas()` para exibir o total.
   - Chamar `exibirContas()` para exibir os detalhes de cada conta (incluso saldo de previdência, se houver).
