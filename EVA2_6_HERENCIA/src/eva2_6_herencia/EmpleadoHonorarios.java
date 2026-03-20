/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_herencia;

/**
 *
 * @author elvat
 */
public class EmpleadoHonorarios extends Empleado{
    private int horas;

    public EmpleadoHonorarios() {
        super();
        this.horas = 0;
    }

    public EmpleadoHonorarios(int horas, String nombre, String apellidos, String claveEmpleado, double salario) {
        super(nombre, apellidos, claveEmpleado, salario);
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    @Override
    public double calcularSalario() {
        return getSalario() * horas; 
    }

    @Override
    public String toString() {
         String resu = super.toString() + "\n" +
                 "Horas: " + horas + "\n" +
                 "Salario: " + calcularSalario() ;
         return resu;
    }

  
}
