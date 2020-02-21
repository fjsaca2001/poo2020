package matrizPoo;
/**
 * Integrantes: Frank Saca, Pablo Montaño Jeferson Cueva, Isaias Silva
 */
import java.util.Scanner;
public class EjecutaPromedio {
    // Método principal
    public static void main(String[] args) {
        int matrizFil;
        int matrizCol;
        Scanner teclado = new Scanner(System.in);

        // Ingreso de datos por teclado de filas y columnas
        System.out.println("Ingresar tamaño de filas");
        matrizFil = teclado.nextInt();
        System.out.println("Ingresar tamaño de columnas");
        matrizCol = teclado.nextInt();
        int matriz[][] = new int [matrizFil][matrizCol];
        // Ingreso de datos para la matriz
        for (int i = 0; i < matrizFil; i++) {
            for (int j = 0; j < matrizCol; j++) {
                System.out.println("Ingresar datos para Matriz A fila: " + i + " " + "columna: " + j);
                matriz[i][j] = teclado.nextInt();
            }
        }
        //Creación del objeto
        Promedio matrizProm = new Promedio(matriz);
        //Llamamos los metodos para el calculo de suma y promedio
        matrizProm.calcularSuma();
        matrizProm.calcularPromedio();
        // Imprime la matriz ingresada, la suma y el promedio
        matrizProm.obtenerMatriz();
        System.out.println("La suma de los elementos es: " +matrizProm.obtenerSuma());
        System.out.println("El promedio de los elementos es: " +matrizProm.obtenerPromedio());
    }
}
