/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao01;

/**
 *
 * @author samue
 */
public class Retangulo {
    private int altura = 0;
    private int comprimento = 0;
    
    public Retangulo(){
    
    }
    
    public Retangulo(int altura, int comprimento){
        this.altura = altura;
        this.comprimento = comprimento;
        
    }

    public int getAltura() {
        return altura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setAltura(int altura) {
        if (altura < 0) {
            throw new IllegalArgumentException ("Valor incorreto para altura: " + getAltura());}
        else{
        this.altura = altura;
        }
    }
    public void setComprimento  (int comprimento) {
        if (comprimento < 0) {
            throw new IllegalArgumentException ("Valor incorreto para comprimento: " + getAltura());}
        else{
        this.comprimento = comprimento;
        }
    }
    
    int calculaPerimetro(){     
        return (altura*2) + (comprimento*2);
    }
    
    int calculaArea(){
        return altura * comprimento;    
    }
    
}
