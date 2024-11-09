/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Win11
 */
public class Conta {
    private double saldo;
    private ArrayList<Lancamento> lancamentos;

    public Conta() {
        
    }
   
    public void adicionarLancamento(Lancamento lancamento){
    
    }
    
    public ArrayList<Lancamento> listarReceitas(){
        return null;
    }
    
    public ArrayList<Lancamento> listarDespesas(){
        return null;
    }
    
    public ArrayList<Lancamento> listarLancamentos(){
        return null;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public double consultaSaldoData(Date data){
        return 0;
    }
    
    public double consultaSaldo(){
        return 0;
    }
    
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
