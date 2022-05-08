/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema04;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntidadFinanciera check1 = new EntidadFinanciera(120000);
        EntidadFinanciera check2 = new EntidadFinanciera("Felipe Jimenez",
                                                        "Banco de Loja");
        
        check1.establecerCliente("Johan Cruyff");
        check1.establecerBanco("Banco de Guayaquil");
        check1.calcularComision();
        
        check2.establecerCheque(5000000);
        check2.calcularComision();
        
        System.out.printf("%s\n", check1);
        System.out.printf("%s\n", check2);

        
    }
    
}
