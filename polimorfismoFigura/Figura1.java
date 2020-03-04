package polimorfismoFigura;
// clase madre
public abstract class Figura1{
    protected String nombre;
    protected double area;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    }

    /**
     * metodo usado para el polimorfismo
     */
    public abstract void calcularArea();
}
