package herenciaEmpleado;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // variables globales
        String nombre, cargo, dependencia;
        int horas;
        double valorHora, valorMensual;
        // Menu para pedir lo que el usuario desea
        System.out.println("_______________________________");
        System.out.println("|| Empleados de una empresa  ||");
        System.out.println("|| Ingrese:                  ||");
        System.out.println("|| 1) Empleado Por Horas     ||");
        System.out.println("|| 2) Empleado Asalariado    ||");
        System.out.println("_______________________________");
        int n = entrada.nextInt();
        // casos posibles
        switch (n){
            case 1 :
                // para el empleado por hora
                System.out.println("Empleado Por Horas");
                // etrada de datos
                System.out.print("Ingrese el nombre: ");
                entrada.nextLine();
                nombre = entrada.nextLine();
                System.out.print("Ingrese el Cargo: ");
                cargo = entrada.nextLine();
                System.out.print("Ingrese la dependencia: ");
                dependencia = entrada.nextLine();
                System.out.print("Ingrese las horas trabajadas: ");
                horas = entrada.nextInt();
                System.out.print("Ingrese el valor por hora: ");
                valorHora = entrada.nextDouble();
                // creacion del objeto y uso del constructor
                EmpleadoHora empleadoHora = new EmpleadoHora(horas, valorHora, nombre, cargo, dependencia);
                // Presentacion de datos
                // datos del empleado por horas
                System.out.println("___________________________________________________________");
                System.out.println("| -> Datos del empleado por horas");
                System.out.println("| -> Nombre: "+empleadoHora.getNombre());
                System.out.println("| -> Cargo: "+empleadoHora.getCargo());
                System.out.println("| -> Dependencia: "+empleadoHora.getDependencia());
                System.out.println("| -> Horas trabajadas: "+empleadoHora.getHoras());
                System.out.println("| -> Valor por horas: "+empleadoHora.getValorHora());
                System.out.println("| -> Sueldo final: "+empleadoHora.calcularSueldo());
                System.out.println("___________________________________________________________");
            break;
            case 2:
                // para el empleado asalariado
                System.out.println("Empleado Asalariado");
                // entrada de datos
                System.out.print("Ingrese el nombre: ");
                entrada.nextLine();
                nombre = entrada.nextLine();
                System.out.print("Ingrese el Cargo: ");
                cargo = entrada.nextLine();
                System.out.print("Ingrese la dependencia: ");
                dependencia = entrada.nextLine();
                System.out.print("Ingrese el valor mensual: ");
                valorMensual = entrada.nextInt();
                // creacion del objeto y uso del constructor
                EmpleadoAsalariado empleadoAsalariado= new EmpleadoAsalariado(valorMensual, nombre, cargo, dependencia);
                // Presentacion de datos
                // datos del empleado por asalariado
                System.out.println("___________________________________________________________");
                System.out.println("| -> Datos del empleado asalariado");
                System.out.println("| -> Nombre: "+empleadoAsalariado.getNombre());
                System.out.println("| -> Cargo: "+empleadoAsalariado.getCargo());
                System.out.println("| -> Dependencia: "+empleadoAsalariado.getDependencia());
                System.out.println("| -> Sueldo final: "+empleadoAsalariado.getValorMensual());
                System.out.println("___________________________________________________________");
                break;
            default:
                // caso "error" en caso de que digite un caso no existente
                System.out.println("Error verifique su ingreso");
        }

    }
}
