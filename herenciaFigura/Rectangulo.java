package herenciaFigura;

public class Rectangulo extends Figura{
    private double baseRectangulo;
    private double alturaRectangulo;
    private double areaRectangulo;

    public double getBaseRectangulo() {
        return baseRectangulo;
    }

    public void setBaseRectangulo(double baseRectangulo) {
        this.baseRectangulo = baseRectangulo;
    }

    public double getAlturaRectangulo() {
        return alturaRectangulo;
    }

    public void setAlturaRectangulo(double alturaRectangulo) {
        this.alturaRectangulo = alturaRectangulo;
    }

    public double getAreaRectangulo() {
        return areaRectangulo;
    }

    public void setAreaRectangulo(double areaRectangulo) {
        this.areaRectangulo = areaRectangulo;
    }

    public Rectangulo(String nombre, double baseRectangulo, double alturaRectangulo){
            this.nombre = nombre;
            this.alturaRectangulo = alturaRectangulo;
            this.baseRectangulo = baseRectangulo;
    }

    public double calcularAreaRectangulo(){
        areaRectangulo = baseRectangulo * alturaRectangulo;
        return areaRectangulo;
    }
}
