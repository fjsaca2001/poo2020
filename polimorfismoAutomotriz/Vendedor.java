package polimorfismoAutomotriz;

import java.util.Scanner;

public class Vendedor extends Empleado13{
    private int autos_vendidos;
    private double cont;

    public int getAutos_vendidos() {
        return autos_vendidos;
    }

    public void setAutos_vendidos(int autos_vendidos) {
        this.autos_vendidos = autos_vendidos;
    }


    public double getCont() {
        return cont;
    }

    public void setCont(double cont) {
        this.cont = cont;
    }

    Scanner teclado = new Scanner(System.in);
    @Override
    public void sueldo() {
        double sueldo_quincenal;
        System.out.println("Ingrese cuantos autos vendió: ");
        autos_vendidos = teclado.nextInt();
        double aux = 0;
        for (int i=0; i < autos_vendidos; i++){
            System.out.println("Ingrese el costo del auto "+(i+1));
            sueldo_quincenal= teclado.nextDouble();
            aux += sueldo_quincenal;
        }
        cont = 400 + (aux * 0.02);
    }

}
