package tallerUno;

public class Docente {
    // declaracion de atributos globales
    private String materia, horario, departamento, nombre, lugar_trabajo;

    /**
     * metodo para obtener el materia
     * @return this.materia
     */
    public String obtener_materia(){
        return materia;
    }

    /**
     * metodo para obtener el horario
     * @return this.horario
     */
    public String obtener_horario(){
        return horario;
    }

    /**
     * metodo para obtener el departamento
     * @return this.departamento
     */
    public String obtener_departamento(){
        return departamento;
    }

    /**
     * metodo para obtener el nombre
     * @return this.nombre
     */
    public String obtener_nombre(){
        return nombre;
    }

    /**
     * metodo para obtener el lugar de trabajo
     * @return this.lugar_trabajo
     */
    public String obtener_lugar_tranajo(){
        return lugar_trabajo;
    }

    /**
     * metodo para actualizar el valor de la variable materia
     */
    public void actualizar_materia(String materia){
        // con el this hacemos referencia a variables globales
        this.materia = materia;
    }

    /**
     * metodo para actualizar el valor de la variable horario
     */
    public void actualizar_horario(String horario){
        // con el this hacemos referencia a variables globales
        this.horario  = horario;
    }

    /**
     * metodo para actualizar el valor de la variable departamento
     */
    public void actualizar_departamento(String departamento){
        // con el this hacemos referencia a variables globales
        this.departamento = departamento;
    }

    /**
     * metodo para actualizar el valor de la variable nombre
     */
    public void actualizar_nombre(String nombre){
        // con el this hacemos referencia a variables globales
        this.nombre = nombre;
    }

    /**
     * metodo para actualizar el valor de la variable lugar_trabajo
     */
    public void actualizar_lugartrabajo(String lugar_trabajo){
        // con el this hacemos referencia a variables globales
        this.lugar_trabajo = lugar_trabajo;
    }
}
