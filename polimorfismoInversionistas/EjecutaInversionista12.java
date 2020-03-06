package polimorfismoInversionistas;
import java.util.Scanner;

public class EjecutaInversionista12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // variables locales
        String nombre, nroCuenta, op, reporteA = "", reporteP = "", reporteM = "";
        double capital;
        int nroCliente = 0, plazo,n;
        // ciclo usado para que se repita el ingreso de datos si desea el usuario
        do {
            // variable para contar los clientes
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
            nroCliente++; 
            // ciclo usado para los casos existentes
            switch (n) {
                case 1:
                    // cuenta ahorro
                    // creacion del objeto
                    CuentaAhorro12 ahorro = new CuentaAhorro12();
                    ahorro.setNombre(nombre);
                    ahorro.setNroCuenta(nroCuenta);
                    ahorro.setCapital(capital);
                    ahorro.setPlazo(plazo);
                    ahorro.total();
                    reporteA = String.format("%s%d                 %s                %s                 %.2f\n"
                            ,reporteA,nroCliente,ahorro.getNombre(),ahorro.getNroCuenta(),ahorro.getTotal());
                    break;
                case 2:
                    // pagare
                    // creacion del objeto
                    Pagare12 pagare = new Pagare12();
                    pagare.setNombre(nombre);
                    pagare.setNroCuenta(nroCuenta);
                    pagare.setCapital(capital);
                    pagare.setPlazo(plazo);
                    pagare.total();
                    reporteP = String.format("%s%d                 %s                %s                 %.2f\n"
                            ,reporteP,nroCliente,pagare.getNombre(),pagare.getNroCuenta(),pagare.getTotal());
                    break;
                case 3:
                    // cuenta maestra
                    // creacion del objeto
                    CuentaMaestra12 maestra = new CuentaMaestra12();
                    maestra.setNombre(nombre);
                    maestra.setNroCuenta(nroCuenta);
                    maestra.setCapital(capital);
                    maestra.setPlazo(plazo);
                    maestra.total();
                    reporteM = String.format("%s%d                 %s                %s                 %.2f\n"
                            ,reporteM,nroCliente,maestra.getNombre(),maestra.getNroCuenta(),maestra.getTotal());
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
        System.out.println("TOTAL: "+nroCliente+" CLIENTES");
    }
}
