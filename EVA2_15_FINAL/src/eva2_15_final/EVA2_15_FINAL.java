/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_final;

/**
 *
 * @author elvat
 */
public class EVA2_15_FINAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Persona {

private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona() {
        nombre = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}

final class Empleado extends Persona { // Ya no se puede heredar de empleado
    private String Puesto;

    public Empleado(String Puesto, String nombre) {
        super(nombre);
        this.Puesto = Puesto;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    

    public Empleado() {
        Puesto = "";
    }
    
    
    
}

class CEO extends Empleado{ // fianl limita la herencia 

}