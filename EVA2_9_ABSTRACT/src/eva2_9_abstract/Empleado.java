/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_abstract;

/**
 *
 * @author elvat
 */
public class Empleado extends Persona{
    private String clave;
    private String puesto;
    private double salario;
    private int annioIngreso;

    public Empleado() {
        clave = "";
        puesto = "";
        salario = 0;
        annioIngreso = 0;
    }

    
    public Empleado(String clave, String puesto, double salario, String nombre, String apellidos, int edad,int annioIngreso) {
        super(nombre, apellidos, edad);
        this.clave = clave;
        this.puesto = puesto;
        this.salario = salario;
        this.annioIngreso = annioIngreso;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String Clave) {
        this.clave = Clave;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getAnnioIngreso() {
        return annioIngreso;
    }

    public void setAnnioIngreso(int annioIngreso) {
        this.annioIngreso = annioIngreso;
    }

    @Override
    public int calcularAntiguedad() {
        return 2026 - annioIngreso;
    }
    
    
    
    public void imprimirDatos(){
        // Atributos´protected en la clase persona
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        // Atributos de mi clase empleado
        System.out.println("Clave: " + clave);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: " + salario);
        System.out.println("Antiguedad: " + calcularAntiguedad());
    }
    
    
}
