package polimorfismoVolumen;

public abstract class Figura12 {
    protected String nombre;
    protected double volumen;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public abstract void calcularVolumen();
}
