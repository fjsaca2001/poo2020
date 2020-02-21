package matrizPoo;
import java.util.Scanner;

public class EjecutaSuma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // variables globales
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        // entrada de datos
        System.out.println("Tabla Nro 1");
        // almacenamiento de los datos para cada uno de los espacios del arreglo
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a.length ; j++) {
                System.out.println("Ingrese los valores de fila #"+(i+1)+" columna #"+(j+1));
                a[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Tabla Nro 2");
        // almacenamiento de los datos para cada uno de los espacios del arreglo
        for (int i = 0; i < b.length ; i++) {
            for (int j = 0; j < b.length ; j++) {
                System.out.println("Ingrese los valores de fila #"+(i+1)+" columna #"+(j+1));
                b[i][j] = entrada.nextInt();
            }
        }
        // creacion del objeto
        Suma arr = new Suma(a,b);
        // calculo de ña suma
        arr.calcularSuma();
        // presentacion de los datos
        System.out.println("Matriz A");
        // metodo que requiere un parametro que sera el arreglo requerido
        arr.obtenerResultados(arr.getA());
        System.out.println("\nMatriz B");
        arr.obtenerResultados(b);
        System.out.println("\nMatriz suma");
        arr.obtenerResultados(arr.getSuma());
    }
}
