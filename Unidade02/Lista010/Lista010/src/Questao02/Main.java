/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao02;

/**
 *
 * @author samuel
 */
public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Soft and Soft");

        // Vendedores
        Vendedor luiz = new Vendedor("Luiz", 1000, 10);
        luiz.incluirVenda(new Venda(200));
        luiz.incluirVenda(new Venda(100));

        Vendedor paula = new Vendedor("Paula", 1200, 7);
        paula.incluirVenda(new Venda(500));
        paula.incluirVenda(new Venda(350));
        paula.incluirVenda(new Venda(280));

        // Programadores
        Programador julio = new Programador("Julio", 1000);
        julio.incluirLinguagem("C");
        julio.incluirLinguagem("Java");

        Programador ana = new Programador("Ana", 1000);
        ana.incluirLinguagem("Java");
        ana.incluirLinguagem("C#");

        Programador anderson = new Programador("Anderson", 1200);
        anderson.incluirLinguagem("Python");

        Funcionario jose = new Funcionario("Jose", 1000);
        Funcionario maria = new Funcionario("Maria", 1400);

        empresa.incluirFuncionario(luiz);
        empresa.incluirFuncionario(paula);
        empresa.incluirFuncionario(julio);
        empresa.incluirFuncionario(ana);
        empresa.incluirFuncionario(anderson);
        empresa.incluirFuncionario(jose);
        empresa.incluirFuncionario(maria);

        System.out.println("Custo total com salarios: R$ " + empresa.calcularCustosSalarios());

        System.out.println("\nSalarios dos Funcionarios:");
        for (Funcionario f : empresa.getFuncionarios()) {
            System.out.println(f.getNome() + ": R$ " + f.calcularSalario());
        }

        System.out.println("\nVendedores e Percentual de Comissao:");
        for (Funcionario f : empresa.getFuncionarios()) {
            if (f instanceof Vendedor) {
                Vendedor vendedor = (Vendedor) f;
                System.out.println(vendedor.getNome() + ": " + vendedor.getPercentualComissao() + "% de comissao");
            }
        }

        System.out.println("\nProgramadores e Linguagens Conhecidas:");
        for (Funcionario f : empresa.getFuncionarios()) {
            if (f instanceof Programador) {
                Programador programador = (Programador) f;
                System.out.println(programador.getNome() + ": " + programador.getLinguagens());
            }
        }
    }
}