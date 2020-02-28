package herenciaFigura;

public class Triangulo extends Figura{
    private double baseTriangulo;
    private double alturaTriangulo;
    private double areaTriangulo;

    public double getBaseTriangulo() {
        return baseTriangulo;
    }

    public void setBaseTriangulo(double baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    public double getAlturaTriangulo() {
        return alturaTriangulo;
    }

    public void setAlturaTriangulo(double alturaTriangulo) {
        this.alturaTriangulo = alturaTriangulo;
    }

    public double getAreaTriangulo() {
        return areaTriangulo;
    }

    public void setAreaTriangulo(double areaTriangulo) {
        this.areaTriangulo = areaTriangulo;
    }

    public Triangulo(String nombre, double baseTriangulo, double alturaTriangulo){
        this.nombre = nombre;
        this.alturaTriangulo = alturaTriangulo;
        this.baseTriangulo = baseTriangulo;
    }

    public void calcularAreaTriangulo(){
        areaTriangulo = (baseTriangulo * alturaTriangulo)/2;
    }

    public double obtenerAreaTriangulo(){
        return areaTriangulo;
    }
}
