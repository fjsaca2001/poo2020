package deber_seleccion;
import java.util.Scanner;
public class EjecutaAlumno4 {
    public static void main(String[] args) {
        // Requerimiento y alamacenamiendo de datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese cuatro calificaciones: ");
        // almacenamiento de las variables
        double n1 = teclado.nextDouble();
        double n2 = teclado.nextDouble();
        double n3 = teclado.nextDouble();
        double n4 = teclado.nextDouble();
        // creacion del objeto y use del constructor Alumno4
        Alumno4 alumno = new Alumno4(nombre, n1, n2, n3, n4);
        // Calculo de los datos
        alumno.calcularPromedio();
        alumno.calcularObservacion();
        // Presentacion de los datos
        System.out.println(alumno.obtenerNombre());
        System.out.println(alumno.obtenerPromedio());
        System.out.println(alumno.obtenerObservacio());
    }
}
