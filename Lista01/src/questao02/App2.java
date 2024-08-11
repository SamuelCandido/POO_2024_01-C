package questao02;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Pessoa pessoa1;
        
        pessoa1 = new Pessoa();
        
        System.out.print("Digite o seu peso: ");
        pessoa1.peso = scanner.nextDouble();
        
        System.out.println();
        
        System.out.print("Digite a sua altura: ");
        pessoa1.altura = scanner.nextDouble();
        
        double imc = pessoa1.calcularImc();
        
        System.out.println();
        System.out.println("Seu imc é de: " + imc);
        
        scanner.close();
    }

}
