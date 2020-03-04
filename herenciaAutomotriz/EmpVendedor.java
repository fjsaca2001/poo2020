package herenciaAutomotriz;
import java.util.Scanner;
public class EmpVendedor extends Empleado{
    private int autos_vendidos;
    private double sueldo_quincenal;
    private String reporte;2
    Scanner teclado = new Scanner(System.in);
    public EmpVendedor (String nombre, String departamento, String puesto){
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
    }

    public int getAutos_vendidos() {
        return autos_vendidos;
    }

    public void setAutos_vendidos(int autos_vendidos) {
        this.autos_vendidos = autos_vendidos;
    }

    public String getReporte() {
        return reporte;
    }

    public void setReporte(String reporte) {
        this.reporte = reporte;
    }

    public void calculaSueldoVendedor (){
        System.out.println("Ingrese cuantos autos vendió: ");
        autos_vendidos = teclado.nextInt();
        double cont =0;
        double aux = 0;
        for (int i=0; i < autos_vendidos; i++){
            System.out.println("Ingrese el costo del auto "+(i+1));
            sueldo_quincenal= teclado.nextDouble();
            aux += sueldo_quincenal;
        }
        cont = 400 + (aux * 0.02);
        reporte = String.format("%s          %s          %s          %.2f\n",nombre,departamento,puesto,cont);
    }
    public String Obtener_Sueldo_Ven(){
        return reporte;
    }
}
