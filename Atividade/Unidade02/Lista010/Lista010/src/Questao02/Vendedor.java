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
class Vendedor extends Funcionario {
    private double percentualComissao;
    private ArrayList<Venda> vendas = new ArrayList<>();

    public Vendedor(String nome, double salarioBase, double percentualComissao) {
        super(nome, salarioBase);
        this.percentualComissao = percentualComissao;
    }

    public void incluirVenda(Venda v) {
        vendas.add(v);
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }       

    @Override
    public double calcularSalario() {
        double totalVendas = 0;
        for (Venda v : vendas) {
            totalVendas += v.getValor();
        }
        return salarioBase + (totalVendas * getPercentualComissao() / 100);
    }
}
