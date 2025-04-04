/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registro01;

/**
 *
 * @author AIAR
 */
public class Docente {
    
    
    private String DNI;
    private int edad;
    private String nombre;
    public String apellido;
    private Double Sueldo;

    public Docente() {
    }
    
    
    public Docente(String DNI, int edad, String nombre,String apellido, Double sueldo){
        this.DNI =DNI;
        this.edad =edad;
        this.nombre=nombre;
        this.apellido=apellido;
        this.Sueldo=sueldo;
        
        
    }
    
    
    
}
