/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao03;
import questao01.Retangulo;
import javax.swing.JOptionPane;
/**
 *
 * @author Win11
 */
public class AppQuestao3Ui {
    public static void main(String[] args) {
        Retangulo retangulo;
        
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura do retangulo: "));
        int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o comprimento do retangulo: "));
        retangulo = new Retangulo(altura, comprimento);       
        
        JOptionPane.showMessageDialog(null, "Altura do retângulo: " + retangulo.getAltura());
        JOptionPane.showMessageDialog(null, "Comprimento do retângulo: " + retangulo.getComprimento());
    }
}
