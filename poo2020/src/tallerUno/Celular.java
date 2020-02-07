package tallerUno;

public class Celular {
    // declaracion de atributos globales
    private int pantalla;
    private String marca, modelo, capacidad, gama;

    /**
     * metodo para obtener la marca
     * @return this.marca
     */
    public String obtener_marca(){
        return marca;
    }

    /**
     * metodo para obtener el modelo
     * @return this.modelo
     */
    public String obtener_modelo(){
        return modelo;
    }

    /**
     * metodo para obtener la capacidad
     * @return this.capacidad
     */
    public String obtener_capacidad(){
        return capacidad;
    }

    /**
     * metodo para obtener la gama
     * @return this.gama
     */
    public String obtener_gama(){
        return gama;
    }

    /**
     * metodo para obtener el tamaño de la patalla
     * @return this.pantalla
     */
    public int obtener_pantalla(){
        return pantalla;
    }

    /**
     * metodo para actualizar el valor de la variable marca
     */
    public void actualizar_marca(String marca){
        // con el this hacemos referencia a variables globales
        this.marca = marca;
    }

    /**
     * metodo para actualizar el valor de la variable modelo
     */
    public void actualizar_modelo(String modelo){
        // con el this hacemos referencia a variables globales
        this.modelo = modelo;
    }

    /**
     * metodo para actualizar el valor de la variable capacidad
     */
    public void actualizar_capacidad(String capacidad){
        // con el this hacemos referencia a variables globales
        this.capacidad = capacidad;
    }

    /**
     * metodo para actualizar el valor de la variable gama
     */
    public void actualizar_gama(String gama){
        // con el this hacemos referencia a variables globales
        this.gama = gama;
    }

    /**
     * metodo para actualizar el valor de la variable pantalla
     */
    public void actualizar_pantalla(int pantalla){
        // con el this hacemos referencia a variables globales
        this.pantalla = pantalla;
    }
}
