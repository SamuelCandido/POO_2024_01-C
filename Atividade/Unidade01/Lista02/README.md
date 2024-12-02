# Projeto no NetBeans

Para cada questão abaixo, crie um pacote no projeto.

---

## **Questão 1**

Partindo da solução da questão 4 da lista de exercícios 01:

1. Redesenhe o diagrama de classes, adaptando a classe **Pessoa** para que utilize o conceito de **encapsulamento**.
2. Solucione novamente a questão 4 (da lista de exercícios 01) utilizando a nova classe **Pessoa**.

---

## **Questão 2**

Para representar contas bancárias, implemente o seguinte diagrama de classes:

1. O método `getNumero()` deve ser o **getter** da variável de instância `numero`.
2. O método `setNumero()` deve ser o **setter** da variável de instância `numero`.
3. O método `getTitular()` deve ser o **getter** da variável de instância `titular`.
4. O método `setTitular()` deve ser o **setter** da variável de instância `titular`.
5. O método `getSaldo()` deve ser o **getter** da variável de instância `saldo`.
6. O método `depositar()` deve:
   - Acrescentar valores ao saldo da conta bancária.
   - Recusar tentativas de depósito com valor negativo.
7. O método `sacar()` deve:
   - Subtrair valores do saldo da conta bancária.
   - Recusar tentativas de saque com valor negativo.
   - Recusar tentativas de saque que causem o saldo ficar negativo.
8. O método `transferir()` deve:
   - Transferir valores de uma conta bancária para outra.
   - Considerar que:
     - A conta de origem é aquela onde será invocado o método `transferir()`.
     - A conta de destino será fornecida como argumento para o método.
     - O valor a ser transferido será também fornecido como argumento.

---

## **Aplicação**

1. Crie um programa (classe **App**) que solicite ao usuário:
   - O número e o titular de duas contas bancárias.
2. Realize as seguintes operações:
   - Depósitos na **primeira conta**:  
     a. **R$ 1.000,00**  
     b. **R$ 700,00**
   - Depósitos na **segunda conta**:  
     a. **R$ 5.000,00**
   - Saque na **segunda conta**:  
     a. **R$ 3.000,00**
   - Transferência:  
     a. **R$ 1.800,00** da segunda conta para a primeira conta.
3. Exiba:  
   - O titular de cada conta.  
   - O saldo respectivo de cada conta.  

---

## **Observações Importantes**

- Certifique-se de que todos os atributos das classes sejam **privados** e que os métodos **getter** e **setter** sejam utilizados para acessá-los.
- Valide os dados inseridos pelo usuário para evitar valores inválidos, como números negativos ou strings vazias.
- Utilize **tratamento de exceções** para lidar com possíveis erros nas operações, como tentativa de saque ou transferência com saldo insuficiente.
- Estruture seu código com clareza, separando responsabilidades por classes e métodos.

---

## **Sugestão de Estrutura de Pastas no Projeto**

- **pacote1**: Solução da **Questão 1** (incluindo classe **Pessoa** encapsulada e nova implementação da questão 4).
- **pacote2**: Solução da **Questão 2**, incluindo as classes de conta bancária e o programa **App**.
