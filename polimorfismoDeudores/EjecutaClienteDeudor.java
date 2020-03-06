package polimorfismoDeudores;
import java.util.Scanner;
public class EjecutaClienteDeudor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, nroCuenta, op, reporteP = "", reporteH = "", reporteA = "";
        double capital;
        int nroCliente = 0, plazo, n;
        do {
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
            do {
                // Menu para pedir lo que el usuario desea
                System.out.println("Elija el tipo de prestamo  ");
                System.out.println(" 1) Ingreso por prestamo personal");
                System.out.println(" 2) Ingreso por prestamo hipotecario");
                System.out.println(" 3) Ingreso por prestamo auto");
                n = entrada.nextInt();
            } while (n > 3 || n < 1);
            nroCliente++;
            switch (n) {
                case 1:
                    // Prestamo personal
                    PrestamoPersonal personal = new PrestamoPersonal();
                    personal.setNombre(nombre);
                    personal.setNroCuenta(nroCuenta);
                    personal.setCapital(capital);
                    personal.setPlazo(plazo);
                    personal.pago();
                    reporteP = String.format("%s%d                 %s                %s                 %.2f\n",
                            reporteP, nroCliente, personal.getNombre(), personal.getNroCuenta(), personal.getTotal());
                    break;
                case 2:
                    // Prestamo hipotecario
                    PrestamoHipotecario hipotecario = new PrestamoHipotecario();
                    hipotecario.setNombre(nombre);
                    hipotecario.setNroCuenta(nroCuenta);
                    hipotecario.setCapital(capital);
                    hipotecario.setPlazo(plazo);
                    hipotecario.pago();
                    reporteH = String.format("%s%d                 %s                %s                 %.2f\n",
                            reporteH, nroCliente, hipotecario.getNombre(), hipotecario.getNroCuenta(), hipotecario.getTotal());
                    break;
                case 3:
                    // Prestamo auto
                    PrestamoAutomovil automovil = new PrestamoAutomovil();
                    automovil.setNombre(nombre);
                    automovil.setNroCuenta(nroCuenta);
                    automovil.setCapital(capital);
                    automovil.setPlazo(plazo);
                    automovil.pago();
                    reporteA = String.format("%s%d                 %s                %s                 %.2f\n",
                            reporteA, nroCliente, automovil.getNombre(), automovil.getNroCuenta(), automovil.getTotal());
                    break;
            }
            entrada.nextLine();
            System.out.println("Presione 's' para ingresar otro cliente");
            op = entrada.nextLine();
        } while (op.toLowerCase().equals("s"));
        System.out.println("\tREPORTE DE CLIENTES DEUDORES\n" +
                "No. Cliente        Nombre        No. Cuenta        Interés por pagar\n" +
                "____________________________________________________________________\n"
                + reporteP + reporteH + reporteA +
                "____________________________________________________________________\n");
        System.out.println("TOTAL: " + nroCliente + " CLIENTES");
    }
}
