/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_10_cuenta;

/**
 *
 * @author elvat
 */
public class CuentaAhorro extends Cuenta{
    
    protected double intereses; // Representa el % (ej: 0.05 para 5%)

    public CuentaAhorro(double intereses, String titular, double saldo) {
        super(titular, saldo);
        this.intereses = intereses;
    }

    // Metodo para intereses
    public void interes() {
        this.saldo += (this.saldo * this.intereses);
    }

    @Override
    public void retirar(double monto) {
        if (this.saldo >= monto) {
            this.saldo -= monto;
            System.out.println("--- Retiro: " + monto + " ---");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("--- Deposito: " + monto + " ---");
        }
    }

    @Override
    public void mostrarSaldo() {
        System.out.println("--- Saldo actual: $" + saldo + " ---" + "\n");
    }

    public void intereses() {
        this.saldo += (this.saldo * this.intereses);
        System.out.println("--- Intereses: " + (intereses * 100) + "% ---");
    }
    
}
    
