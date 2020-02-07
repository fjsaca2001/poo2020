package introPoo;
public class Tiempo {
    // declaracion de atributos globales
    private int hora, minuto, segundo;

    /**
     * metodo para obtener el valor de la variable hora
     * @return this.hora
     */
    public int obtener_hora(){
        return hora;
    }

    /**
     * metodo para obtener el valor de la variable minuto
     * @return this.minuto
     */
    public int obtener_minuto(){
        return minuto;
    }

    /**
     * metodo para obtener el valor de la variable segundo
     * @return this.segundo
     */
    public int obtener_segundo(){
        return segundo;
    }

    /**
     * metodo para obtener el valor de la variable tiempo
     * @return concatenacion de cadena.
     */
    public String obtener_tiempo(){
        String tiempo = hora + ":" + minuto + ":" + segundo;
        return tiempo;
    }

    /**
     * metodo para acualizar el valor de la variable hora actualizada
     * @return hora
     */
    public void actualizar_hora(int hora){
        // con el this hacemos referencia a variables globales
        this.hora = hora;
    }

    /**
     * metodo para acualizar el valor de la variable actualizar miuto
     * @return minuto
     */
    public void actualizar_minuto(int minuto){
        // con el this hacemos referencia a variables globales
        this.minuto = minuto;
    }

    /**
     * metodo para acualizar el valor de la variable segundo
     *
     * @return segundo
     */
    public void actualizar_segundo(int segundo){
        // con el this hacemos referencia a variables globales
        this.segundo = segundo;
    }
}
