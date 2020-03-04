package herenciaVolumen;

public class Cono extends Figura{
    private double radio;
    private double altura;
    private double volumen;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public Cono(String nombre, double altura, double radio){
        this.nombre = nombre;
        this.altura = altura;
        this.radio = radio;
    }

    public void calcularVolumen(){
        volumen = (-0.333) * 3.1416 * Math.pow(radio,2) * altura;
    }

    public double obtenerVolumen(){
        return volumen;
    }
}
