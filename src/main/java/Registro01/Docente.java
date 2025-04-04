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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(Double Sueldo) {
        this.Sueldo = Sueldo;
    }
    
    
    
    
}
