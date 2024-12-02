/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

import org.junit.Test;
import static org.junit.Assert.*;
import Model.Finalidade;
import Model.Imovel;

/**
 *
 * @author sjcandido
 */
public class ImovelTest {
    
    Bairro bairro = new Bairro("Centro");
    
    public ImovelTest() {
    }

    //nao consegui fazr os de erro
    
    //Testes sem caso de erro
    @Test
    public void testCalculoIPTUResidencial() {
        Imovel imovel = new Imovel(bairro);
        imovel.setArea(400);
        bairro.setCoeficienteIptu(1);
        imovel.setFinalidade(Finalidade.RESIDENCIAL);
        assertEquals(400.00, imovel.calcularIPTU(), 0.0001);
    }

    @Test
    public void testCalculoIPTUComercialAte100() {
        Imovel imovel = new Imovel(bairro);
        imovel.setArea(80);
        bairro.setCoeficienteIptu(1);
        imovel.setFinalidade(Finalidade.COMERCIAL);
        assertEquals(500.00, imovel.calcularIPTU(), 0.0001);
    }

    @Test
    public void testCalculoIPTUComercialEntre100e400() {
        Imovel imovel = new Imovel(bairro);
        imovel.setArea(250);
        bairro.setCoeficienteIptu(1);
        imovel.setFinalidade(Finalidade.COMERCIAL);
        assertEquals(1000.00, imovel.calcularIPTU(), 0.0001);
    }

    @Test
    public void testCalculoIPTUComercialAcima400() {
        Imovel imovel = new Imovel(bairro);
        imovel.setArea(500);
        bairro.setCoeficienteIptu(1);
        imovel.setFinalidade(Finalidade.COMERCIAL);
        assertEquals(1275.00, imovel.calcularIPTU(), 0.0001);
    }

    @Test
    public void testCalculoIPTUIndustrialAte2000() {
        Imovel imovel = new Imovel(bairro);
        imovel.setArea(2000);
        bairro.setCoeficienteIptu(1);
        imovel.setFinalidade(Finalidade.INDUSTRIAL);
        assertEquals(1000.00, imovel.calcularIPTU(), 0.0001);
    }

    @Test
    public void testCalculoIPTUIndustrialAcima2000() {
        Imovel imovel = new Imovel(bairro);
        imovel.setArea(3000);
        bairro.setCoeficienteIptu(1);
        imovel.setFinalidade(Finalidade.INDUSTRIAL);
        assertEquals(1650.00, imovel.calcularIPTU(), 0.0001);
    }

    @Test
    public void testCalculoIPTUCoeficiente() {
        Imovel imovel = new Imovel(bairro);
        imovel.setArea(500);
        bairro.setCoeficienteIptu(1);
        imovel.setFinalidade(Finalidade.INDUSTRIAL);
        assertEquals(1000.00, imovel.calcularIPTU(), 0.0001);
    }
}
