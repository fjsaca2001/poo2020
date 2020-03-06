package polimorfismoVolumen;
import java.util.Scanner;
public class EjecutaFigura12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        do{
            // Menu para pedir lo que el usuario desea
            System.out.println("_____________________________________");
            System.out.println("|  AREAS FIGURAS GEOMETRICAS:       |");
            System.out.println("_____________________________________");
            System.out.println("|  1) CUBO                          |");
            System.out.println("|  2) CILINDRO                      |");
            System.out.println("|  3) CONO                          |");
            System.out.println("|  4) ESFERA                        |");
            System.out.println("_____________________________________");
            System.out.println("|  ESCOGER OPCIÓN                   |");
            System.out.println("_____________________________________");
            n = entrada.nextInt();
            entrada.nextLine();
        }while(n > 4 || n < 1);
        switch (n){
            case 1:
                // Area del cubo
                Cubo12 cubo = new Cubo12();
                System.out.print("Ingrese el nombre de la figura: ");
                cubo.setNombre(entrada.nextLine());
                System.out.print("Ingrese las aristas: ");
                cubo.setArista(entrada.nextDouble());
                cubo.calcularVolumen();
                System.out.println("| -> Nombre de la figura: "+cubo.getNombre());
                System.out.println("| -> El volumen es: "+cubo.getVolumen());
                break;
            case 2:
                // Area del cilindro
                Cilindro12 cilindro = new Cilindro12();
                System.out.print("Ingrese el nombre de la figura: ");
                cilindro.setNombre(entrada.nextLine());
                System.out.print("Ingrese el radio: ");
                cilindro.setRadio(entrada.nextDouble());
                System.out.print("Ingrese la altura: ");
                cilindro.setAltura(entrada.nextDouble());
                cilindro.calcularVolumen();
                System.out.println("| -> Nombre de la figura: "+cilindro.getNombre());
                System.out.println("| -> El área es: "+cilindro.getVolumen());
                break;
            case 3:
                // Area del cono
                Cono12 cono = new Cono12();
                System.out.print("Ingrese el nombre de la figura: ");
                cono.setNombre(entrada.nextLine());
                System.out.print("Ingrese el radio: ");
                cono.setRadio(entrada.nextDouble());
                System.out.print("Ingrese la altura: ");
                cono.setAltura(entrada.nextDouble());
                cono.calcularVolumen();
                System.out.println("| -> Nombre de la figura: "+cono.getNombre());
                System.out.println("| -> El área es: "+cono.getVolumen());
                break;
            case 4:
                // Area de la esfera
                Esfera12 esfera = new Esfera12();
                System.out.print("Ingrese el nombre de la figura: ");
                esfera.setNombre(entrada.nextLine());
                System.out.print("Ingrese el radio: ");
                esfera.setRadio(entrada.nextDouble());
                esfera.calcularVolumen();
                System.out.println("| -> Nombre de la figura: "+esfera.getNombre());
                System.out.println("| -> El área es: "+esfera.getVolumen());
                break;
        }
    }
}
