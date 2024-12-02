/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author samuel
 */
public class Main {
    public static void main(String[] args) {
        Contas contas = new Contas();

        
        contas.incluirConta(new ContaAgua(100, 2.5));
        contas.incluirConta(new MensalidadeEnsino(20, 50));
        PrevidenciaPrivada previdencia = new PrevidenciaPrivada(1000, 5000);
        previdencia.investir();
        contas.incluirConta(previdencia);
        contas.incluirConta(new Investimento(2000));
        contas.exibirContas();
        
        System.out.println("");
        System.out.println("Valor total das contas: " + contas.calcularTotalContas());
       
    }
}