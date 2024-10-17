/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Questao02;

import Questao02.Movimento;
import Questao02.ContaEspecial;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

/**
 *
 * @author samuel
 */
public class ContaEspecialTest {
    
    public ContaEspecialTest() {
    }
    
    @Test
    public void teste01() {
        ContaEspecial conta = new ContaEspecial();
        conta.depositar(500);
        conta.sacar(200);
        ArrayList<Movimento> movimentos = conta.getMovimentos();
        assertEquals(2, movimentos.size());        
    }
}
