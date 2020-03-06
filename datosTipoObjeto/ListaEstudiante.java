package datosTipoObjeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEstudiante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        boolean b = true;
        System.out.println("Sistema de ingreso de estudiantes");
        do {
            System.out.println("Dijite 1 para almacenar un nuevo estudiante.");
            System.out.println("Dijite 2 para presentar.");
            System.out.println("Dijite 3 para salir.");
            int c = entrada.nextInt();
            entrada.nextLine();
            switch (c) {
                case 1:
                    Estudiante estudiante = new Estudiante();
                    System.out.print("Ingrese el nombre: ");
                    estudiante.setNombre(entrada.nextLine());
                    System.out.print("Ingrese carrera: ");
                    estudiante.setCarrera(entrada.nextLine());
                    System.out.print("Ingrese cedula: ");
                    estudiante.setCedula(entrada.nextLine());
                    System.out.print("Ingrese correo: ");
                    estudiante.setCorreo(entrada.nextLine());
                    System.out.print("Ingrese edad: ");
                    estudiante.setEdad(entrada.nextInt());
                    entrada.nextLine();
                    estudiantes.add(estudiante);
                    break;
                case 2:
                    System.out.println("Alumnos Ingresados");
                    for (Estudiante e : estudiantes) {
                        System.out.println("---------------------------------");
                        System.out.println("Nombre: " + e.getNombre());
                        System.out.println("Carrera: " + e.getCarrera());
                        System.out.println("Cedula: " + e.getCedula());
                        System.out.println("Correo: " + e.getCorreo());
                        System.out.println("Edad: " + e.getEdad());
                        System.out.println("---------------------------------");
                    }

                    break;

                case 3:

                    b = false;

                    break;
                default:
                    System.out.println("Incorrecto. verifique su respuesta");
            }
        } while (b);
    }
}
