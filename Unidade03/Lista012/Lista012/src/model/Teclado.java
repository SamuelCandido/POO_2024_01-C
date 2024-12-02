/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Teclado {
    private Scanner scanner;
    
    public Teclado(){
        scanner = new Scanner(System.in);
    }
   
    public String lerString(){
        return scanner.nextLine();
    }
    
    public int lerInt(){
        int value = 0;
        boolean erro = false; 
        
        do{
          try{    
            value = Integer.parseInt(scanner.nextLine());
            erro = false;
          }
          catch(NumberFormatException e){
              System.out.println("Valor errado. Digite um valor inteiro!");
              erro = true;
          }  
        }while(erro);
        
        return value;
    }
    
    public double lerDouble(){
        double value = 0;
        boolean erro = false; 
        do{
          try{    
            value = Double.parseDouble(scanner.nextLine());
            erro = false;
          }
          catch(NumberFormatException e){
              System.out.println("Valor errado. Digite um valor double!");
              erro = true;
          }  
        }while(erro);
        
        return value;
    }
    
    public boolean lerBoolean(){
        boolean erro = false;
        boolean retorno = false;
        
        do{
            erro = false;  
            String valor = scanner.nextLine();
         
            if (valor.equalsIgnoreCase("sim") || 
                valor.equalsIgnoreCase("verdadeiro") ||
                valor.equalsIgnoreCase("positivo") ||
                valor.equalsIgnoreCase("yes") || 
                valor.equalsIgnoreCase("true") ||
                valor.equalsIgnoreCase("s")){
                retorno = true;
            }else if (valor.equalsIgnoreCase("nao") || 
                      valor.equalsIgnoreCase("não") || 
                      valor.equalsIgnoreCase("falso") ||
                      valor.equalsIgnoreCase("no") ||
                      valor.equalsIgnoreCase("false") ||
                      valor.equalsIgnoreCase("negativo") ||
                      valor.equalsIgnoreCase("n")){
                retorno = false;
            }else{
                System.out.println("Valor errado. Digite novamente!");
                erro = true;
            }
        }while(erro);
        
        return retorno;
    }
    

}

