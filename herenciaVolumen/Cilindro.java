package herenciaVolumen;

public class Cilindro extends Figura {
    private double altura;
    private double radio;
    private double volumen;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public Cilindro(String nombre, double radio, double altura){
        this.nombre = nombre;
        this.radio = radio;
        this.altura = altura;
    }

    public void calcularVolumne(){
        volumen = 3.1416 * Math.pow(radio,2) * altura;
    }

    public double obtenerVolumen(){
        return volumen;
    }
}
