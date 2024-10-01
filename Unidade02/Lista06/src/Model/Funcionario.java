/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author samuel
 */
public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario; 
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public FaixaIrpf identificarFaixaIrpf(){
        if (salario <= 0) {
            throw new IllegalArgumentException("Salário não pode ser menor ou igual a 0");
        } 
        
        else if (salario <= 1903.98) {
            return FaixaIrpf.PRIMEIRA; 
        } 
        
        else if (salario <= 2826.65) {
            return FaixaIrpf.SEGUNDA; 
        } 
        
        else if (salario <= 3751.05) {
            return FaixaIrpf.TERCEIRA;
        } 
        
        else if (salario <= 4664.68) {
            return FaixaIrpf.QUARTA; 
        } 
        
        else {
            return FaixaIrpf.QUINTA;
        }
    }
    
    public double calculaIrpf(){
        FaixaIrpf resposta = identificarFaixaIrpf();
        double imposto = 0.0;
        
        switch (resposta) {
            case PRIMEIRA:
                imposto = 0.0;
                break;
            case SEGUNDA:
                imposto = (salario - 1903.98) * 0.075;
                break;
            case TERCEIRA:
                imposto = (2826.65 - 1903.98) * 0.075 + (salario - 2826.65) * 0.15;
                break;
            case QUARTA:
                imposto = (2826.65 - 1903.98) * 0.075 + (3751.05 - 2826.65) * 0.15 + (salario - 3751.05) * 0.225;
                break;
            case QUINTA:
                imposto = (2826.65 - 1903.98) * 0.075 + (3751.05 - 2826.65) * 0.15 + (4664.68 - 3751.05) * 0.225 + (salario - 4664.68) * 0.275;
                break;
            default:
                throw new IllegalArgumentException("Erro nao esperado");
        }

        // Arredonda o imposto para duas casas decimais
        imposto = Math.round(imposto * 100.0) / 100.0;

        return imposto;
    }
}
