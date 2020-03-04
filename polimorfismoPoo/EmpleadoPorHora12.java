package polimorfismoPoo;


public class EmpleadoPorHora12 extends Empleado12{
    // Variables propias de la clase
    private int horas;
    private double cuota;

    /**
     * metodos set para el almacenamiento de datos
     * @return
     */

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    @Override
    public void calcularSalario() {
        sueldo = cuota * horas;
    }
}
