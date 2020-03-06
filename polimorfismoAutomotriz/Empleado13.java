package polimorfismoAutomotriz;
// clase madre
public abstract class Empleado13 {
    // variables que seran heredadas
    protected String nombre;
    protected String departamento;
    protected String puesto;
    protected double sueldo;
    protected double sueldo_mensual;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo_mensual() {
        return sueldo_mensual;
    }

    public void setSueldo_mensual(double sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }
    /**
     * metodo usado para el polimorfismo
     */
    public abstract void sueldo();

}
