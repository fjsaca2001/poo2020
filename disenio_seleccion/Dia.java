package disenio_seleccion;

public class Dia {
    // variables globales
    private int numero;
    private String dia;
    // almacenamiendo de datos
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    // almacenamiendo de datos
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    /**
     * Metodo para constructor de la clase Dia
     * @param numero
     */
    public Dia(int numero){
        this.numero = numero;
    }
    // metodo para calcular el dia
    public void calcularDia(){
        // sentencia para validar que dia es.
        switch (numero){
            case 1: dia = "Domingo";
            break;
            case 2: dia = "Lunes";
            break;
            case 3: dia = "Martes";
            break;
            case 4: dia = "Miercoles";
            break;
            case 5: dia = "Jueves";
            break;
            case 6: dia = "Viernes";
            break;
            case 7: dia = "Sabado";
            break;
            // caso por defecto
            default: dia = "No valido";
        }
    }
    // metodo que retorna el dia
    public String obtenerDia(){
        return dia;
    }
}
