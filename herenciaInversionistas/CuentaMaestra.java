package herenciaInversionistas;
// clase hija
public class CuentaMaestra extends Inversionista{
    // variables propias de la case
    private double pagoGanado;
    private String reporte;
    private double interes;
    public double getPagoGanado() {
        return pagoGanado;
    }

    public void setPagoGanado(double pagoGanado) {
        this.pagoGanado = pagoGanado;
    }

    public String getReporte() {
        return reporte;
    }

    public void setReporte(String reporte) {
        this.reporte = reporte;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    // constructor de la clase
    public CuentaMaestra(int nroCliente, String nombre, String nroCuenta, double capital, int plazo){
        this.nroCliente = nroCliente;
        this.nombre = nombre;
        this.nroCuenta = nroCuenta;
        this.capital = capital;
        this.plazo = plazo;
    }
    // calculo del pagoGanado y concatenacion de los datos
    public void calcularInversiones(){
        interes = (capital * 12) / 100;
        pagoGanado = interes * plazo;
        reporte = String.format("%d                 %s                %s                 %.2f\n",nroCliente,nombre,nroCuenta,pagoGanado);
    }
    // retorno del reporte
    public String obtenerReporte(){
        return reporte;
    }
}
