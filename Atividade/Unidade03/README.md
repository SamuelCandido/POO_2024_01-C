## Lista de Exercícios 12

### Questão 1
**Objetivo:** Exercitar o tratamento de exceções em métodos de cálculo.

1. **Alteração no método `setArea()`** da classe **Imovel**:
   - Impedir que áreas de imóveis sejam definidas com valores negativos ou zero.
   
2. **Alteração no método `calcularIptu()`** da classe **Imovel**:
   - Impedir o cálculo do IPTU quando a finalidade do imóvel não estiver definida.
   
3. **Alteração no método `setCoeficiente()`** da classe **Bairro**:
   - Impedir que coeficientes negativos ou zero sejam definidos.

4. **Exceções específicas**:
   - Quando um erro ocorrer ao calcular o IPTU, deve ser lançada uma exceção.
   - Utilizar `JOptionPane.showMessageDialog` para exibir as mensagens de erro de forma gráfica.

5. **Tratamento de exceções**:
   - Tratar exceções do tipo `NumberFormatException` caso o usuário digite dados inválidos nos campos de texto (`JTextField`).

---

### Questão 2
**Objetivo:** Criar uma classe `Teclado` para leitura de dados com validação.

1. **Classe `Teclado`**:
   - Implementar métodos de leitura para garantir que os dados digitados pelo usuário sejam do tipo esperado.
   
2. **Métodos da classe `Teclado`**:
   - **`lerInt()`**: Deve ler um número inteiro. Caso o valor não seja um número inteiro, o programa deve insistir até que o valor seja válido.
   - **`lerBoolean()`**: O usuário pode digitar "sim", "verdadeiro", "positivo" ou "s" para retornar `true`. Para "não", "falso", "negativo" ou "n", deve retornar `false`. Para qualquer outro valor, deve insistir para que o usuário digite corretamente.
