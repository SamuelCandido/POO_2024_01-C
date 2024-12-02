# Lista de Exercícios 04 - Resumo

## **Questão 1: Implementação da Classe Retângulo**
- Construtores:
  - **Retangulo()**: Inicializa altura e comprimento com 0.
  - **Retangulo(int, int)**: Define altura e comprimento com valores fornecidos.
- Métodos:
  - **setAltura()** e **setComprimento()**:
    - Não aceitam valores ≤ 0.
    - Lançam exceções com mensagens apropriadas para valores inválidos.
  - **getAltura()** e **getComprimento()**: Retornam altura e comprimento.
  - **calcularPerimetro()**: Retorna o perímetro.
  - **calcularArea()**: Retorna a área.
- **Javadoc**: Documentar construtores e métodos principais.

---

## **Questão 2: Programa para Entrada e Saída de Dados**
- Criação de um programa (`AppQuestao2Ui`) para:
  - Solicitar altura e comprimento via `JOptionPane.showInputDialog()`.
  - Calcular área e perímetro.
  - Exibir os resultados com `JOptionPane.showMessageDialog()`.

---

## **Questão 3: Programa com Construtor Parametrizado**
- Similar à questão anterior, mas utiliza o construtor `Retangulo(int, int)`.
- Implementado na classe `AppQuestao3Ui`.

---

## **Questão 4: Interface Gráfica para Cálculos**
- Aplicação GUI para:
  - Entrada de altura e comprimento em **JTextField**.
  - Exibição de área e perímetro em **JLabel**.
  - Botão **Calcular** para executar os cálculos.
  - Botão **Limpar** para resetar campos e resultados.
- **Classe Retangulo** (da Questão 1) usada para os cálculos.