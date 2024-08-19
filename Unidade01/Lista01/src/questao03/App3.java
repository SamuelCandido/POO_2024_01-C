package questao03;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Pessoa[] p = new Pessoa[3];
        
        for(int i = 0; i < p.length; i++){
            p[i] = new Pessoa();
            
            System.out.print("Digite o seu peso: ");
            p[i].peso = scanner.nextDouble();

            System.out.println();
            
            System.out.print("Digite a sua altura: ");
            p[i].altura = scanner.nextDouble();
            

            double imc = p[i].calcularImc();

            System.out.println();
            System.out.println("O imc da pessoa " + (i+1) + " é: " + imc);
        }
        
        scanner.close();
    }

}
