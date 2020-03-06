package polimorfismoInversionistas;

public class CuentaMaestra12 extends Inversionista12{
    private double interes;

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public void total() {
        interes = (capital * 12) / 100;
        total = interes * plazo;
    }
}
