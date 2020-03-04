package herenciaInversionistas;
// clase hija
public class CuentaAhorro extends Inversionista{
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
    public CuentaAhorro(int nroCliente, String nombre, String nroCuenta, double capital, int plazo){
            this.nroCliente = nroCliente;
            this.nombre = nombre;
            this.nroCuenta = nroCuenta;
            this.capital = capital;
            this.plazo = plazo;
    }
    // calculo del pagoGanado y concatenacion de los datos
    public void calcularInversiones(){
        // segun la cantidad de capital el interes cambia
        if(capital >= 1000000){
            interes = (capital * 1.75) / 100;
        }else{
            if (capital < 1000000 && capital >= 50001){
                interes = (capital * 1.50) / 100;
            }
            else{
                if(capital >= 10001 && capital <= 50000){
                    interes = (capital * 1) / 100;
                }else{
                    if(capital >= 3001 && capital <= 10000){
                        interes = (capital * 0.75) / 100;
                    }else {
                        if(capital >= 501 && capital <= 3000){
                            interes = (capital * 0.25) / 100;
                        }else {
                            interes =  (capital * 0.05) / 100;
                        }
                    }
                }
            }
        }
        pagoGanado = interes * plazo;
        reporte = String.format("%d                 %s                %s                 %.2f\n",nroCliente,nombre,nroCuenta,pagoGanado);
    }
    // retorno del reporte
    public String obtenerReporte(){
        return reporte;
    }

}
