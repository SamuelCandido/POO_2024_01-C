/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Questao01;

import Questao01.ContaEspecial;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author samuel
 */
public class ContaEspecialTest {
    
    public ContaEspecialTest() {
    }
    
    @Test
    public void test01() {
        
        ContaEspecial conta1 = new ContaEspecial();
        conta1.setLimiteCredito(100);
        conta1.depositar(20);
        conta1.sacar(50);
        assertEquals(-30.00, conta1.getSaldo(), 0.01);  

    }
    @Test
    public void test02() {

    ContaEspecial conta1 = new ContaEspecial();
    conta1.setLimiteCredito(100);
    conta1.depositar(20);
    conta1.sacar(120);
    assertEquals(-100.00, conta1.getSaldo(), 0.01);  

}
    @Test(expected = RuntimeException.class)
    public void test03() {

    ContaEspecial conta1 = new ContaEspecial();
    conta1.setLimiteCredito(100);
    conta1.depositar(20);
    conta1.sacar(120.01);
    }
}
