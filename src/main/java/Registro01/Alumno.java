/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registro01;

/**
 *
 * @author AIAR
 */
public class Alumno {
    
    String name;
    String carrera;
    String codigo;
    String semestre;
    String facultad;
    double promedio;
    int edad;
       
    public Alumno(){
        
    }
    
    //constructor
    
    public Alumno(String name, String carrera, String codigo, String semestre, String facultad,
            double promedio,int edad){
      
        this.name = name;
        this.carrera = carrera;
        this.codigo = codigo;
        this.semestre = semestre;
        this.facultad = facultad;
        this.promedio = promedio;
        this.edad = edad;
    }
    
    
}
