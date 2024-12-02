## Calculadora com Interface Gráfica em Java Swing

### Requisitos Funcionais

1. **Operações Básicas:**
   - Soma (+)
   - Subtração (-)
   - Multiplicação (*)
   - Divisão (/)

2. **Execução de Operações:**
   - A calculadora deve executar apenas uma operação por vez, seguindo a ordem inserida pelo usuário. Por exemplo, para a entrada "10+2*3", o cálculo inicial seria "10+2", cujo resultado seria exibido após o pressionamento do botão "=" (igual), e então o usuário pode complementar a operação com "*3".

3. **Opções de Limpeza:**
   - Botão "C" para apagar toda a operação.
   - Botão "CE" para apagar o último valor inserido, mantendo a operação anterior.

4. **Botão "=" (Igual):**
   - Ao ser clicado, exibe o resultado da conta fornecida pelo usuário. O resultado pode ser utilizado para uma próxima operação.

5. **Botões Numéricos:**
   - Botões de 0 a 9.
   - Botão "." para inserir casas decimais.

6. **Botões de Operação:**
   - Botões "+", "-", "*", "/" para adicionar operadores à expressão.

7. **Restrição de Edição:**
   - A calculadora deve ser operada exclusivamente pelos botões implementados na interface gráfica. O campo de texto das operações não deve ser editável diretamente.

### Exemplo de Implementação

Para implementar essa calculadora em Java Swing, você precisaria criar componentes JButton para cada botão numérico, de operação e de controle (como C, CE, e =), e um JTextField para exibir e capturar a entrada do usuário. A lógica das operações matemáticas e controle de entrada seria implementada em classes Java separadas, mantendo a separação de responsabilidades entre a interface gráfica e a lógica de negócio.

