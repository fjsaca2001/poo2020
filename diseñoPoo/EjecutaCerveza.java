package diseñoPoo;
import java.util.Scanner;
public class EjecutaCerveza {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el Tipo: ");
        String tipo = entrada.nextLine();
        System.out.println("Ingrese el Precio: ");
        double precio = entrada.nextDouble();
        System.out.println("Ingrese la cantidad: ");
        int cantidad = entrada.nextInt();
        Cerveza cerveza1 = new Cerveza(precio,cantidad,nombre,tipo);
        cerveza1.presentarDatos();
    }
}
