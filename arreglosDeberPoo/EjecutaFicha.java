package arreglosDeberPoo;
import java.util.Scanner;

public class EjecutaFicha {
    public static void main(String[] args) {
        // entrada y declaracion de datos
        Scanner entrada = new Scanner(System.in);
        String[] nombre = new String[5];
        int[] edad = new int[5];
        String[] universidad = new String[5];
        String[] celular = new String[5];
        // ciclo para solicitar datos por cada alumno
        for (int i = 0; i < nombre.length; i++){
            System.out.println("Estudiante Nro "+(i+1));
            System.out.print("Ingrese el nombre del estudiante: ");
            nombre[i] = entrada.nextLine();
            System.out.print("Ingrese la edad del estudiante: ");
            edad [i]= entrada.nextInt();
            entrada.nextLine();
            System.out.print("Ingrese la universidad del estudiante: ");
            universidad[i] = entrada.nextLine();
            System.out.print("Ingrese el numero de celular del estudiante: ");
            celular[i] = entrada.nextLine();
        }
        // creacion del objeto
        Ficha estudiantes = new Ficha(nombre, edad, universidad, celular);
        // presentacion de los estudiates
        estudiantes.presentarAlumno();
    }
}
