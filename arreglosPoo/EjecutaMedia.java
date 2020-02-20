package arreglosPoo;
import java.util.Scanner;
public class EjecutaMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // declaracion de variables
        int[] numeros = new int[15];
        // Ciclo for para la lectura de cada uno de los datos
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el valor número "+ (i+1)+ " :");
            numeros[i] = entrada.nextInt();
        }
        // creacion del objeto
        Media numero = new Media(numeros);
        // calculo de la media
        numero.calcularMedia();
        numero.calculoDesviacion();
        numero.presentarDatos();
    }
}
