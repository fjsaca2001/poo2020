package polimorfismoFigura;

import java.util.Random;

public class Circulo1 extends Figura1{
    private double radio;

    @Override
    public void calcularArea() {
        area = 3.14 * Math.pow(radio,2);
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
