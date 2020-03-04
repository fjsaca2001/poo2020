package herenciaInversionistas;
import java.util.Scanner;
public class EjecutaInversionista {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // variables locales
        String nombre, nroCuenta, op, reporteA = "", reporteP = "", reporteM = "";
        double capital;
        int total = 0;
        int nroCliente1 = 0, nroCliente2 = 0, nroCliente3 = 0, plazo,n;
        // ciclo usado para que se repita el ingreso de datos si desea el usuario
        do {
            // variable para contar los clientes
            total ++;
            // ingreso de datos
            System.out.println("_________________________________________");
            System.out.println("|     $ Banco Central del Ecuador $     |");
            System.out.println("| Sistema de cálculo de interes a favor |");
            System.out.println("_________________________________________");
            System.out.print("Ingrese el nombre: ");
            nombre = entrada.nextLine();
            System.out.print("Ingrese el numero de cuenta: ");
            nroCuenta = entrada.nextLine();
            System.out.print("Ingrese el capital: ");
            capital = entrada.nextDouble();
            System.out.print("Ingrese el plazo anual: ");
            plazo = entrada.nextInt();
            // ciclo que solicita el tipo de cuenta
            do{
                // Menu para pedir lo que el usuario desea
                System.out.println("Elija el tipo de inversion  ");
                System.out.println(" 1) Ingreso por cuenta de ahorros");
                System.out.println(" 2) Ingreso por pagare");
                System.out.println(" 3) Ingreso por cuenta maestra");
                n = entrada.nextInt();
             // condicion del ciclo
            }while(n > 3 || n < 1);
            // ciclo usado para los casos existentes
            switch (n) {
                case 1:
                    // cuenta ahorro
                    nroCliente1++;
                    // creacion del objeto
                    CuentaAhorro ahorro = new CuentaAhorro(nroCliente1, nombre, nroCuenta, capital, plazo);
                    ahorro.calcularInversiones();
                    reporteA = String.format("%s%s", reporteA,ahorro.obtenerReporte());
                    break;
                case 2:
                    // pagare
                    nroCliente2++;
                    // creacion del objeto
                    Pagare pagare = new Pagare(nroCliente1, nombre, nroCuenta, capital, plazo);
                    pagare.calcularInversiones();
                    reporteP = String.format("%s%s", reporteP,pagare.obtenerReporte());
                    break;
                case 3:
                    // cuenta maestra
                    nroCliente3++;
                    // creacion del objeto
                    CuentaMaestra maestra = new CuentaMaestra(nroCliente1, nombre, nroCuenta, capital, plazo);
                    // calculo de la inversion
                    maestra.calcularInversiones();
                    // concatenacion del resultado
                    reporteM = String.format("%s%s", reporteM,maestra.obtenerReporte());
                    break;
            }
            // limpieza del buffer
            entrada.nextLine();
            // requerimiento si desea mas ingresos
            System.out.println("Presione 's' para ingresar otro cliente");
            op = entrada.nextLine();
        }while (op.toLowerCase().equals("s"));
        // impresion de datos
        System.out.println("\tREPORTE DE CLIENTES DEUDORES\n"+
                "No. Cliente        Nombre        No. Cuenta        Interés Ganado\n"+
                "____________________________________________________________________\n"
                + reporteA + reporteP + reporteM+
                "____________________________________________________________________\n");
        System.out.println("TOTAL: "+total+" CLIENTES");
    }
}
