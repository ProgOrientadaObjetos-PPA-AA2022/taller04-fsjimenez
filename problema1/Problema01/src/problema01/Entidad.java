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
public class Entidad {
    private String nombreEstudiante;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
    
    public Entidad(double c1, double c2, double c3){
        calificacion1 = c1;
        calificacion2 = c2; 
        calificacion3 = c3; 
    }
    
    public Entidad(String name){
        nombreEstudiante = name;
    }
    
    public void calcularPromedio(){
        promedio = (calificacion1 + calificacion2 + calificacion3)/3;
    }
    
    public void establecerNombre(String name){
        nombreEstudiante = name;
    }
    
    public void establecerNota1(double n1){
        calificacion1 = n1;
    }
    
    public void establecerNota2(double n2){
        calificacion2 = n2;
    }
    
    public void establecerNota3(double n3){
        calificacion3 = n3;
    }
    
    @Override
    
    public String toString(){
        String cadena = String.format("Estudiante: %s\nNota 1: %.2f\nNota 2:"
                + " %.2f\nNota 3: %.2f\nPromedio: %.2f", nombreEstudiante,
                                                         calificacion1,
                                                         calificacion2,
                                                         calificacion3,
                                                         promedio);
        return cadena;
    }
}
