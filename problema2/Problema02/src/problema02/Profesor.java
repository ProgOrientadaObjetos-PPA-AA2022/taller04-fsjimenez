/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema02;

/**
 *
 * @author Usuario iTC
 */
public class Profesor {
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private int cedula;
    
    public Profesor(String name, String lastName){
        nombre = name;
        apellido = lastName;
    }
    
    public Profesor(double basico){
        sueldoBasico = basico;
    }
    
    public void establecerNombre(String name){
        nombre = name;
    }
    
    public void establecerApellido(String a){
        apellido = a;
    }
    
    public void establecerBasico(double basic){
        sueldoBasico = basic;
    }
    
    public void calcularTotal(){
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.2);
    }
    
    public void establecerCedula(int ced){
        cedula = ced;
    }
    
    
    @Override
    public String toString(){
        String cadena = String.format("Profesor\nNombre: %s\nApellido: %s\nSueldo "
                + "Basico: %.2f\nSueldo Total: %.2f\nCedula: %s\n", nombre,
                                                                apellido,
                                                                sueldoBasico,
                                                                sueldoTotal,
                                                                cedula);
        
        return cadena;
    }
}
