/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_7_ejercicio_figuras;

/**
 *
 * @author elvat
 */


public class Circulo extends Figuras {
    private double radio;

    public Circulo() {
        radio = 0;
    }

    
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "----- Círculo -----" + "\n" + 
                "Área: " + calcularArea() + "\n" + 
                "Perímetro: " + calcularPerimetro();
    }
}
