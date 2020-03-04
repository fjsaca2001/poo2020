package polimorfismoPoo;

import java.util.Scanner;

public class EjecutaEmpleado12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horas;
        double cuota, sueldo;
        // Obtencion del sueldo de un empleado por horas
        EmpleadoPorHora12 empleado = new EmpleadoPorHora12();
        System.out.println("Calculo del sueldo de un empleado por horas ");
        System.out.print("Ingrese las horas trabajadas: ");
        empleado.setHoras(entrada.nextInt());
        System.out.print("Ingrese la cuota por hora: ");
        empleado.setCuota(entrada.nextDouble());
        empleado.calcularSalario();
        System.out.println("El sueldo es: "+empleado.getSueldo());
        EmpleadoAsalariado12 empleadoS = new EmpleadoAsalariado12();
        System.out.println("Calculo del sueldo de un empleado Asalariado ");
        System.out.print("Ingrese el sueldo mensual: ");
        empleadoS.setSueldoMensual(entrada.nextDouble());
        empleadoS.calcularSalario();
        System.out.println("El sueldo es: "+empleadoS.getSueldo());
    }
}
