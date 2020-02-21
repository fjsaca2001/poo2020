package arreglosDeberPoo;
import java.util.Scanner;
public class EjecutaConversor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // entrada de datos
        System.out.println("Ingrese un numero binario de 6 digitos");
        String numBinario = entrada.nextLine();
        // creacion del objeto
        Conversor binario = new Conversor(numBinario);
        // calculo del decimal
        binario.obtenerDecimal();
        // presentacion de datos
        binario.obtenerSuma();
    }
}
