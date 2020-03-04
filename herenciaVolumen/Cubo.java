package herenciaVolumen;
public class Cubo extends Figura{
    private double volumen;
    private double arista;

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }

    public Cubo(String nombre, double arista){
        this.nombre = nombre;
        this.arista = arista;
    }

    public void calcularVolumen(){
        volumen = Math.pow(arista,3);
    }

    public double obtenerVolumen(){
        return volumen;
    }
}
