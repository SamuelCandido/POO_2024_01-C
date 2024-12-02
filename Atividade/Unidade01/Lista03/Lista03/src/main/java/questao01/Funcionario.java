/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package questao01;

/**
 *
 * @author vitor-nuvme
 */
public class Funcionario {

    private String nome;
    private double salario;

     public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException ("Salario negativo");}
        else{
        this.salario = salario;
        }
    }
    
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
    
    public double calculaImposto(){
        double imposto = 0;
        
        if (salario > 1903.98 & salario <= 2826.65){
            imposto += (salario - 1903.98)* 0.075;
        }
        else if(salario > 2826.66 & salario <= 3751.05){
            imposto += (2826.65 - 1903.98)* 0.075;
            imposto += (salario - 2826.65)* 0.15;
        }
        
        else if (salario > 3751.05 & salario <= 4664.68){
            imposto += (2826.65 - 1903.98)* 0.075;
            imposto += (3751.05 - 2826.65)* 0.15;
            imposto += (salario - 3751.05)* 0.225;
        }
        
        else if (salario > 4664.68){
            imposto += (2826.65 - 1903.98)* 0.075;
            imposto += (3751.05 - 2826.65)* 0.15;
            imposto += (4664.68 - 3751.05)* 0.225;
            imposto += (salario - 4664.68)* 0.275;
        }
        
        return imposto;
    }
}
