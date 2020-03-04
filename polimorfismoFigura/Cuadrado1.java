package polimorfismoFigura;

public class Cuadrado1 extends Figura1 {
    private double lado;
    @Override
    public void calcularArea() {
        area = lado * lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
