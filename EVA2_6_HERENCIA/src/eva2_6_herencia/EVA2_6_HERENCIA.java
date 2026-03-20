package eva2_6_herencia;

/**
 * @author elvat
 */
public class EVA2_6_HERENCIA {

    public static void main(String[] args) {
        System.out.println("---------- PRUEBA: EMPLEADO  ----------");
        Empleado empleado= new Empleado("Juan", "Perez", "1", 1000);
        System.out.println(empleado.toString());
        
        System.out.println("---------- PRUEBA: EMPLEADO BASE ----------");
        EmpleadoBase empleadoBase = new EmpleadoBase(2015, "David", "Vivero", "2", 10000.0);
        System.out.println(empleadoBase.toString());

        System.out.println("\n---------- PRUEBA: EMPLEADO HONORARIOS ----------");
        EmpleadoHonorarios empleadoHono = new EmpleadoHonorarios(40, "Luisa", "Gutiérrez", "EH-999", 1000.0);
        System.out.println(empleadoHono.toString());
    }
}