package disenioPoo;
import java.util.Scanner;
public class EjecutaEstudiante {
    public static void main(String[] args) {
        // Entrada de datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese la Asignatura: ");
        String asignatura = teclado.nextLine();
        System.out.println("Ingrese la nota del 1 Bimestre: ");
        double nota1B = teclado.nextDouble();
        System.out.println("Ingrese la nota del 2 Bimestre: ");
        double nota2B = teclado.nextDouble();
        // creacion del objeto estudiante y uso del constructor
        Estudiante estudiante = new Estudiante(nombre, asignatura,nota1B, nota2B);
        // Funcion para presentar los datos
        estudiante.presenta_Estudiante();
    }
}
