package herenciaEmpleado;

public class EmpleadoAsalariado extends Empleado {
    // variable global
    private double valorMensual;
    // asignacion de las variables
    public double getValorMensual() {
        return valorMensual;
    }

    public void setValorMensual(double valorMensual) {
        this.valorMensual = valorMensual;
    }
    // constructor de la clase
    public EmpleadoAsalariado(double valorMensual, String nombre, String cargo, String dependencia){
        this.valorMensual = valorMensual;
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
    }
}
