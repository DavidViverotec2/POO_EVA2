/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_ejemplo_herencia;

/**
 *
 * @author elvat
 */
public class Persona {
    private String nombre;
    private String ap_paterno;
    private String ap_materno;
    private String rfc;
    private int edad;
    private char genero;

    public Persona(String nombre, String ap_paterno, String ap_materno, String rfc, int edad, char genero) {
        this.nombre = nombre;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.rfc = rfc;
        this.edad = edad;
        this.genero = genero;
    }

    public Persona() {
        nombre = "";
        ap_paterno = "";
        ap_materno = "";
        rfc = "";
        edad = 0;
        genero = ' ';
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    
    public String generarNombreCon(){
        return nombre + " " + ap_paterno + " " + ap_materno;
    }
    
    public String regresarGenero(){
        switch(genero){
            case 'H':
                return "Hombre";
            case 'M':
                return "Mujer";
            case 'O':
                return "Otro";
            default:
                return "No definido";
        }
    }
    
    public void imprimirDatos(){
        System.out.println("----- Persona -----" );
        System.out.println("Nombre: " + generarNombreCon() );
        System.out.println("RFC: " + rfc );
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + regresarGenero());
    }
    
}


