/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao02;
import java.util.ArrayList;

/**
 *
 * @author samuel
 */
class Programador extends Funcionario {
    private ArrayList<String> linguagens = new ArrayList<>();

    public Programador(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public void incluirLinguagem(String linguagem) {
        linguagens.add(linguagem);
    }

    public void removerLinguagem(String linguagem) {
        linguagens.remove(linguagem);
    }

    public ArrayList<String> getLinguagens() {
        return linguagens;
    }

    @Override
    public double calcularSalario() {
        double salario = salarioBase;
        if (linguagens.contains("Java")) {
            salario += salarioBase * 0.20;
        }
        return salario;
    }
}
