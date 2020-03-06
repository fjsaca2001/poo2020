package polimorfismoDeudores;
// clase madre
public abstract class ClienteDeudor {
    // variables que seran heredadas
    protected String nombre;
    protected String nroCuenta;
    protected Double capital;
    protected int plazo;
    protected double total;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public abstract void pago();

    public double getTotal() {
        return total;
    }

    /**
     * metodo usado para el polimorfismo
     */
    public void setTotal(double total) {
        this.total = total;
    }
}
