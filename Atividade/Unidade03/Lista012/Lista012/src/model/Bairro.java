/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Samuel
 */

public class Bairro {
    private String nome;
    private double iptu;

    public Bairro(String nome, double iptu) {
        if (iptu < 0) {
            throw new IllegalArgumentException("Valor nao pode ser negativo.");
        } 
        this.nome = nome;
        this.iptu = iptu;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCoeficienteIptu() {
        return iptu;
    }

    public void setCoeficienteIptu(double iptu) {
    if (iptu <= 0) {
        throw new IllegalArgumentException("O coeficiente do IPTU deve ser maior que zero.");
    }
    this.iptu = iptu;
    }
}
