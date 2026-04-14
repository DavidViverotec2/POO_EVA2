/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_clases_anonimas;

/**
 *
 * @author elvat
 */
public class EVA2_14_CLASES_ANONIMAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Prueba prueba = new Prueba(); No se puede
        // Clase anonima --> Clase sin nombre
        // POLIMORFISMO --> HACER QUE ALGO SE COMPORTE COMO ALGO DISTINTO
        Prueba prueba = new Prueba() {
            @Override
            public void mostrarMensaje() {
                System.out.println("Holaaa");
            }
        };
        prueba.mostrarMensaje();
    }
    
}

/* class UsarPrueba implements Prueba{

} */

interface Prueba{
    public void mostrarMensaje();
}