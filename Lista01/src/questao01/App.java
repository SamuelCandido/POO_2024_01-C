package questao01;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa1;
        pessoa1 = new Pessoa();
        
        pessoa1.peso = 78;
        pessoa1.altura = 1.75;
        
        double imc = pessoa1.calcularImc();
        
        System.out.println(imc);
    }
    
}
