package herenciaVolumen;

public class Esfera extends Figura{
    private double radio;
    private double volumne;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getVolumne() {
        return volumne;
    }

    public void setVolumne(double volumne) {
        this.volumne = volumne;
    }

    public Esfera(String nombre, double radio){
        this.nombre = nombre;
        this.radio = radio;
    }

    public void calcularVolumne(){
        volumne = -1.333 * 3.1416 * Math.pow(radio,3);
    }

    public double obtenerVolumen(){
        return volumne;
    }
}
