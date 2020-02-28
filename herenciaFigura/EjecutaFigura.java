package herenciaFigura;
import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int n;
        double base, altura, radio, lado;
        do{
            // Menu para pedir lo que el usuario desea
            System.out.println("_______________________________");
            System.out.println("|| Calculadora de Área       ||");
            System.out.println("|| Ingrese:                  ||");
            System.out.println("|| 1) Área triángulo         ||");
            System.out.println("|| 2) Área cuadrado          ||");
            System.out.println("|| 3) Área rectángulo        ||");
            System.out.println("|| 4) Área cárculo           ||");
            System.out.println("_______________________________");
            n = entrada.nextInt();
        }while(n > 4 || n < 1);
        switch (n){
            case 1:
                // Área triángulo
                nombre = "Triángulo";
                System.out.print("Ingrese la base: ");
                base = entrada.nextDouble();
                System.out.print("Ingrese la altura: ");
                altura = entrada.nextDouble();
                Triangulo triangulo = new Triangulo(nombre, base, altura);
                triangulo.calcularAreaTriangulo();
                System.out.println("| -> Nombre de la figura: "+triangulo.getNombre());
                System.out.println("| -> El área es: "+triangulo.obtenerAreaTriangulo());
                break;
            case 2:
                // Área cuadrado
                nombre = "Cuadrado";
                System.out.print("Ingrese el lado: ");
                lado = entrada.nextDouble();
                Cuadrado cuadrado = new Cuadrado(nombre, lado);
                cuadrado.calcularAreaCuadrado();
                System.out.println("___________________________________________");
                System.out.println("| -> Nombre de la figura: "+cuadrado.getNombre());
                System.out.println("| -> El área es: "+cuadrado.obtenerAreaCuadrado());
                System.out.println("___________________________________________");
                break;
            case 3:
                // Área rectángulo
                nombre = "Rectángulo";
                System.out.print("Ingrese la base: ");
                base = entrada.nextDouble();
                System.out.print("Ingrese la altura: ");
                altura = entrada.nextDouble();
                Rectangulo rectangulo = new Rectangulo(nombre, base, altura);
                System.out.println("___________________________________________");
                System.out.println("| -> Nombre de la figura: "+rectangulo.getNombre());
                System.out.println("| -> El área es: "+rectangulo.calcularAreaRectangulo());
                System.out.println("___________________________________________");
                break;
            case 4:
                // Área círculo
                nombre = "Circulo";
                System.out.print("Ingrese el radio: ");
                radio = entrada.nextDouble();
                Circulo circulo = new Circulo(nombre, radio);
                circulo.calcularAreaCirculo();
                System.out.println("___________________________________________");
                System.out.println("| -> Nombre de la figura: "+circulo.getNombre());
                System.out.println("| -> El área es: "+circulo.obtenerAreaCirculo());
                System.out.println("___________________________________________");
                break;
        }
    }
}
