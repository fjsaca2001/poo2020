package datosTipoObjeto;
import java.util.Scanner;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        // declaracion de variables
        Scanner entrada = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[3];
        Estudiante estudiante;
        int edades = 0;
            System.out.println("Ingresos 3 estudiantes");
            for (int i = 0; i < estudiantes.length; i++) {
                // crea un nuevos estudiante
                Estudiante est = new Estudiante();
                System.out.print("Ingrese su nombre: ");
                est.setNombre(entrada.nextLine());
                System.out.print("Ingrese su cedula: ");
                est.setCedula(entrada.nextLine());
                System.out.print("Ingrese su edad: ");
                est.setEdad(entrada.nextInt());
                entrada.nextLine();
                System.out.print("Ingrese su carrera: ");
                est.setCarrera(entrada.nextLine());
                System.out.print("Ingrese su correo: ");
                est.setCorreo(entrada.nextLine());
                // asignacion el objeto est a la variable estudiante
                estudiantes[i] = est;
            }
            System.out.println("Lista de estudiantes.");
            for (int i = 0; i < estudiantes.length; i++) {
                edades += estudiantes[i].getEdad();
                // Obtencion de los valores que contiene el tipo de dato estudiante
                System.out.println("Nombre: "+estudiantes[i].getNombre());
                System.out.println("Cedula: "+estudiantes[i].getCedula());
            }
        System.out.println("Promedio de edad: "+ (edades / estudiantes.length));
    }
}