package polimorfismoFigura;
import java.util.Scanner;

public class EjecutaFigura1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
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
        entrada.nextLine();
        switch (n){
            case 1:
                // Área triángulo
                Triangulo1 triangulo = new Triangulo1();
                System.out.println("Ingrese el nombre de la figura: ");
                triangulo.setNombre(entrada.nextLine());
                System.out.print("Ingrese la base: ");
                triangulo.setBaseT(entrada.nextDouble());
                System.out.print("Ingrese la altura: ");
                triangulo.setAlturaT(entrada.nextDouble());
                triangulo.calcularArea();
                System.out.println("| -> Nombre de la figura: "+triangulo.getNombre());
                System.out.println("| -> El área es: "+triangulo.getArea());
                break;
            case 2:
                // Área cuadrado
                Cuadrado1 cuadrado = new Cuadrado1();
                System.out.println("Ingrese el nombre de la figura: ");
                cuadrado.setNombre(entrada.nextLine());
                System.out.print("Ingrese el lado: ");
                cuadrado.setLado(entrada.nextDouble());
                cuadrado.calcularArea();
                System.out.println("___________________________________________");
                System.out.println("| -> Nombre de la figura: "+cuadrado.getNombre());
                System.out.println("| -> El área es: "+cuadrado.getArea());
                System.out.println("___________________________________________");
                break;
            case 3:
                // Área rectángulo
                Rectangulo1 rectangulo = new Rectangulo1();
                System.out.println("Ingrese el nombre de la figura: ");
                rectangulo.setNombre(entrada.nextLine());
                System.out.print("Ingrese la base: ");
                rectangulo.setBase(entrada.nextDouble());
                System.out.print("Ingrese la altura: ");
                rectangulo.setAltura(entrada.nextDouble());
                System.out.println("___________________________________________");
                System.out.println("| -> Nombre de la figura: "+rectangulo.getNombre());
                System.out.println("| -> El área es: "+rectangulo.getArea());
                System.out.println("___________________________________________");
                break;
            case 4:
                // Área círculo
                Circulo1 circulo = new Circulo1();
                System.out.println("Ingrese el nombre de la figura: ");
                circulo.setNombre(entrada.nextLine());
                System.out.print("Ingrese el radio: ");
                circulo.setRadio(entrada.nextDouble());
                circulo.calcularArea();
                System.out.println("___________________________________________");
                System.out.println("| -> Nombre de la figura: "+circulo.getNombre());
                System.out.println("| -> El área es: "+circulo.getArea());
                System.out.println("___________________________________________");
                break;
        }
    }
}
