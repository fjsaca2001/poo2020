package herenciaFigura;

public class Cuadrado extends Figura{
    private double ladoCuadrado;
    private double areaCuadrado;

    public double getLadoCuadrado() {
        return ladoCuadrado;
    }

    public void setLadoCuadrado(double ladoCuadrado) {
        this.ladoCuadrado = ladoCuadrado;
    }

    public double getAreaCuadrado() {
        return areaCuadrado;
    }

    public void setAreaCuadrado(double areaCuadrado) {
        this.areaCuadrado = areaCuadrado;
    }

    public Cuadrado(String nombre, double ladoCuadrado){
        this.nombre = nombre;
        this.ladoCuadrado = ladoCuadrado;
    }

    public void calcularAreaCuadrado(){
        areaCuadrado = ladoCuadrado * ladoCuadrado;
    }

    public double obtenerAreaCuadrado(){
        return areaCuadrado;
    }
}
