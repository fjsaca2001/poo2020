package datosTipoObjeto;
import java.util.ArrayList;
import java.util.List;
public class EjemploLista {
    public static void main(String[] args) {
        // creacion de una lista en java para almacenar valores de tipo String
        List<String> universidades = new ArrayList<String>();
        universidades.add("UTPL");
        System.out.println("Tamaño de la lista "+universidades.size());
        universidades.add("ESPOL");
        System.out.println("Tamaño de la lista "+universidades.size());
        universidades.add("UNL");
        System.out.println("Tamaño de la lista "+universidades.size());
        // Eliminacion del elemento en la posicion 1
        universidades.remove(1);
        System.out.println("Tamaño de la lista "+universidades.size());
        // Asignar un valor nuevo en cierta posicion
        universidades.set(1, "UIDE");
        // Agregar un nuevo valor en la posicion
        universidades.add(1,"UDLA");
        /*for (int i = 0; i < universidades.size(); i++) {
            System.out.println("Universidad: "+universidades.get(i));
        }*/
        // uso del foreach
        for (String univ: universidades) {
            System.out.println("Universidad: "+ univ);
        }
    }
}
