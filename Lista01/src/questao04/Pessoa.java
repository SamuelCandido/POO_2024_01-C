/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao04;

/**
 *
 * @author vitor-nuvme
 */
class Pessoa {
    
    String nome;
    
    double peso;
    double altura;
    double imc;
    
    double calcularImc(){
        return peso / (altura*altura);
    }
}

