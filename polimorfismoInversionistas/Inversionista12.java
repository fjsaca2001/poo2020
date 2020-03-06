package polimorfismoInversionistas;
// clase madre
public abstract class Inversionista12 {
    // variables que seran heredadas
    protected String nombre;
    protected String nroCuenta;
    protected double capital;
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

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * metodo usado para el polimorfismo
     */
    public abstract void total();


}
