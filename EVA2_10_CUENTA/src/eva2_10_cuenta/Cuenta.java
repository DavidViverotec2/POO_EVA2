/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_10_cuenta;

/**
 *
 * @author elvat
 */
public abstract class Cuenta {
    protected String titular;
    protected double saldo;
    
    public Cuenta(){
        titular = "-----";
        saldo = 0;
    }
    
    public Cuenta(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    
    
    
    public abstract void retirar(double monto);
    public abstract void depositar(double monto);
    public abstract void mostrarSaldo();
    
    
}
