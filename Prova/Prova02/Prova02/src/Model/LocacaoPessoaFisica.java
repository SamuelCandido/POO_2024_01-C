/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;




/**
 *
 * @author sjcandido
 */
public class LocacaoPessoaFisica extends Locacao{

    public LocacaoPessoaFisica(int quantidadeDias, Pessoa pessoa) {
        super(quantidadeDias, pessoa);
    }
    public Veiculo getVeiculo(){                                                            
        return null;                              
    }        
    
    @Override
    public double getValorTotal(){
        double total = veiculo.getPrecoDiaria() * getQuantidadeDias();
        return total - (total * 0.05);
    }
    
    
    @Override
    public String imprimir(){            
        return null;        
    }
}
