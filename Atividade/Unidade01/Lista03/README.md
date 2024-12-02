# Questão 1 - Cálculo de IRPF

## Resumo do Exercício

Implemente um programa para calcular o **Imposto de Renda (IRPF)** de 5 funcionários, com base no salário informado. 

### **Regras para Cálculo do IRPF**
1. **Faixas de Salário e Alíquotas**:
   - Até **R$ 1.903,98**: Isento.
   - De **R$ 1.903,99** a **R$ 2.826,65**: 7,5%.
   - De **R$ 2.826,66** a **R$ 3.751,05**: 15,0%.
   - De **R$ 3.751,06** a **R$ 4.664,68**: 22,5%.
   - Acima de **R$ 4.664,69**: 27,5%.

2. O IRPF é calculado somando os valores correspondentes a cada faixa de salário que o funcionário ultrapassa.

### **Funcionalidades do Programa**
- Solicitar ao usuário:
  - Nome e salário de 5 funcionários.
- Armazenar os dados em um **vetor**.
- Calcular o IRPF utilizando o método `calcularIrpf()`.
- Exibir uma **lista** com o nome, salário e IRPF de cada funcionário.

### **Regras de Validação**
- O salário deve ser positivo. Caso contrário, uma exceção será lançada.

### **Saída Esperada**
Uma tabela com os seguintes dados:
- Nome do funcionário.
- Salário informado.
- Valor do IRPF calculado.
+------------------+-------------+-------------+
| Nome             | Salário     | IRPF        |
+------------------+-------------+-------------+
| João Silva       | R$ 3.000,00 | R$ 95,20    |
| Maria Oliveira   | R$ 4.800,00 | R$ 450,00   |
| Pedro Santos     | R$ 1.500,00 | R$ 0,00     |
| Ana Costa        | R$ 2.000,00 | R$ 7,20     |
| Carlos Almeida   | R$ 3.500,00 | R$ 184,75   |
+------------------+-------------+-------------+