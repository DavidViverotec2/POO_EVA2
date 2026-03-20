/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_herencia;

/**
 *
 * @author elvat
 */
public class Empleado {
    private String nombre;
    private String apellidos;
    private String claveEmpleado;
    private double salario;

    public Empleado(String nombre, String apellidos, String claveEmpleado, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.claveEmpleado = claveEmpleado;
        this.salario = salario;
    }

    public Empleado() {
        nombre = "";
        apellidos = "";
        claveEmpleado = "";
        salario = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getClaveEmpleado() {
        return claveEmpleado;
    }

    public void setClaveEmpleado(String claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String resu = "---- Datos Generales de los empleados ----" + "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellidos: " + apellidos + "\n" + 
                "Clave Empleado: " + claveEmpleado + "\n" + 
                "Salario: " + salario + "\n";
    
        return resu; 
    }
    
    public double calcularSalario (){
        return salario;
    }
    
}
