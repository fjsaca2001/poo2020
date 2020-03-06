package polimorfismoVolumen;

public class Cubo12 extends Figura12{
    private double arista;

    public void setArista(double arista) {
        this.arista = arista;
    }

    @Override
    public void calcularVolumen() {
        volumen = Math.pow(arista,3);
    }


}
