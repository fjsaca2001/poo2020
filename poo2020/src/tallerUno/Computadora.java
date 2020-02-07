package tallerUno;

public class Computadora {
    // declaracion de atributos globales
    private int precio;
    private String marca, sistema_o, caracteristicas;

    /**
     * metodo para obtener el precio
     * @return this.precio
     */
    public int obtener_precio(){
        return precio;
    }

    /**
     * metodo para obtener la amrca
     * @return this.marca
     */
    public String obtener_marca(){
        return marca;
    }

    /**
     * metodo para obtener el sistema operativo
     * @return this.sistema_o
     */
    public String obtener_sistemaO(){
        return sistema_o;
    }

    /**
     * metodo para obtener las caracteristicas
     * @return this.caracteristicas
     */
    public String obtener_caracteristicas(){
        return caracteristicas;
    }

    /**
     * metodo para actualizar el valor de la variable marca
     */
    public void actualizar_marca(String marca){
        // con el this hacemos referencia a variables globales
        this.marca  = marca;
    }

    /**
     * metodo para actualizar el valor de la variable sistema_o
     */
    public void actualizar_sistemaO(String sistema_o){
        // con el this hacemos referencia a variables globales
        this.sistema_o = sistema_o;
    }

    /**
     * metodo para actualizar el valor de la variable precio
     */
    public void actualizar_precio(int precio){
        // con el this hacemos referencia a variables globales
        this.precio = precio;
    }

    /**
     * metodo para actualizar el valor de la variable lugar_trabajo
     */
    public void actualizar_caracteristica(String caracteristicas){
        // con el this hacemos referencia a variables globales
        this.caracteristicas = caracteristicas;
    }
}
