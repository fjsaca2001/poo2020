package deber_seleccion;
import java.util.Scanner;
public class EjecutaSueldo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Requerimiento y almacenamiento de datos en variables
        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese las horas trabajadas");
        int horas = entrada.nextInt();
        System.out.println("Ingrese la cuota por hora");
        double cuota = entrada.nextDouble();
        // Creacion del objeto y llamada al constructor
        Sueldo empleado = new Sueldo(nombre,horas,cuota);
        // Calculo del sueldo
        empleado.calculaSueldo();
        // presentacion de datos
        System.out.println(empleado.obtenerNombre());
        System.out.println(empleado.obtenerSueldo());
    }
}
