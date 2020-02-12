package disenio_seleccion;
import java.util.Scanner;
public class EjecutaEmpleado {
    public static void main(String[] args) {
        // Sentencias para la entrada de datos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el numero de horas: ");
        int horas = entrada.nextInt();
        System.out.println("Ingrese la cuota: ");
        double cuota = entrada.nextDouble();
        // Creacion del objeto empleado
        Empleado empleado = new Empleado(nombre, horas, cuota);
        // llamada al metodo que calculara el sueldo
        empleado.calcularSueldo();
        // llamada a los metodos para la presntacion de los datos
        empleado.obtenerNombre();
        empleado.obtenerSueldo();
    }
}
