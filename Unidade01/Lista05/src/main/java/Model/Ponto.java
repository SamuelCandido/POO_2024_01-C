/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
/**
 *
 * @author sjcandido
 */
public class Ponto {
    private int x;
    private int y;

    public Ponto(){
        x = 0;
        y = 0;
    }
    
    public Ponto(int x, int y){
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
     public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    /**
     * 
     * @return 
     */
    public Quadrante identificarQuadrante(){
         if (x > 0 && y > 0) {
            return Quadrante.PRIMEIRO; 
        }
        else if (x < 0 && y > 0) {
            return Quadrante.SEGUNDO; 
        }
        else if (x < 0 && y < 0) {
            return Quadrante.TERCEIRO;
        } 
        else if (x > 0 && y < 0) {
            return Quadrante.QUARTO; 
        } 
        else {
            return Quadrante.NENHUM;
        }
    }
    
    /**
     * 
     * @return 
     */
    public boolean estaIncidindoSobreX(){
        return x == 0;
    }
    
    /**
     * 
     * @return 
     */
    public boolean estaIncidindoSobreY(){
        return y == 0;
    }
    
    /**
     * 
     * @param outroponto
     * @return 
     */
    public double calcularDistancia(Ponto outroponto){
        return calcularDistancia(this, outroponto);
    }
    
    /**
     * 
     * @param p1
     * @param p2
     * @return 
     */
    public static double calcularDistancia(Ponto p1, Ponto p2){
        double distancia = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
        return distancia;
    }
    
    
    
    
    
}
