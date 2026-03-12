/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_herencia;

/**
 *
 * @author elvat
 */
public class EVA2_3_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("----- Clase Animal -----");
        Animal animal = new Animal();
        animal.comer();
        System.out.println("----- Clase Mamifero -----");
        Mamifero mamifero = new Mamifero();
        mamifero.comer();
        mamifero.tenerPelo();
        System.out.println("----- Clase Persona -----");
        Persona persona = new Persona();
        persona.comer();
        persona.tenerPelo();
        persona.pensar();
        
    }
    
}

class Animal{ // Clase base, superclase, clase padre

    public Animal() {
        System.out.println("Clase animal");
    }
    public void comer(){
        System.out.println("Animal: comer!!");
    }

}

class Mamifero extends Animal{ // Clase derivada, subclase, clase hijo

    public Mamifero() {
        System.out.println("Clase Mamifero");
    }
    public void tenerPelo(){
        System.out.println("Mamifero: Tiene Pelo!!");
    }

}

class Persona extends Mamifero{

    public Persona() {
        System.out.println("Clase Persona");
    }
    public void pensar(){
        System.out.println("Persona: Piensa!!");
    }

}