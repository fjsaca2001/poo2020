package disenio_seleccion;

public class Empleado {
    // variables grobales
    private String nombre;
    private int horas;
    private double cuota;
    private double sueldo;

    /**
     * Metodo para constructor de la clase Empleado
     * @param nombre
     * @param horas
     * @param cuota
     */
    public Empleado(String nombre, int horas, double cuota){
        this.nombre = nombre;
        this.horas = horas;
        this.cuota = cuota;
    }

    // metodos para la entrada de los datos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    // Metodo que calcula el sueldo
    public void calcularSueldo(){
        // validacion si las las horas son menores que 40
        if (horas <= 40){
            // calculo del sueldo
            sueldo = horas * cuota;
        }else {
            // calculo del sueldo si es mayor a 40
            sueldo = (40 * cuota) + (horas - 40) * (cuota * 2);
        }
    }

    // metodo para presentar el nombre del empleado
    public void obtenerNombre(){
        System.out.println(nombre);
    }

    // metodo para presentar el sueldo del empleado
    public void obtenerSueldo(){
        System.out.println(sueldo);
    }
}
