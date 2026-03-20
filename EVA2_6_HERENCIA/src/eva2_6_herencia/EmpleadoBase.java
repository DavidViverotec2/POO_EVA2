package eva2_6_herencia;

/**
 * @author elvat
 */
public class EmpleadoBase extends Empleado {
    private int annioIngreso;

    public EmpleadoBase(int annioIngreso, String nombre, String apellidos, String claveEmpleado, double salario) {
        super(nombre, apellidos, claveEmpleado, salario);
        this.annioIngreso = annioIngreso;
    }

    public EmpleadoBase(int annioIngreso) {
        this.annioIngreso = annioIngreso;
    }

    public int getAnnioIngreso() {
        return annioIngreso;
    }

    public void setAnnioIngreso(int annioIngreso) {
        this.annioIngreso = annioIngreso;
    }

    public int antiguedad() {
        // Usando el año actual 2026
        int anti = 2026 - annioIngreso;
        // calcular quinquenios
        int quin = anti / 5;
        return quin;
    }

    @Override
    public double calcularSalario() {
        // Aumentamos un 10% por cada quinquenio
        return getSalario() * (1 + (antiguedad() * 0.1)); 
    }

    @Override
    public String toString() {
        String resu = super.toString() + "\n" + 
                      "Antiguedad: " + antiguedad() + "\n" +
                      "Salario Total: " + calcularSalario();
        return resu;
    }
}