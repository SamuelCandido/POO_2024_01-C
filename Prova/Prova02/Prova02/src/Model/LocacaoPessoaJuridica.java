/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author sjcandido
 */
public class LocacaoPessoaJuridica extends Locacao{
    private ArrayList<Veiculo> veiculos;

    public LocacaoPessoaJuridica(int quantidadeDias, Pessoa pessoa) {
        super(quantidadeDias, pessoa);
    }
    
    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }
    
    @Override
    public double getValorTotal(){
        double total = veiculo.getPrecoDiaria() * getQuantidadeDias();
        return total - (total * 0.10);
    }
    
    
    @Override
    public String imprimir(){            
        return null;        
    }
}
