package disenio_seleccion;
import java.util.Scanner;
public class EjecutaDia {
    public static void main(String[] args) {
        // entrada de datos dada poe el usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = entrada.nextInt();
        // creacion del objeto dia
        Dia dia = new Dia(numero);
        //  calculo del dia
        dia.calcularDia();
        // presentacion de datos
        System.out.println(dia.obtenerDia());
    }
}
