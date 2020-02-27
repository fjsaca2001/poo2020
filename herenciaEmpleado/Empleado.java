package herenciaEmpleado;

public class Empleado {
    // variables globales y que se pueden heredar
    protected String nombre;
    protected String cargo;
    protected String dependencia;

    // entrada de datos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDependencia() {
        return dependencia;
    }
    // constructor de la clase
    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
}
