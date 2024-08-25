/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao04;

import java.awt.event.KeyEvent;
/**
 *
 * @author samue
 */
public class Retangulo04 {
    private int altura = 0;
    private int comprimento = 0;
    
    public Retangulo04(){
    
    }
     
    public int setValores(int altura, int comprimento) {
        int retorno = 0;
        
        if (altura < 0) {
            retorno = 1;
        }

        else if (comprimento < 0){
            retorno = 2;
        }
        
        if (altura < 0 && comprimento < 0){
            retorno = 3;
        }      
        
        else if (altura == 0){
            retorno = 4;
        }
        
        else if (comprimento == 0){
            retorno = 5;
        }
        
        if (altura == 0 && comprimento == 0){
            retorno = 6;
        }
                   
        if (retorno == 0){
            this.altura = altura;
            this.comprimento = comprimento;         
        }
        
        return retorno;      
    }
      
    public int calculaPerimetro(){     
        return (altura*2) + (comprimento*2);
    }
    
    public int calculaArea(){
        return altura * comprimento;    
    }
    
    public Retangulo04(int altura, int comprimento){
        setValores(altura, comprimento);     
    }
}