package questao02;
import questao01.Retangulo;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author samue
 */
public class AppQuestao2Ui {
    public static void main(String[] args) {
        Retangulo retangulo;
        retangulo = new Retangulo();
        
        retangulo.setAltura(Integer.parseInt(JOptionPane.showInputDialog("Informe a altura do retangulo: ")));
        retangulo.setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Informe o comprimento do retangulo: ")));
        
        JOptionPane.showMessageDialog(null, "Altura do retângulo: " + retangulo.getAltura());
        JOptionPane.showMessageDialog(null, "Comprimento do retângulo: " + retangulo.getComprimento());
    }
}
