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
public class EntidadFinanciera {
    private String nombreCliente;
    private String nombreBanco;
    private double cheque;
    private double comision;
    
    public EntidadFinanciera(double check){
        cheque = check;
    }
    
    public EntidadFinanciera(String c, String b){
        nombreCliente = c;
        nombreBanco = b;
    }
    
    public void establecerCliente(String a){
        nombreCliente = a;
    }
    
    public void establecerBanco(String a){
        nombreBanco = a;
    }
    
    public void establecerCheque(double a){
        cheque = a;
    }
    
    public void calcularComision(){
        comision = cheque * 0.00003;
    }
    
    public String toString(){
        String cadena = String.format("Cheque\nNombre del Cliente: %s\n"
                + "Nombre del Banco: %s\nValor del Cheque: %.2f\n"
                + "Comision del Banco: %.2f\n", nombreCliente, nombreBanco,
                                                cheque, comision);
        return cadena;
    }
}
