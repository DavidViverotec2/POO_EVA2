/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_ejercicio_figuras;

/**
 *
 * @author elvat
 */
public class EVA2_7_EJERCICIO_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear un Triángulo
        // Un triángulo base 5, altura 10 y lados 5, 8, 10
        Triangulo triangulo = new Triangulo(5.0, 10.0, 5.0, 8.0, 10.0);
        
        System.out.println(triangulo);
        System.out.println(); 
        
        // Crear un Círculo
        // Supongamos un círculo con radio de 7
        Circulo circulo = new Circulo(7.0);
        
        // Lo mismo para el círculo, imprimimos su información
        System.out.println(circulo);
    
    }
    
}
