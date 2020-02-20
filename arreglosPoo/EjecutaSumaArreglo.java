//Isaias Silva, Jefferson Cueva, Frank Saca
package arreglosPoo;

import java.util.Scanner;

public class EjecutaSumaArreglo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] arregloA = new int[10];
        int[] arregloB = new int[10];
        int[] arregloC = new int[10];
        for (int i=0; i<arregloA.length; i++){
            System.out.println("ingresar valor para arreglo a");
            arregloA[i] = teclado.nextInt();
            System.out.println("ingresar valor para arreglo b");
            arregloB[i] = teclado.nextInt();
        }
        // creacion del objeto
        SumaArreglo sumaArreglo= new SumaArreglo(arregloA,arregloB);
        // calculo
        sumaArreglo.calcularSuma();
        // Presentacion de datos
        sumaArreglo.obtenerTodo();
    }
}
