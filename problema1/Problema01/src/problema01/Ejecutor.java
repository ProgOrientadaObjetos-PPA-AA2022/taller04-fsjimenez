/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema01;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entidad est1 = new Entidad(8.5, 6.2, 8.9);
        Entidad est2 = new Entidad("Felipe Jimenez");
        
        est1.establecerNombre("Arturo Vidal");
        est1.calcularPromedio();
        
        est2.establecerNota1(5.2);
        est2.establecerNota2(9.8);
        est2.establecerNota3(8.45);
        est2.calcularPromedio();
        
        System.out.printf("%s\n", est1);
        System.out.printf("\n%s\n", est2);
    }
    
}
