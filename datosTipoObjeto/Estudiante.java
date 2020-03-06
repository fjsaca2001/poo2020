package datosTipoObjeto;

public class Estudiante {
    private String nombre;
    private String carrera;
    private String cedula;
    private String correo;
    private int edad;

    /*
    public Estudiante(String nombre, String carrera, String cedula, String correo, int edad) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.cedula = cedula;
        this.correo = correo;
        this.edad = edad;
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
    */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
