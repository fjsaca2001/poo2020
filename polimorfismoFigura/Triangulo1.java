package polimorfismoFigura;

public class Triangulo1 extends Figura1{
    private double baseT;
    private double alturaT;
    @Override
    public void calcularArea() {
        area = (baseT * alturaT) / 2;
    }

    public void setBaseT(double baseT) {
        this.baseT = baseT;
    }

    public void setAlturaT(double alturaT) {
        this.alturaT = alturaT;
    }
}
