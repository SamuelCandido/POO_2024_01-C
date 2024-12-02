/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sjcandido
 */
public class Locacao implements Relatorio{
    private int quantidadeDias;
    private Pessoa pessoa;
    public Veiculo veiculo;

    public Locacao(int quantidadeDias, Pessoa pessoa) {
        this.quantidadeDias = quantidadeDias;
        this.pessoa = pessoa;
    }
        
    
    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int diasLocacao) {
        this.quantidadeDias = quantidadeDias;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public double getValorTotal(){
        return veiculo.getPrecoDiaria() * getQuantidadeDias();
    }       
    
    @Override
    public String imprimir(){            
        return null;        
    }
    
}
