/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author samue
 */
public class FuncionarioTest {
    
    public FuncionarioTest(){
    }
    
    @Test
    public void testIdentificarFaixaIrpfPrimeiraFaixa() {
        Funcionario funcionario = new Funcionario("João", 850.00);
        assertEquals(FaixaIrpf.PRIMEIRA, funcionario.identificarFaixaIrpf());
    }
    
    @Test
    public void testCalculaIrpfPrimeiraFaixa() {
        Funcionario funcionario = new Funcionario("Maria", 850.00);
        assertEquals(0.0, funcionario.calculaIrpf(), 0.01);
    }
    
    @Test
    public void testIdentificarFaixaIrpfSegundaFaixa1() {
        Funcionario funcionario = new Funcionario("José", 1903.98);
        assertEquals(FaixaIrpf.PRIMEIRA, funcionario.identificarFaixaIrpf());
    }
    
    @Test
    public void testCalculaIrpfSegundaFaixa1() {
        Funcionario funcionario = new Funcionario("Carla", 1903.98);
        assertEquals(0.0, funcionario.calculaIrpf(), 0.01);
    }
    
    @Test
    public void testIdentificarFaixaIrpfSegundaFaixa2() {
        Funcionario funcionario = new Funcionario("Pedro", 1903.99);
        assertEquals(FaixaIrpf.SEGUNDA, funcionario.identificarFaixaIrpf());
    }
    
    @Test
    public void testCalculaIrpfSegundaFaixa2() {
        Funcionario funcionario = new Funcionario("Ana", 1903.99);
        assertEquals(0.0, funcionario.calculaIrpf(), 0.01); 
    }
    
    @Test
    public void testIdentificarFaixaIrpfSegundaFaixa3() {
        Funcionario funcionario = new Funcionario("Paula", 2000.00);
        assertEquals(FaixaIrpf.SEGUNDA, funcionario.identificarFaixaIrpf());
    }
    
    @Test
    public void testCalculaIrpfSegundaFaixa3() {
        Funcionario funcionario = new Funcionario("Roberto", 2000.00);
        assertEquals(7.20, funcionario.calculaIrpf(), 0.01);
    }
    
    @Test
    public void testIdentificarFaixaIrpfSegundaFaixa4() {
        Funcionario funcionario = new Funcionario("Sandra", 2826.65);
        assertEquals(FaixaIrpf.SEGUNDA, funcionario.identificarFaixaIrpf());
    }
    
    @Test
    public void testCalculaIrpfSegundaFaixa4() {
        Funcionario funcionario = new Funcionario("Carlos", 2826.65);
        assertEquals(69.20, funcionario.calculaIrpf(), 0.01);
    }
    
    @Test
    public void testIdentificarFaixaIrpfTerceiraFaixa1() {
        Funcionario funcionario = new Funcionario("Laura", 2826.66);
        assertEquals(FaixaIrpf.TERCEIRA, funcionario.identificarFaixaIrpf());
    }
    
    @Test
    public void testCalculaIrpfTerceiraFaixa1() {
        Funcionario funcionario = new Funcionario("Mariana", 2826.66);
        assertEquals(69.20, funcionario.calculaIrpf(), 0.01);
    }
    
    @Test
    public void testIdentificarFaixaIrpfTerceiraFaixa2() {
        Funcionario funcionario = new Funcionario("Ricardo", 3000.00);
        assertEquals(FaixaIrpf.TERCEIRA, funcionario.identificarFaixaIrpf());
    }
    
    @Test
    public void testCalculaIrpfTerceiraFaixa2() {
        Funcionario funcionario = new Funcionario("Fernanda", 3000.00);
        assertEquals(95.20, funcionario.calculaIrpf(), 0.01);
    }
    
    @Test
    public void testIdentificarFaixaIrpfTerceiraFaixa3() {
        Funcionario funcionario = new Funcionario("Gustavo", 3751.05);
        assertEquals(FaixaIrpf.TERCEIRA, funcionario.identificarFaixaIrpf());
    }
    
    @Test
    public void testCalculaIrpfTerceiraFaixa3() {
        Funcionario funcionario = new Funcionario("Patrícia", 3751.05);
        assertEquals(207.86, funcionario.calculaIrpf(), 0.01);
    }
    
    @Test
    public void testIdentificarFaixaIrpfQuartaFaixa1() {
        Funcionario funcionario = new Funcionario("Felipe", 3751.06);
        assertEquals(FaixaIrpf.QUARTA, funcionario.identificarFaixaIrpf());
    }
    
    @Test
    public void testCalculaIrpfQuartaFaixa1() {
        Funcionario funcionario = new Funcionario("Vanessa", 3751.06);
        assertEquals(207.86, funcionario.calculaIrpf(), 0.01);
    }
    
    @Test
    public void testIdentificarFaixaIrpfQuartaFaixa2() {
        Funcionario funcionario = new Funcionario("Henrique", 4000.00);
        assertEquals(FaixaIrpf.QUARTA, funcionario.identificarFaixaIrpf());
    }
    
    @Test
    public void testCalculaIrpfQuartaFaixa2() {
        Funcionario funcionario = new Funcionario("Aline", 4000.00);
        assertEquals(263.87, funcionario.calculaIrpf(), 0.01);
    }
    
    @Test
    public void testIdentificarFaixaIrpfQuartaFaixa3() {
        Funcionario funcionario = new Funcionario("Júlia", 4664.68);
        assertEquals(FaixaIrpf.QUARTA, funcionario.identificarFaixaIrpf());
    }
    
    @Test
    public void testCalculaIrpfQuartaFaixa3() {
        Funcionario funcionario = new Funcionario("Guilherme", 4664.68);
        assertEquals(413.42, funcionario.calculaIrpf(), 0.01);
    }
    
    @Test
    public void testIdentificarFaixaIrpfQuintaFaixa1() {
        Funcionario funcionario = new Funcionario("Juliana", 4664.69);
        assertEquals(FaixaIrpf.QUINTA, funcionario.identificarFaixaIrpf());
    }
    
    @Test
    public void testCalculaIrpfQuintaFaixa1() {
        Funcionario funcionario = new Funcionario("Marcos", 4664.69);
        assertEquals(413.42, funcionario.calculaIrpf(), 0.01);
    }
    
    @Test
    public void testIdentificarFaixaIrpfQuintaFaixa2() {
        Funcionario funcionario = new Funcionario("Camila", 5000.00);
        assertEquals(FaixaIrpf.QUINTA, funcionario.identificarFaixaIrpf());
    }
    
    @Test
    public void testCalculaIrpfQuintaFaixa2() {
        Funcionario funcionario = new Funcionario("Lucas", 5000.00);
        assertEquals(505.64, funcionario.calculaIrpf(), 0.01);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFInal() {
        Funcionario funcionario = new Funcionario("Samuel", -100);
        assertEquals(500, funcionario.calculaIrpf(), 0.01);
    }
}
