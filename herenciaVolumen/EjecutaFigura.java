package herenciaVolumen;
import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double radio, altura;
        int n;
        String nombre;
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
        }while(n > 4 || n < 1);
        switch (n){
            case 1:
                // Area del cubo
                nombre = "Cubo";
                System.out.print("Ingrese las aristas: ");
                double aristas = entrada.nextDouble();
                Cubo cubo = new Cubo(nombre, aristas);
                cubo.calcularVolumen();
                System.out.println("| -> Nombre de la figura: "+cubo.getNombre());
                System.out.println("| -> El volumen es: "+cubo.obtenerVolumen());
                break;
            case 2:
                // Area del cilindro
                nombre = "Cilindro";
                System.out.print("Ingrese el radio: ");
                radio = entrada.nextDouble();
                System.out.print("Ingrese la altura: ");
                altura = entrada.nextDouble();
                Cilindro cilindro = new Cilindro(nombre, radio, altura);
                cilindro.calcularVolumne();
                System.out.println("| -> Nombre de la figura: "+cilindro.getNombre());
                System.out.println("| -> El área es: "+cilindro.obtenerVolumen());
                break;
            case 3:
                // Area del cono
                nombre = "Cono";
                System.out.print("Ingrese el radio: ");
                radio = entrada.nextDouble();
                System.out.print("Ingrese la altura: ");
                altura = entrada.nextDouble();
                Cono cono = new Cono(nombre, altura, radio);
                cono.calcularVolumen();
                System.out.println("| -> Nombre de la figura: "+cono.getNombre());
                System.out.println("| -> El área es: "+cono.obtenerVolumen());
                break;
            case 4:
                // Area de la esfera
                nombre = "Esfera";
                System.out.print("Ingrese el radio: ");
                radio = entrada.nextDouble();
                Esfera esfera = new Esfera(nombre, radio);
                esfera.calcularVolumne();
                System.out.println("| -> Nombre de la figura: "+esfera.getNombre());
                System.out.println("| -> El área es: "+esfera.obtenerVolumen());
                break;
        }
    }
}
