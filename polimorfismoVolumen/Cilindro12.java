package polimorfismoVolumen;

public class Cilindro12 extends Figura12 {
    private double altura;
    private double radio;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularVolumen() {
        volumen = 3.1416 * Math.pow(radio,2) * altura;
    }


}
