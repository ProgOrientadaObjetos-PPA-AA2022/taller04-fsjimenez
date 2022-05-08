/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema03;

/**
 *
 * @author Usuario iTC
 */
public class Automotor {
    private String cedula;
    private String marca;
    private int anyo;
    private double valorVehi;
    private double valorMatri;
    
    public Automotor(String Marca, int año){
        marca = Marca;
        anyo = año;
    }
    
    public Automotor(){
        cedula = "1103316673";
        marca = "Ford";
        anyo = 2019;
        valorVehi = 60000;
    }
    
    public void establecerCedula(String ced){
        cedula = ced;
    }
    
    public void establecerValorVehi(double v){
        valorVehi = v;
    }
    
    public void calcularMatricula(){
        valorMatri = (2022 - anyo)*(0.00002*valorVehi); //El ejercicio pide el 0.002%, por eso los valores tan bajos
                                                        //en la presentacion del valor de la matricula
    }
    
    @Override
    
    public String toString(){
        String cadena = String.format("Vehiculo\nCédula del Dueño: "
                + "%s\nMarca del Veiculo: %s\nAño de Fabricacion: %s\n"
                + "Valor del Vehiculo: %.2f\nValor de la Matricula: %.2f\n"
                ,cedula,
                marca,
                anyo,
                valorVehi,
                valorMatri);
        return cadena;
    }
    
}
