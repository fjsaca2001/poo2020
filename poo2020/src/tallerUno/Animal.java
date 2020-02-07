package tallerUno;

public class Animal {
    // declaracion de atributos globales
    private int edad;
    private String raza, especie;

    /**
     * metodo para obtener la edad
     * @return this.edadhr
     */
    public int obtener_edad(){
        return edad;
    }

    /**
     * metodo para obtener la raza
     * @return this.raza
     */
    public String obtener_raza(){
        return raza;
    }

    /**
     * metodo para obtener el especie
     * @return this.especie
     */
    public String obtener_especie(){
        return especie;
    }

    /**
     * metodo para actualizar el valor de la variable raza
     */
    public void actualizar_raza(String raza){
        // con el this hacemos referencia a variables globales
        this.raza = raza;
    }

    /**
     * metodo para actualizar el valor de la variable edad
     */
    public void actualizar_edad(int edad){
        // con el this hacemos referencia a variables globales
        this.edad = edad;
    }

    /**
     * metodo para actualizar el valor de la variable especie
     */
    public void actualizar_especie(String especie){
        // con el this hacemos referencia a variables globales
        this.especie = especie;
    }
}
