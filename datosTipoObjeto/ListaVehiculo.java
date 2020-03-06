package datosTipoObjeto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaVehiculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        boolean b = true;
        System.out.println("Sistema de ingreso de vehiculos");
        do {
            System.out.println("Dijite 1 para almacenar un nuevo vehiculo.");
            System.out.println("Dijite 2 para presentar.");
            System.out.println("Dijite 3 para salir.");
            int c = entrada.nextInt();
            entrada.nextLine();
            switch (c){
                case 1:

                    Vehiculo vehiculo = new Vehiculo();
                    System.out.print("Ingrese placa: ");
                    vehiculo.setPlaca(entrada.nextLine());
                    System.out.print("Ingrese marca: ");
                    vehiculo.setMarca(entrada.nextLine());
                    System.out.print("Ingrese modelo: ");
                    vehiculo.setModelo(entrada.nextLine());
                    System.out.print("Ingrese color: ");
                    vehiculo.setColor(entrada.nextLine());
                    System.out.print("Ingrese año: ");
                    vehiculo.setAnio(entrada.nextInt());
                    entrada.nextLine();
                    System.out.print("Ingrese cilindraje: ");
                    vehiculo.setCilindraje(entrada.nextInt());
                    entrada.nextLine();
                    vehiculos.add(vehiculo);

                    break;
                case 2:
                    //System.out.println("Vehiculos Ingresados");
                    for (Vehiculo v: vehiculos) {
                        /*
                        System.out.println("Placa: "+v.getPlaca()+"\nMarca: "+v.getMarca()+"\nCilindraje: "+
                                v.getCilindraje());*/
                        System.out.println("---------------------------------");
                        System.out.println("Placa: "+v.getPlaca());
                        System.out.println("Marca: "+v.getMarca());
                        System.out.println("Cilindraje: "+v.getCilindraje());
                        System.out.println("Año: "+v.getAnio());
                        System.out.println("Modelo: "+v.getModelo());
                        System.out.println("Color: "+v.getColor());
                        System.out.println("---------------------------------");
                    }

                    break;

                case 3:

                    b = false;

                    break;
                default:
                    System.out.println("Incorrecto. verifique su respuesta");
            }
        }while (b);
    }
}
