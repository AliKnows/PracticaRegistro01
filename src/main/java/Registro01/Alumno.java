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
    
    
    //constructor por defecto (No tiene nada)
    public Alumno(){
        
    }
    
    //constructores
    
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "name=" + name + ", carrera=" + carrera + ", codigo=" + codigo + ", semestre=" + semestre + ", facultad=" + facultad + ", promedio=" + promedio + ", edad=" + edad + '}';
    }
    
    
    
    
}
