/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_abstract;

/**
 *
 * @author elvat
 */
public class EVA2_9_ABSTRACT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado = new Empleado("123", "Gerente", 1000, "David", "Vivero", 18, 2025);
        empleado.imprimirDatos();
        Empleado empleado2 = new Empleado("435", "Operador", 500, "German", "Menendez", 43, 2013);
        empleado2.imprimirDatos();
    }
    
}
