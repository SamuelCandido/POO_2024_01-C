/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author samuel
 */
public class PrevidenciaPrivada extends Investimento {
    private double valor;

    public PrevidenciaPrivada(double valor, double saldo) {
        super(saldo);
        this.valor = valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void investir() {
        this.valor *= 1.05; // Valor fixo de 5%
    }

    @Override
    public double calcularValorPagar() {
        return valor;
    }
}
