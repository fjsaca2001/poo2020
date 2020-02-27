package herencia;
import java.util.Scanner;
public class EjecutaPersonal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, identificacion, estado_civil, fecha_nacimiento, carrera, area, dependencia;
        // para el estudiante
        System.out.println("Creacion del objeto estudiante");
        System.out.print("Ingrese el nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese la identificación: ");
        identificacion = entrada.nextLine();
        System.out.print("Ingrese su estado civil: ");
        estado_civil = entrada.nextLine();
        System.out.print("Ingrese la fecha de nacimiento: ");
        fecha_nacimiento = entrada.nextLine();
        System.out.print("Ingrese la carrera del estudiante: ");
        carrera = entrada.nextLine();
        // creacion del objeto y uso del constructor
        Estudiante estudiante = new Estudiante(carrera, nombre, identificacion, estado_civil, fecha_nacimiento);

        // Para el Docente
        System.out.println("Creacion del objeto docente");
        System.out.print("Ingrese el nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese la identificación: ");
        identificacion = entrada.nextLine();
        System.out.print("Ingrese su estado civil: ");
        estado_civil = entrada.nextLine();
        System.out.print("Ingrese la fecha de nacimiento: ");
        fecha_nacimiento = entrada.nextLine();
        System.out.print("Ingrese el area del docente: ");
        area = entrada.nextLine();
        // creacion del objeto y uso del constructor
        Docente docente = new Docente(area,nombre,identificacion,estado_civil,fecha_nacimiento);

        // para el administrativo
        System.out.println("Creacion del objeto administrativo");
        System.out.print("Ingrese el nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese la identificación: ");
        identificacion = entrada.nextLine();
        System.out.print("Ingrese su estado civil: ");
        estado_civil = entrada.nextLine();
        System.out.print("Ingrese la fecha de nacimiento: ");
        fecha_nacimiento = entrada.nextLine();
        System.out.print("Ingrese la dependencia del Docente: ");
        dependencia = entrada.nextLine();
        // creacion del objeto y uso del constructor
        Administrativo administrativo = new Administrativo(dependencia,nombre,identificacion,estado_civil,fecha_nacimiento);


        /**
         * Presentacion de datos
         */
        // dateos del estudiante
        System.out.println("___________________________________________________________");
        System.out.println("| -> Datos de objeto estudiante");
        System.out.println("| -> Nombre: "+estudiante.getNombre());
        System.out.println("| -> Identificacion: "+estudiante.getIdentificacion());
        System.out.println("| -> Estado civil: "+estudiante.getEstado_civil());
        System.out.println("| -> Fecha de nacimiento: "+estudiante.getFecha_nacimineto());
        System.out.println("| -> Carrera: "+estudiante.getCarrera());
        System.out.println("___________________________________________________________");

        // datos del Docente
        System.out.println("___________________________________________________________");
        System.out.println("| -> Datos de objeto Docente");
        System.out.println("| -> Nombre: "+docente.getNombre());
        System.out.println("| -> Identificacion: "+docente.getIdentificacion());
        System.out.println("| -> Estado civil: "+docente.getEstado_civil());
        System.out.println("| -> Fecha de nacimiento: "+docente.getFecha_nacimineto());
        System.out.println("| -> Area: "+docente.getArea());
        System.out.println("___________________________________________________________");

        // datos del Administrativo
        System.out.println("___________________________________________________________");
        System.out.println("| -> Datos de objeto Administrativo");
        System.out.println("| -> Nombre: "+administrativo.getNombre());
        System.out.println("| -> Identificacion: "+administrativo.getIdentificacion());
        System.out.println("| -> Estado civil: "+administrativo.getEstado_civil());
        System.out.println("| -> Fecha de nacimiento: "+administrativo.getFecha_nacimineto());
        System.out.println("| -> Dependencia: "+administrativo.getDependencia());
        System.out.println("___________________________________________________________");

    }
}
