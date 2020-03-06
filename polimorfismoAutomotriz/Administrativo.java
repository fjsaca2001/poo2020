package polimorfismoAutomotriz;

public class Administrativo extends Empleado13 {
    private double sueldo_quincenal;

    public void setSueldo_mensual(double sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }

    public void setSueldo_quincenal(double sueldo_quincenal) {
        this.sueldo_quincenal = sueldo_quincenal;
    }

    public double getSueldo_quincenal() {
        return sueldo_quincenal;
    }

    @Override
    public void sueldo() {
        sueldo_quincenal = sueldo_mensual / 2;
    }

}
