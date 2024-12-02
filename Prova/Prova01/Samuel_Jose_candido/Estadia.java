/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Periodo;
import javax.swing.JOptionPane;

/**
 *
 * @author sjcandido
 */
public class Estadia {
    private Periodo periodo;
    private int quantidadeDias;
    private int retornaPeriodos;

    Estadia(Periodo periodo, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //Construtor
    public void Estadia(Periodo periodo, int quantidadeDias){
        this.periodo = periodo;
        this.quantidadeDias = quantidadeDias;
    }
    
    //Metodo para pegar o enum e listar para conseguir dar um retorno
    public int retornaPeriodo(Periodo periodo){
        switch (periodo) {
            case ALTA_TEMPORADA -> {
                retornaPeriodos = 1;
                return retornaPeriodos;
            }
            case MEDIA_TEMPORADA -> {
                retornaPeriodos = 2;
                return retornaPeriodos;
            }
            case BAIXA_TEMPORADA -> {
                retornaPeriodos = 3;
                return retornaPeriodos;
            }
            default -> throw new AssertionError();
        }
    }
        
    public void setPeriodo(Periodo periodo) {
        if (periodo == null) {
            JOptionPane.showMessageDialog(null, "Periodo não pode ser vazio, ação não permitida!");
        }
        else{
            this.periodo = periodo;
        }
    }

    public void setQuantidadeDias(int quantidadeDias) {
        if (retornaPeriodos == 1){
            JOptionPane.showMessageDialog(null, "LEMBRETE. Periodo de alta temporada. Quantidade de dias deve ser no minimo 5");
            if (quantidadeDias <= 4){
               JOptionPane.showMessageDialog(null, "Quantidade de dias deve ser no minimo 5");     
            }
            else{
                this.quantidadeDias = quantidadeDias;
            }                     
        }
        else{
            if (quantidadeDias <= 0){
               JOptionPane.showMessageDialog(null, "Não permitido valor menor que 0");     
            }
            else{
                this.quantidadeDias = quantidadeDias;
            }
        }
    }
    
    public Periodo getPeriodo() {
        return periodo;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }
    
    //Metodo para calcular o preco a pagar
    //O certo seria passar o Periodo periodo mas n consigo retorna 
    public float precoPagar(int retornaPeriodos, int quantidadeDias){
        float valorPagar = (float) 150.00;
        
        
        if(retornaPeriodos == 3){
            valorPagar = valorPagar - (valorPagar *= 0.30);
            valorPagar = valorPagar * quantidadeDias;
            return valorPagar;
        }
        
        else if(retornaPeriodos == 2){
            valorPagar = valorPagar * quantidadeDias;
            return valorPagar;
        }
        
        else if(retornaPeriodos == 1){
            valorPagar = valorPagar + (valorPagar *= 0.20);
            valorPagar = valorPagar * quantidadeDias;
            return valorPagar;
        }
        
        if (quantidadeDias == 1){
            valorPagar = valorPagar + (valorPagar *= 0.05);
            valorPagar = valorPagar * quantidadeDias;
            return valorPagar;
        }
        
        if (quantidadeDias >= 7 && retornaPeriodos == 3){
            valorPagar = valorPagar - (valorPagar *= 0.02);
            valorPagar = valorPagar * quantidadeDias;
            return valorPagar;
        }
        
        return 0;
    }
        
}
    
  