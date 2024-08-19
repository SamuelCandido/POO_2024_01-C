package questao02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author samue
 */
public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0.0; 
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

public boolean depositar(double valor) {
        if (valida(valor, false)) {
            saldo += valor;
            System.out.println(titular + " depositou R$ " + valor + ". Saldo atual: R$ " + saldo);
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valida(valor, true)) { 
            saldo -= valor;
            System.out.println(titular + " sacou R$ " + valor + ". Saldo atual: R$ " + saldo);
            return true;
        }
        return false;
    }

    public boolean transferir(ContaBancaria contaDestino, double valor) {
        if (valida(valor, true)) {
            boolean sucesso = contaDestino.depositar(valor);
            if (sucesso) {
                saldo -= valor;
                System.out.println(titular + " transferiu R$ " + valor + " para " + contaDestino.getTitular() + ". Saldo atual: R$ " + saldo);
            } else {
                System.out.println("Erro na transferência. O valor não foi debitado.");
            }
            return sucesso;
        }
        return false;
    }

    private boolean valida(double valor, boolean verificaSaldo) {
        if (valor < 0) {
            System.out.println("Erro: O valor não pode ser negativo.");
            return false;
        } 
        if (valor == 0) {
            System.out.println("Erro: O valor não pode ser zero.");
            return false;
        }   
        if (verificaSaldo && saldo < valor) {
            System.out.println(titular + " tentou transferir R$ " + valor + " , mas o saldo é insuficiente.");
            return false;
        }
        return true;
    }
}