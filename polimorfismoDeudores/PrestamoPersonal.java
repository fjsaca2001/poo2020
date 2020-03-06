package polimorfismoDeudores;

public class PrestamoPersonal extends ClienteDeudor{
    private double interes;

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public void pago() {
        interes = capital * 0.1730;
        total = capital + (interes * plazo);
    }
}
