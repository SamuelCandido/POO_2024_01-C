package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sjcandido
 */
public class Bairro {
    private String nome;
    private float coeficienteIptu;
    
    public Bairro(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCoeficienteIptu() {
        return coeficienteIptu;
    }
    
    public void setCoeficienteIptu(float coeficienteIptu) {
        this.coeficienteIptu = coeficienteIptu;
    }
}
