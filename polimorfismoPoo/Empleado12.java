package polimorfismoPoo;

public abstract class Empleado12 {
    // declaracion de variables que se heredaran
    protected String nombre;
    protected String departamento;
    protected String puesto;
    protected double sueldo;

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

    public double getSueldo() {
        return sueldo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * Metodo abstracto que sera implementado
     * dentro de las clases hijas
     */
    public abstract void calcularSalario();
}
