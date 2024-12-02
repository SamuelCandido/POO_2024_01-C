# Lista de Exercícios 10 - Resumo Objetivo

## Questão 1: Programa para Calcular a Área de Figuras Geométricas

### Funcionalidade:
O programa deve calcular a área de quadrados, retângulos, triângulos e círculos, dependendo da escolha do usuário. 

### Fórmulas:
1. **Área do Quadrado**: 
   - Fórmula: \( A = lado^2 \)
   - Onde "lado" é o comprimento de um dos lados do quadrado.

2. **Área do Retângulo**: 
   - Fórmula: \( A = largura \times altura \)
   - Onde "largura" e "altura" são as medidas do retângulo.

3. **Área do Triângulo**: 
   - Fórmula de Herão: \( A = \sqrt{p \times (p - a) \times (p - b) \times (p - c)} \)
   - Onde \( p = \frac{a + b + c}{2} \), e "a", "b" e "c" são os lados do triângulo.

4. **Área do Círculo**: 
   - Fórmula: \( A = \pi \times r^2 \)
   - Onde "r" é o raio do círculo.

### Diagrama de Classes:
- **Classe FiguraGeometrica** (classe base):
  - Método `calcularArea()` (abstrato).
  
- **Classe Quadrado, Retângulo, Triângulo, Circulo** (subclasses):
  - Cada uma implementa o método `calcularArea()` de forma diferente, usando a fórmula específica para sua área.

### Funcionalidade:
- O usuário escolhe a figura e fornece os dados necessários (como lados, raio ou altura).
- O programa calcula e exibe a área correspondente à figura escolhida.

---

## Questão 2: Quadro de Funcionários de uma Empresa

### Funcionalidade:
O programa representa os funcionários da empresa, possibilitando calcular a despesa total com salários, incluindo comissões e benefícios.

### Classes Envolvidas:
1. **Classe Funcionario**:
   - Atributos: `nome`, `salarioBase`.
   - Método `calcularSalario()` (abstrato): Cada subclasse implementa seu cálculo específico de salário.

2. **Classe Vendedor** (subclasse de Funcionario):
   - Atributos: `percentualComissao`, `vendasRealizadas`.
   - Método `calcularSalario()`: Calcula o salário com base no salário base, comissão e vendas realizadas.

3. **Classe Programador** (subclasse de Funcionario):
   - Atributos: `linguagensConhecidas`.
   - Método `calcularSalario()`: Calcula o salário com o adicional de 20% se o programador conhece Java.

4. **Classe DemaisFuncionario** (subclasse de Funcionario):
   - Método `calcularSalario()`: Calcula o salário base sem modificações.

5. **Classe Empresa**:
   - Atributo: Lista de funcionários.
   - Método `incluirFuncionario()`: Adiciona um funcionário à empresa.
   - Método `calcularCustosSalarios()`: Calcula o custo total com salários, utilizando polimorfismo para chamar o `calcularSalario()` de cada funcionário.

### Funcionamento:
- A **empresa** tem três tipos de funcionários: **Vendedor**, **Programador**, e **Demais Funcionários**.
- O salário dos **Vendedores** inclui uma comissão com base em suas vendas.
- O salário dos **Programadores** recebe um adicional de 20% se conhecerem a linguagem **Java**.
- O salário dos **Demais Funcionários** é igual ao salário base.

### Entrada de Dados:
- **Vendedores**: Nome, salário base, percentual de comissão, vendas realizadas.
- **Programadores**: Nome, salário base, linguagens conhecidas.
- **Demais Funcionários**: Nome, salário base.

### Saídas Esperadas:
1. **Custo Total de Salários**: A soma de todos os salários da empresa, considerando as comissões e benefícios.
2. **Lista de Funcionários e Seus Salários**: Exibe o nome e salário de todos os funcionários.
3. **Lista de Vendedores e Comissões**: Exibe o nome e comissão de cada vendedor.
4. **Lista de Programadores e Linguagens Conhecidas**: Exibe o nome e as linguagens que cada programador conhece.

### Exemplo de Funcionários:
1. **Vendedores**:
   - Luiz: Salário base R$ 1000, comissão de 10%, vendas de R$ 200 e R$ 100.
   - Paula: Salário base R$ 1200, comissão de 7%, vendas de R$ 500, R$ 350, e R$ 280.

2. **Programadores**:
   - Julio: Salário base R$ 1000, conhece C e Java.
   - Ana: Salário base R$ 1000, conhece Java e C#.
   - Anderson: Salário base R$ 1200, conhece Python.

3. **Demais Funcionários**:
   - José: Salário base R$ 1000.
   - Maria: Salário base R$ 1400.

### Observação Importante:
- O programa deve usar **polimorfismo** para calcular os salários, chamando o método `calcularSalario()` de forma apropriada para cada tipo de funcionário.
