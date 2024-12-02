# Lista de Exercícios 08 - Resumo Objetivo

## Questão 1: Diagrama de Classes para Ocupação de Alunos

### Classes Envolvidas:
1. **Turma**: Representa a turma de uma disciplina.
   - **Métodos:**
     - `incluirAluno()`: Adiciona um aluno à turma.
     - `removerAluno()`: Remove um aluno da turma.
     - `getAlunos()`: Retorna uma lista contendo todos os alunos da turma.
     - `obterAlunoMelhorNotaEnem()`: Localiza e retorna o aluno com a maior nota no ENEM. Caso haja empate, retorna um dos alunos com a maior nota.
   - **Atributos:**
     - `ArrayList<Aluno> alunos`: Lista contendo todos os alunos da turma.

2. **Aluno**: Representa os dados de um aluno.
   - **Atributos**:
     - `nome`: Nome do aluno.
     - `notaEnem`: Nota do aluno no ENEM.

### Detalhes da Implementação:
- A classe **Turma** deve utilizar um `ArrayList<Aluno>` para manter a lista de alunos.
- Métodos como `incluirAluno()` e `removerAluno()` devem adicionar e remover alunos dessa lista.
- O método `obterAlunoMelhorNotaEnem()` deve iterar pela lista e retornar o aluno com a maior nota no ENEM.

## Questão 2: Implementação de Aplicação GUI

### Funcionalidades:
1. **Tela Principal**:
   - Campos para definir os dados da turma e do professor que leciona a disciplina.
   - Botão “Incluir aluno” que abre uma nova tela para adicionar um aluno.
   - Botão “Mostrar relatório” que exibe o relatório com a lista de alunos.

2. **Tela de Inclusão de Aluno**:
   - Ao clicar em “Incluir aluno”, uma nova tela deve aparecer para o usuário informar os dados do aluno.
   - Quando o botão “Confirmar” for pressionado, o aluno deve ser adicionado à turma.
   - O botão “Cancelar” fecha a tela sem adicionar o aluno.

3. **Tela de Relatório**:
   - Ao clicar em “Mostrar relatório”, exibe-se uma nova tela com o relatório de todos os alunos na turma.

4. **Exibição de Enumerações**:
   - Para exibir valores de uma enumeração no `textArea`, use o comando:
     ```java
     taTexto.append(disciplina.getTurno().toString());
     ```
   - Este comando converte a enumeração do turno (ou outra enumeração relevante) para string e adiciona ao `textArea`.

### Passos para Implementação:
1. **Definir as Classes**:
   - Crie as classes **Turma** e **Aluno** com os métodos e atributos descritos na questão 1.
   
2. **Interface Gráfica**:
   - Utilize o **NetBeans** para criar uma aplicação GUI.
   - Crie telas com os campos necessários para entrada de dados e exibição de relatórios.
   - Implemente os botões e funcionalidades de inclusão e exibição de alunos conforme descrito.

3. **Relatório**:
   - Exiba a lista de alunos e, caso necessário, utilize um `textArea` para mostrar as informações da turma, como o turno da disciplina.
