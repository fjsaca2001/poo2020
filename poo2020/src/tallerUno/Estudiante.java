package tallerUno;

public class Estudiante {
    // declaracion de atributos globales
    private int edad;
    private String nombre, carrera, ciclo, genero;

    /**
     * metodo para obtener la edad
     * @return this.edad
     */
    public int obtener_edad(){
        return edad;
    }

    /**
     * metodo para obtener el nombre
     * @return this.nombre
     */
    public String obtener_nombre(){
        return nombre;
    }

    /**
     * metodo para obtener la carrera
     * @return this.carrera
     */
    public String obtener_carrea(){
        return carrera;
    }

    /**
     * metodo para obtener el ciclo
     * @return this.ciclo
     */
    public String obtener_ciclo(){
        return ciclo;
    }

    /**
     * metodo para obtener el genero
     * @return this.genero
     */
    public String obtener_genero(){
        return genero;
    }

    /**
     * metodo para acualizar el valor de la variable segundo
     *
     * @return segundo
     */
    public void actializar_edad(int edad){
        // con el this hacemos referencia a variables globales
        this.edad = edad;
    }

    /**
     * metodo para actualizar el valor de la variable nomber
     */
    public void actializar_nombre(String nombre){
        // con el this hacemos referencia a variables globales
        this.nombre = nombre;
    }

    /**
     * metodo para acualizar el valor de la variable carrera
     */
    public void actializar_carrera(String carrera){
        // con el this hacemos referencia a variables globales
        this.carrera = carrera;
    }

    /**
     * metodo para acualizar el valor de la variable ciclo
     */
    public void actializar_ciclo(String ciclo){
        // con el this hacemos referencia a variables globales
        this.ciclo = ciclo;
    }

    /**
     * metodo para acualizar el valor de la variable genero
     */
    public void actializar_genero(String genero){
        // con el this hacemos referencia a variables globales
        this.genero = genero;
    }
}
