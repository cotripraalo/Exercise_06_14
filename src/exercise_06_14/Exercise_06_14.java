/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_06_14;

/**
 *
 * @author alondra
 */
public class Exercise_06_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tabla de visualizacion
        double empezar =1;       //Empezar series 
        double y = 901;         //Y series
        System.out.println("----------------------");
        for(double i =empezar; i <=y; i +=100){
            System.out.printf("%-12.0f",i);
            System.out.printf("%-6.4f/n",estimaPI(i));
        }
    }
    public static double estimaPI(double n){
        double pi=0;            // Asignar 0 a PI
        for (double i = 1; i <= n; i++) {
            pi+=Math.pow(-1,i+1)/(2*i-1);
        }
        pi*=4;
        return pi;
    }
}
           