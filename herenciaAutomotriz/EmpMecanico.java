package herenciaAutomotriz;
import java.util.Scanner;
public class EmpMecanico extends Empleado{
    private int trabajos_realizados;
    private double sueldo_quincenal;
     String reporte;
    Scanner teclado = new Scanner(System.in);
    public EmpMecanico (String nombre, String departamento, String puesto){
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
    }

    public int getTrabajos_realizados() {
        return trabajos_realizados;
    }

    public void setTrabajos_realizados(int trabajos_realizados) {
        this.trabajos_realizados = trabajos_realizados;
    }


    public void calculaSueldoMecanico (){
        System.out.println("Ingrese cuantos trabajos realizo: ");
        trabajos_realizados = teclado.nextInt();
        double cont = 0;
        for (int i = 0; i < trabajos_realizados; i++){
            System.out.println("Ingrese el costo de la reparación: "+(i+1));
            sueldo_quincenal = teclado.nextDouble();
            cont = cont + sueldo_quincenal;
        }
        cont = cont + (cont * 0.04);
        reporte = String.format("%s          %s          %s          %.2f\n",nombre,departamento,puesto,cont);
    }
    public String Obtener_Sueldo_Mec(){
        return reporte;
    }
}
