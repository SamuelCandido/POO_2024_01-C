/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sjcandido
 */
public class Veiculo implements Relatorio{
    private String placa;
    private int KM;
    private double precoDiaria;
    private Categoria categoria;

    public Veiculo(String placa, int KM, double precoDiaria, Categoria categoria) {
        this.placa = placa;
        this.KM = KM;
        this.precoDiaria = precoDiaria;
        this.categoria = categoria;
    }

    
    
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String cor) {
        this.placa = placa;
    }

    public int getKM() {
        return KM;
    }

    public void setKM(int KM) {
        this.KM = KM;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double preco) {
        this.precoDiaria = precoDiaria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
    @Override
    public String imprimir(){            
        return null;        
    }
    
    
}
