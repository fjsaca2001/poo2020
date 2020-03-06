package polimorfismoAutomotriz;

import java.util.Scanner;

public class Mecanico extends Empleado13{
    private int trabajos_realizados;
    private double cont;

    public double getCont() {
        return cont;
    }

    public void setCont(double cont) {
        this.cont = cont;
    }

    public int getTrabajos_realizados() {
        return trabajos_realizados;
    }

    public void setTrabajos_realizados(int trabajos_realizados) {
        this.trabajos_realizados = trabajos_realizados;
    }

    Scanner teclado = new Scanner(System.in);

    @Override
    public void sueldo() {
        double sueldo_quincenal;
        System.out.println("Ingrese cuantos trabajos realizo: ");
        trabajos_realizados = teclado.nextInt();
        for (int i = 0; i < trabajos_realizados; i++){
            System.out.println("Ingrese el costo de la reparación: "+(i+1));
            sueldo_quincenal = teclado.nextDouble();
            cont = cont + sueldo_quincenal;
        }
        cont = cont + (cont * 0.04);
    }

}
