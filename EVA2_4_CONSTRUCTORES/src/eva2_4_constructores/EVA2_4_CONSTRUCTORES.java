/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_constructores;

/**
 *
 * @author elvat
 */
public class EVA2_4_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado = new Empleado();
    }
    
}


class Persona{ // clase base, superclase, clase padre

    public Persona() {
        System.out.println("Clase Persona");
    }
    
    public Persona(String mensaje){
    
        System.out.println(mensaje);
    }
    

}

class Empleado extends Persona{
    // super --> acceso a lo publico o protegido de la superclase
    public Empleado(){ // clase derivada, subclase, hijo
        super(); // Constructor default de la super clase
        
    }
    
    public Empleado(int salario) {
        super();
        System.out.println("Empleado: Construtor con argumentos");
    }
    
    public Empleado(String mensaje) {
        super(mensaje);
        System.out.println("Empleado: Construtor con argumentos");
    }

}