/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_cuenta;

/**
 *
 * @author elvat
 */
public class EVA2_10_CUENTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaAhorro cuenta1 = new CuentaAhorro(0.05, "David Vivero", 10000);

        cuenta1.mostrarSaldo();
        cuenta1.depositar(5000);
        cuenta1.mostrarSaldo();
        cuenta1.retirar(2000);
        cuenta1.mostrarSaldo();
        cuenta1.intereses();
        cuenta1.mostrarSaldo();
        
    }
    
}
