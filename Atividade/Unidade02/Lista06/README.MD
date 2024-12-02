# Lista de Exercícios 06 - Resumo Objetivo

## Questão 1:
- **Objetivo:** Implementar classe para calcular o Imposto de Renda (IRPF) de um funcionário.
- **Classe Funcionario:**
  - **Atributos:**
    - `nome`: Nome do funcionário.
    - `salario`: Salário do funcionário.
  - **Métodos principais:**
    - `identificarFaixaIrpf()`: Retorna a faixa em que o salário do funcionário se enquadra (1ª, 2ª, 3ª, 4ª, 5ª).
    - `calcularIrpf()`: Calcula o valor do imposto de renda com base nas faixas de salário e suas respectivas alíquotas.
  - **Cálculo do IRPF:** A tabela de faixas define valores salariais e alíquotas para calcular o imposto devido.
  - **Exceções:** O método setter de `salario` deve lançar exceção para valores negativos ou zero.

## Questão 2:
- **Objetivo:** Criar testes unitários usando JUnit para validar os métodos `identificarFaixaIrpf()` e `calcularIrpf()`.
  - Plano de testes para verificar se a classificação das faixas e o cálculo do IRPF estão corretos para diferentes salários.
  - Testes incluem entradas para cada faixa de salário e verificação da exceção para salários negativos.

## Questão 3:
- **Objetivo:** Criar uma aplicação gráfica que permite ao usuário informar seu salário e, ao clicar em "Avaliar", mostra a faixa e o valor do imposto devido.