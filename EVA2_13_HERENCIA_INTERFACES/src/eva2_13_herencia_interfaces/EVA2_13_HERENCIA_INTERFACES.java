/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_herencia_interfaces;

/**
 *
 * @author elvat
 */
public class EVA2_13_HERENCIA_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

interface Prueba {
    void mensaje();
}

interface OtraPrueba extends Prueba{
    void mostrarSaludo(String mensaje);
}

class Demostracion implements OtraPrueba{

    @Override
    public void mostrarSaludo(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public void mensaje() {
    }

}