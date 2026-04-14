/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_16_polimorfismo;

/**
 *
 * @author elvat
 */
public class Rectangulo implements Figuras{
    private double largo;
    private double alto;

    public Rectangulo(double largo, double alto) {
        this.largo = largo;
        this.alto = alto;
    }

    public Rectangulo() {
        this.largo = 0;
        this.alto = 0;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    public double calcularArea() {
        return largo * alto;
    }
    
     public double calcularPerimetro() {
        return 2*(largo + alto); 
               }

    
}
