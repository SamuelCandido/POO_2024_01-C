/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author sjcandido
 */
public class Imovel {
    private String endereco;
    private int area;
    private Bairro bairro;
    private Finalidade finalidade;

    public Imovel(Bairro bairro){
        this.bairro = bairro;
    } 
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        if (area < 0) {
            throw new IllegalArgumentException("A área não pode ser negativa.");
        }
        this.area = area;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }
    
    public double calcularIPTU(){
        if (bairro == null) {
            throw new IllegalArgumentException("O bairro deve ser especificado.");
        }
        if (bairro.getCoeficienteIptu() < 0) {
            throw new IllegalArgumentException("O coeficiente do IPTU não pode ser negativo.");
        }
        if (finalidade == null) {
            throw new IllegalArgumentException("A finalidade deve ser especificada.");
        }
        if (area == 0) {
            throw new IllegalArgumentException("A área deve ser especificada.");
        }
        
        float valorBase;

        switch (finalidade) {
            case Finalidade.RESIDENCIAL:
                valorBase = (float) (area * 1.00);
                break;
            case Finalidade.COMERCIAL:
                if (area <= 100) {
                    valorBase = (float) 500.00;
                } else if (area <= 400) {
                    valorBase = (float) 1000.00;
                } else {
                    valorBase = (float) (area * 2.55);
                }
                break;
            case Finalidade.INDUSTRIAL:
                if (area <= 2000) {
                    valorBase = (float) 1000.00;
                } else {
                    valorBase = (float) (area * 0.55);
                }
                break;
            default:
                throw new IllegalArgumentException("Finalidade inválida.");
        }

        return valorBase * bairro.getCoeficienteIptu(); 
    }
    
    
    
    
}
