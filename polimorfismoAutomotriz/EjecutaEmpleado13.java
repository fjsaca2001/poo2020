package polimorfismoAutomotriz;
import java.util.Scanner;

public class EjecutaEmpleado13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String administrativo = "", mecanico = "", vendedor = "";
        int op;
        String opc;
        do {
            do {
                System.out.println("| Ingrese que tipo de empleado es |");
                System.out.println("-------------------------------------");
                System.out.println("| 1. Administrativo  | ");
                System.out.println("| 2. Mecanico        | ");
                System.out.println("| 3. Vendedor        | ");
                System.out.println("-------------------------------------");
                op = teclado.nextInt();
            }while(op > 3 || op < 1);
            switch (op) {
                case 1:
                    // Para el empleado administrativo
                    Administrativo administrativo13 = new Administrativo();
                    System.out.print("Ingrese nombre del empleado: ");
                    teclado.nextLine();
                    administrativo13.setNombre(teclado.nextLine());
                    System.out.print("Ingrese departamento al que pertenece: ");
                    administrativo13.setDepartamento(teclado.nextLine());
                    System.out.print("Ingrese puesto que ocupa: ");
                    administrativo13.setPuesto(teclado.nextLine());
                    System.out.print("Ingrese su sueldo mensual: ");
                    administrativo13.setSueldo_mensual(teclado.nextDouble());
                    administrativo13.sueldo();
                    administrativo = String.format("%s%s          %s          %s          %.2f\n",
                            administrativo,administrativo13.getNombre(),administrativo13.getDepartamento(),
                            administrativo13.getPuesto(),administrativo13.getSueldo_quincenal());
                    teclado.nextLine();
                    break;
                case 2:
                    // Para el empleado tipo mecanico
                    Mecanico mecanico1 = new Mecanico();
                    System.out.print("Ingrese nombre del empleado: ");
                    teclado.nextLine();
                    mecanico1.setNombre(teclado.nextLine());
                    System.out.print("Ingrese departamento al que pertenece: ");
                    mecanico1.setDepartamento(teclado.nextLine());
                    System.out.print("Ingrese puesto que ocupa: ");
                    mecanico1.setPuesto(teclado.nextLine());
                    mecanico1.sueldo();
                    mecanico = String.format("%s%s          %s          %s          %.2f\n"
                            ,mecanico,mecanico1.getNombre(),mecanico1.getDepartamento(),mecanico1.getPuesto(),mecanico1.getCont()
                    );
                    break;
                case 3:
                    Vendedor vendedor1 = new Vendedor();
                    System.out.print("Ingrese nombre del empleado: ");
                    teclado.nextLine();
                    vendedor1.setNombre(teclado.nextLine());
                    System.out.print("Ingrese departamento al que pertenece: ");
                    vendedor1.setDepartamento(teclado.nextLine());
                    System.out.print("Ingrese puesto que ocupa: ");
                    vendedor1.setPuesto(teclado.nextLine());
                    vendedor1.sueldo();
                    vendedor = String.format("%s%s          %s          %s          %.2f\n"
                            ,vendedor,vendedor1.getNombre(),vendedor1.getDepartamento(),vendedor1.getPuesto(),
                            vendedor1.getCont());
                    break;
            }
            System.out.println("Presione 's' para ingresar otro empleado u otra tecla para mostrar el reporte");
            opc = teclado.nextLine();
        } while (opc.toLowerCase().equals("s"));
        System.out.println("  ------------REPORTE DE NOMINA QUINCENAL------------\n" +
                "Nombre      Departamento        Puesto       Saldo Quincenal\n" +
                "____________________________________________________________________\n"
                + administrativo + mecanico + vendedor +
                "____________________________________________________________________\n")
        ;
    }
}
