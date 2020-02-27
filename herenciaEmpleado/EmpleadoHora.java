package herenciaEmpleado;

public class EmpleadoHora extends Empleado {
    // varaibles globales
    private int horas;
    private double valorHora;
    private double sueldo;
    // asignacion de valores
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // constructor de la clase
    public EmpleadoHora(int horas, double valorHora, String nombre, String cargo, String dependencia){
        this.horas = horas;
        this.valorHora = valorHora;
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
    }

    // metodo que calcula el suedo
    public double calcularSueldo(){
        sueldo = horas * valorHora;
        return sueldo;
    }
}
