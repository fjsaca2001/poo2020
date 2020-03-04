package polimorfismoPoo;

public class EmpleadoAsalariado12 extends Empleado12{
    // Variables propias de la clase
    private double sueldoMensual;

    /**
     * metodos set para el almacenamiento de datos
     * @return
     */

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    @Override
    public void calcularSalario() {
        sueldo = sueldoMensual / 2;
    }
}
