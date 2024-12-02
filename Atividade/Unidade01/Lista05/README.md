## Lista de Exercícios 05

### **Questão 1 - Implementação da Classe Ponto**

#### **Requisitos da Classe Ponto**

- **Construtores**:
  - O **construtor Ponto()** deve inicializar as coordenadas como **X=0** e **Y=0**.
  - O **construtor Ponto(int, int)** deve receber dois parâmetros (X e Y) para definir as coordenadas do ponto.

- **Métodos Getter e Setter**:
  - **setX() e getX()**: Setter e Getter para a coordenada X.
  - **setY() e getY()**: Setter e Getter para a coordenada Y.

- **Métodos Específicos**:
  - **identificarQuadrante()**: Retorna o quadrante do ponto (Primeiro, Segundo, Terceiro, Quarto ou NENHUM se o ponto estiver sobre os eixos X ou Y).
  - **estaIncidindoSobreX()**: Retorna true se o ponto estiver sobre o eixo X.
  - **estaIncidindoSobreY()**: Retorna true se o ponto estiver sobre o eixo Y.
  - **calcularDistancia(Ponto)**: Calcula e retorna a distância entre o ponto atual e o ponto passado como argumento, utilizando a fórmula da distância euclidiana:  
    \[
    d = \sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}
    \]
  - **calcularDistancia(Ponto, Ponto)**: Método estático que calcula a distância entre dois pontos passados como argumento.

#### **Enumeração Quadrante**
Crie uma enumeração `Quadrante` com os seguintes valores: `NENHUM, PRIMEIRO, SEGUNDO, TERCEIRO, QUARTO`.

#### **Documentação Javadoc**
Implemente a documentação Javadoc para os construtores e os métodos `identificarQuadrante()`, `estaIncidindoSobreX()`, `estaIncidindoSobreY()`, `calcularDistancia(Ponto)` e `calcularDistancia(Ponto, Ponto)`.

---

### **Questão 2 - Aplicação com GUI**

#### **Objetivo**:
Criar uma aplicação GUI para informar em que região do plano cartesiano se encontra um ponto, com base nas coordenadas X e Y fornecidas pelo usuário.

- **Interface**:
  - O usuário deve poder inserir as coordenadas **X** e **Y** do ponto.
  - Após clicar no botão **Avaliar**, a aplicação deve automaticamente verificar e marcar as regiões correspondentes (Primeiro, Segundo, Terceiro, Quarto, ou NENHUM) usando **JCheckBox**.
  - Os **JCheckBox** não devem ser editáveis pelo usuário, ou seja, devem ser somente visualizados, com a marcação feita automaticamente pela aplicação.

- **Reutilização da Classe Ponto**:
  - A classe **Ponto** da questão anterior deve ser utilizada para calcular o quadrante do ponto, e a interface GUI deve exibir essas informações para o usuário.

---

### **Resumo dos Passos para Implementação**:

1. **Classe Ponto**:
   - Defina os atributos **X** e **Y**, implemente os construtores, getters, setters e métodos de cálculo da distância e identificação do quadrante.
   - Implemente a enumeração `Quadrante` para representar os diferentes quadrantes do plano cartesiano.

2. **Classe App**:
   - Crie uma interface gráfica com campos de entrada para as coordenadas X e Y e **JCheckBox** para as regiões do plano cartesiano.
   - Utilize a classe **Ponto** para processar as coordenadas inseridas pelo usuário e atualizar os **JCheckBox** automaticamente com a região correspondente ao quadrante do ponto.

---

### **Conclusão**:
Esse exercício envolve a criação de uma classe para representar pontos no plano cartesiano e a utilização de uma GUI para interação com o usuário, permitindo a visualização das regiões do plano cartesiano. A reutilização da classe **Ponto** facilita o cálculo e a avaliação do quadrante em que o ponto se encontra.
