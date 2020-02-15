/**
 * Integrantes: Frank Saca, Jeferson Cueva, Isaias Silva
 */
package taller_repeticion;

public class Cajero {

    private int saldo;
    private String nombre;

    /**
     * constructor para la clase Cajero
     * @param saldo
     */
    public Cajero (int saldo, String nombre){
        this.saldo = saldo;
        this.nombre = nombre;

    }
    public int consultar_saldo() {
        return saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * metodo para realizar un deposito
     * @param valor_deposito
     */
    public void depositar(int valor_deposito) {
        if (valor_deposito > 0) {
            saldo = saldo + valor_deposito;
        }else{
            System.out.println("El valor ingresado no es correcto");
        }
/**
 * metodo para retirar dinero
 */
    }
    public void retirar(int valor_retiro){
        if (valor_retiro <= saldo) {
            saldo = saldo - valor_retiro;

        }else{
            System.out.println("El valor ingresado no es correcto");
        }

    }
}
