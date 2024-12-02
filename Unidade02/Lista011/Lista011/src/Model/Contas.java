/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author samuel
 */
public class Contas {
    private ArrayList<Pagavel> contas = new ArrayList<>();

    public void incluirConta(Pagavel conta) {
        contas.add(conta);
    }

    public double calcularTotalContas() {
        double total = 0;
        for (Pagavel conta : contas) {
            total += conta.calcularValorPagar();
 }
        return total;
    }

    public void exibirContas() {
        for (Pagavel conta : contas) {
            if (conta instanceof PrevidenciaPrivada) {
                PrevidenciaPrivada pp = (PrevidenciaPrivada) conta;
                System.out.println("Previdencia Privada: " + pp.calcularValorPagar());
                System.out.println("Saldo da Previdencia Privada: " + pp.getSaldo());
            } else {
                System.out.println(conta.getClass().getSimpleName() + ": " + conta.calcularValorPagar());
            }
        }
    }
}
