/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_ejemplo_herencia;

/**
 *
 * @author elvat
 */
public class EVA2_5_EJEMPLO_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona("David", "Vivero", "Gutierrez", "SGJSK25", 18, 'H');
        persona.imprimirDatos();
        
        Empleado empleado = new Empleado("1","Tornero",8102,"German", "Vaena", "Soto", "HKG15", 28, 'H');
        empleado.imprimirDatos();
        empleado.toString();
        System.out.println(empleado);
    }
    
}
