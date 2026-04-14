/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_polimorfismo;

/**
 *
 * @author elvat
 */
public class EVA2_16_POLIMORFISMO {

    public static void main(String[] args) {
        System.out.println("--- Circulo ---");
        Circulo circu = new Circulo(50);
        imprimir(circu);
        
        System.out.println("--- Rectangulo ---");
        Rectangulo recta = new Rectangulo(15, 30);
        imprimir(recta);

        // Declarar el arreglo 
        Figuras[] figuras = new Figuras[5]; 
        
        // Instanciar objetos en el arreglo
        figuras[0] = new Circulo(15);
        figuras[1] = new Circulo(13);
        figuras[2] = new Rectangulo(11, 10);
        figuras[3] = new Rectangulo(20, 12);
        figuras[4] = new Circulo(16);
        
        System.out.println("Arreglo de figuras: ");
        
        // Bucle Para mostrar las figuras 
        for (int i = 0; i < figuras.length; i++) {
            imprimir(figuras[i]);
        }
    }

    public static void imprimir(Figuras figura) {
        System.out.println("-- Area: " + figura.calcularArea() + " --");
        System.out.println("-- Perimetro: " + figura.calcularPerimetro() + " --"); // Usar método correcto
        System.out.println("");
    }
}
