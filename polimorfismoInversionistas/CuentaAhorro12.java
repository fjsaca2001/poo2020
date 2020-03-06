package polimorfismoInversionistas;

public class CuentaAhorro12 extends Inversionista12{
    private double interes;

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }


    @Override
    public void total() {
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
        total = interes * plazo;
    }
}
