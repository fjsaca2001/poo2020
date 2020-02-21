package arreglosDeberPoo;
import java.util.Scanner;
public class EjecutaCedula {
    // metodo principal
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // entrada de datos
        System.out.println("Ingrese su numero de cedula: ");
        int cedula = entrada.nextInt();
        // creacion del objeto
        Cedula ciudadano = new Cedula(cedula);
        // calculo de la validacion
        ciudadano.validacion();
        // presentacion de datos
        System.out.println(ciudadano.obtenerCedula());
        System.out.println(ciudadano.obtenerValidador());
        System.out.println(ciudadano.obtenerEstado());
    }
}