package diseñoPoo;

public class Cerveza {
    private double precio;
    private int unidades;
    private String nombre;
    private String tipo;

    /**
     * Metodo para constructor de la clase persona
     * @param tipo
     * @param unidades
     * @param nombre
     * @param precio
     */
    public Cerveza(double precio, int unidades, String nombre, String tipo){
        this.nombre = nombre;
        this.precio = precio;
        this.unidades = unidades;
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double calcularVentas (){
        return precio*unidades;
    }

    public void presentarDatos(){
        System.out.println("Cerveceria Nacional del Ecuador\nPrecio: $"+precio+
                "\nUnidades: "+tipo+"\nUnidad:"+ unidades+"\nNombre: "
                +nombre+"\nPrecio Total: $"+calcularVentas());
    }
}
