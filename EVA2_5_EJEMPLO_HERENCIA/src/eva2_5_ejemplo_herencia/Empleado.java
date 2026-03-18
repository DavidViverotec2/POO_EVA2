/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_ejemplo_herencia;

/**
 *
 * @author elvat
 */
public class Empleado extends Persona {
    
    private String numero_empleado;
    private String puesto;
    private double salario;
    
    
    public Empleado(){
        super();
        this.numero_empleado = " ";
        this.puesto = " ";
        this.salario = 0;
    }

    public Empleado(String numero_empleado, String puesto, double salario, String nombre, String ap_paterno, String ap_materno, String rfc, int edad, char genero) {
        super(nombre, ap_paterno, ap_materno, rfc, edad, genero);
        this.numero_empleado = numero_empleado;
        this.puesto = puesto;
        this.salario = salario;
    }

    

    public String getNumero_empleado() {
        return numero_empleado;
    }

    public void setNumero_empleado(String numero_empleado) {
        this.numero_empleado = numero_empleado;
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

    /* public void imprimirDatosEmpleados (){
        imprimirDatos();
        System.out.println("NO de Empleado: " + numero_empleado);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: " + salario);
    } */
    
    // Sobreescritura (sobrecarga) de métodos
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos(); // Incorporamos la funcionalidad del metodo
        System.out.println("NO de Empleado: " + numero_empleado);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: " + salario);
    }
    
    @Override
    public String toString(){
        String resu = "----- Datos del empleado -----" + "\n" + 
                "Nombre: " + generarNombreCon() + "\n" + 
                "Edad: " + getEdad() + "\n" +
                "RFC: " + getRfc() + "\n" +
                "NO de Empleado: " + numero_empleado + "\n" +
                "Puesto: " + puesto + "\n" +
                "Salario: " + salario + "\n";
        return resu;
    }
    
    
}
