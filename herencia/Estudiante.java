package herencia;

/**
 * Clase que hereda de la clase persona que contendra
 * todos los atributos y metodos definidos en persona
 */
public class Estudiante extends Persona {

    // atributos propios de la clase
    private String carrera;

    /***
     * Constructor de la clase Estudiante
     * @param carrera
     * @param nombre
     * @param identificacion
     * @param estado_civil
     * @param fecha_nacimiento
     */
    public Estudiante(String carrera, String nombre, String identificacion, String estado_civil, String fecha_nacimiento)
    {
        this.carrera = carrera;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.estado_civil = estado_civil;
        this.fecha_nacimineto = estado_civil;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void matricular(){
        System.out.println("Estudiante matriculado");
    }

    public void aprender(){
        System.out.println("Estudiante que aprende");
    }
}
