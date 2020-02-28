package herenciaFigura;

public class Circulo extends Figura{
    private double radio;
    private double areaCirculo;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAreaCirculo() {
        return areaCirculo;
    }

    public void setAreaCirculo(double areaCirculo) {
        this.areaCirculo = areaCirculo;
    }

    public Circulo(String nombre, double radio){
        this.nombre = nombre;
        this.radio = radio;
    }

    public void calcularAreaCirculo(){
        areaCirculo = (3.1416 * Math.pow(radio,2));
    }

    public double obtenerAreaCirculo(){
        return areaCirculo;
    }
}
