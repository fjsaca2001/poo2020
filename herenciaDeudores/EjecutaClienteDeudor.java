package herenciaDeudores;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EjecutaClienteDeudor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, nroCuenta, op, reporteP = "", reporteH = "", reporteA = "";
        double capital;
        int total = 0;
        int nroCliente1 = 0, nroCliente2 = 0, nroCliente3 = 0, plazo,n;
        do {
            total ++;
            System.out.println("_________________________________________");
            System.out.println("|     $ Banco Central del Ecuador $     |");
            System.out.println("| Sistema de ingreso:                   |");
            System.out.println("_________________________________________");
            System.out.print("Ingrese el nombre: ");
            nombre = entrada.nextLine();
            System.out.print("Ingrese el numero de cuenta: ");
            nroCuenta = entrada.nextLine();
            System.out.print("Ingrese el capital: ");
            capital = entrada.nextDouble();
            System.out.print("Ingrese el plazo anual: ");
            plazo = entrada.nextInt();
            do{
                // Menu para pedir lo que el usuario desea
                System.out.println("Elija el tipo de prestamo  ");
                System.out.println(" 1) Ingreso por prestamo personal");
                System.out.println(" 2) Ingreso por prestamo hipotecario");
                System.out.println(" 3) Ingreso por prestamo auto");
                n = entrada.nextInt();
            }while(n > 3 || n < 1);
            switch (n) {
                case 1:
                    // Prestamo personal
                    nroCliente1++;
                    PrestamoPersonal personal = new PrestamoPersonal(nroCliente1, nombre, nroCuenta, capital, plazo);
                    personal.calcularPagoFinal();
                    reporteP = String.format("%s%s", reporteP,personal.obtenerReporte());
                    break;
                case 2:
                    // Prestamo hipotecario
                    nroCliente2++;
                    PrestamoHipotecario hipotecario = new PrestamoHipotecario(nroCliente2, nombre, nroCuenta, capital, plazo);
                    hipotecario.calcularPagoFinal();
                    reporteH = String.format("%s%s", reporteH,hipotecario.obtenerReporte());
                    break;
                case 3:
                    // Prestamo auto
                    nroCliente3++;
                    PrestamoAutomovil automovil = new PrestamoAutomovil(nroCliente3, nombre, nroCuenta, capital, plazo);
                    automovil.calcularPagoFinal();
                    reporteA = String.format("%s%s", reporteA,automovil.obtenerReporte());
                    break;
            }
            entrada.nextLine();
            System.out.println("Presione 's' para ingresar otro cliente");
            op = entrada.nextLine();
        }while (op.toLowerCase().equals("s"));

        System.out.println("\tREPORTE DE CLIENTES DEUDORES\n"+
                        "No. Cliente        Nombre        No. Cuenta        Interés por pagar\n"+
                        "____________________________________________________________________\n"
                        + reporteP + reporteH + reporteA +
                        "____________________________________________________________________\n");
        System.out.println("TOTAL: "+total+" CLIENTES");
    }
}
