package polimorfismoFigura;
public class Rectangulo1 extends Figura1{
    private double base;
    private double altura;



    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        area = base * altura;
    }
}