package deber_seleccion;

public class Sueldo {
    // declaracion de variables globales
    private String nombre;
    private int horas;
    private double sueldo;
    private double cuota;

    /**
     * Constructor de la clase Sueldo
     */
    public Sueldo(String nombre, int horas, double cuota){
        this.nombre = nombre;
        this.horas = horas;
        this.cuota = cuota;
    }
    // almacenamiento de datos en la variable nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // almacenamiento de datos en la variable horas
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    // almacenamiento de datos en la variable sueldo
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    // almacenamiento de datos en la variable cuota
    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }
    // metodo para calcular el sueldo
    public void calculaSueldo(){
        // Condicion si el sueldo es menor o igual a 40
        if(horas <= 40){
            sueldo = horas * cuota;
        }else {
            // Condicion si el sueldo es menor o igual a 50
            if (horas <= 50) {
                sueldo = (40 * cuota) + ((horas - 40) * (cuota * 2));
            } else {
                // si no se cumple se procede a calcular el suelo con el triple
                sueldo = ((40 * cuota) + (10 * cuota * 2)) + ((horas - 50) + (cuota * 3));
            }
        }
    }
    // metodo que retorna el nombre
    public String obtenerNombre(){
        return nombre;
    }
    // Metodo que retorna el sueldo del empleado
    public double obtenerSueldo(){
        return sueldo;
    }
}
