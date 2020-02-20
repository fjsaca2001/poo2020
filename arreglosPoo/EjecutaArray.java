package arreglosPoo;
import java.util.Scanner;
public class EjecutaArray {
    public static void main(String[] args) {
        // declaracion de variables
        int[] vectorA = new int[10];
        int[] vectorB = new int[10];
        Scanner entrada = new Scanner(System.in);
        // ingreso de datos
        System.out.println("Ingrese 10 valores para el vector A");
        // ciclo para recorrer cada posicion y almacenar datos del vector A
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = entrada.nextInt();
        }
        System.out.println("Ingrese 10 valores para el vector B");
        // ciclo para recorrer cada posicion y almacenar datos del vector A
        for (int i = 0; i < vectorB.length; i++) {
            vectorB[i] = entrada.nextInt();
        }
        // creacion del objeto
        Array arreglo = new Array(vectorA, vectorB);
        // llamada a los metodos de calcular
        arreglo.calcularSumatoria();
        // presentacion de datos
        arreglo.presentarVectorA();
        arreglo.presentarVectorB();
        System.out.println(arreglo.obtenerSumatoria());
    }
}
