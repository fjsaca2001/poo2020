package polimorfismoVolumen;

public class Esfera12 extends Figura12{
    private double radio;


    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void calcularVolumen(){
        volumen = -1.333 * 3.1416 * Math.pow(radio,3);
    }
}
