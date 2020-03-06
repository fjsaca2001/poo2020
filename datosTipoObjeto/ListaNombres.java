package datosTipoObjeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNombres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<String> estudiantes = new ArrayList<String>();
        int n;
        boolean b = true;
        do{
            // Menu para pedir lo que el usuario desea
            System.out.println("_______________________________");
            System.out.println("|| Estudiantes UTPL          ||");
            System.out.println("|| Ingrese:                  ||");
            System.out.println("|| 1) Agregar nuevo nombre   ||");
            System.out.println("|| 2) Presentar nombres      ||");
            System.out.println("_______________________________");
            System.out.println("|| 3) Salir                  ||");
            System.out.println("_______________________________");
            n = entrada.nextInt();
            entrada.nextLine();
            switch (n){
                case 1:
                    System.out.println("Ingrese su nombre: ");
                    estudiantes.add(entrada.nextLine());
                    break;
                case 2:
                    System.out.println("Estudiantes de la UTPL");
                    // usando for normal
                    /*for (int i = 0; i < estudiantes.size(); i++) {
                        System.out.println("Nombre: "+estudiantes.get(i));
                    }*/
                    // uso del foreach
                    for (String est: estudiantes) {
                        System.out.println("Nombre: "+ est);
                    }
                    break;
                case 3:
                    b = false;
            }
        }while(b);
    }
}
