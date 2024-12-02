/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class App2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero da primeira conta: ");
        String numeroConta1 = scanner.nextLine();
        System.out.print("Digite o titular da primeira conta: ");
        String titularConta1 = scanner.nextLine();

        System.out.print("Digite o numero da segunda conta: ");
        String numeroConta2 = scanner.nextLine();
        System.out.print("Digite o titular da segunda conta: ");
        String titularConta2 = scanner.nextLine();
 
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNumero(numeroConta1);
        conta1.setTitular(titularConta1);
        
        ContaBancaria conta2 = new ContaBancaria();
        conta2.setNumero(numeroConta2);
        conta2.setTitular(titularConta2);

        System.out.println("");
        
        conta1.depositar(1000.00);
        conta1.depositar(700.00);

        conta2.depositar(5000.00);

        conta2.sacar(3000.00);
        
        conta2.transferir(conta1, 1800.00);

        System.out.println("");
        System.out.println("Titular da primeira conta: " + conta1.getTitular() + " - Saldo: R$ " + conta1.getSaldo());
        System.out.println("Titular da segunda conta: " + conta2.getTitular() + " - Saldo: R$ " + conta2.getSaldo());
        
        scanner.close();
    }
}