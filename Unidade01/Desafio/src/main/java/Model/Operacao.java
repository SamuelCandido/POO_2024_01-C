/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Model;

public class Operacao {
    private double numA;
    private double numB;

    public Operacao() {
        this.numA = 0.0;
        this.numB = 0.0;
    }

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }

    public double mais() {
        return numA + numB;
    }

    public double menos() { 
        return numA - numB;
    }

    public double vezes() {
        return numA * numB;
    }

    public double dividido() { 
        return numA / numB;
    }

    public double porcentagem(double numA, double numB) {
        return (numA / 100) * numB;
    }
}
