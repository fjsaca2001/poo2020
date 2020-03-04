package herenciaAutomotriz;

public class EmpAdmvo extends Empleado{
    private double  sueldo_mensual;
    private double sueldo_quincenal;
    private String reporte;
    public EmpAdmvo(String nombre, String departamento, String puesto, double sueldo_mensual){
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.sueldo_mensual = sueldo_mensual;
    }

    public double getSueldo_mensual() {
        return sueldo_mensual;
    }

    public void setSueldo_mensual(double sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }

    public String getReporte() {
        return reporte;
    }

    public void setReporte(String reporte) {
        this.reporte = reporte;
    }

    public void calculaSueldoAdm(){
        sueldo_quincenal = sueldo_mensual / 2;
        reporte = String.format("%s          %s          %s          %.2f\n",nombre,departamento,puesto,sueldo_quincenal);
    }
    public String Obtener_Sueldo_Adm(){
        return reporte;
    }


}
