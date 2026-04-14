/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_11_interface;

/**
 *
 * @author elvat
 */
public class Persona implements Mensaje{
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona() {
        nombre = "";
        apellidos = "";
        edad = 0;
    }

    
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Sirve para forzar un comportamiento
    @Override
    public void mostrarMensaje() {
        System.out.println("");
    }
    
    
    
}
