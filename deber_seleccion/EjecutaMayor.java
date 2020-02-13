package deber_seleccion;
import java.util.Scanner;
public class EjecutaMayor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // requerimiento de datos
        System.out.println("Ingrese cuatro numeros: ");
        // Almacenamiento de los datos
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int n3 = teclado.nextInt();
        int n4 = teclado.nextInt();
        // Creacion del objeto y llamada al constructor
        Mayor mayor = new Mayor(n1,n2,n3,n4);
        // calculo del mayor
        mayor.calculaMayor();
        // Presentacion del numero mayor
        System.out.println(mayor.obtenerMayor());
    }


}
