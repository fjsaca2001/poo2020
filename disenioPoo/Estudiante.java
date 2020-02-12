package disenioPoo;

public class Estudiante {
    // Variables privadas de la clase
    private String nombre;
    private String estado;
    private String nAsignatura;
    private double nota1B;
    private double nota2B;
    private double promedio;

    /**
     * Metodo para constructor de la clase persona
     * @param nombre
     * @param nAsignatura
     * @param nota1B
     * @param nota2B
     */
    public Estudiante(String nombre, String nAsignatura, double nota1B, double nota2B){
        this.nombre = nombre;
        this.nAsignatura = nAsignatura;
        this.nota1B = nota1B;
        this.nota2B = nota2B;
    }

    /**
     * metodos para obtener y actualizar el valores de la variable nombre
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * metodos para obtener y actualizar el valores de la variable estado
     */

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * metodos para obtener y actualizar el valores de la variable nAsignatura
     */

    public String getnAsignatura() {
        return nAsignatura;
    }

    public void setnAsignatura(String nAsignatura) {
        this.nAsignatura = nAsignatura;
    }

    /**
     * metodos para obtener y actualizar el valores de la variable nota1B
     */

    public double getNota1B() {
        return nota1B;
    }

    public void setNota1B(double nota1B) {
        this.nota1B = nota1B;
    }

    /**
     * metodos para obtener y actualizar el valores de la variable nota2B
     */

    public double getNota2B() {
        return nota2B;
    }

    public void setNota2B(double nota2B) {
        this.nota2B = nota2B;
    }

    /**
     * metodos para obtener y actualizar el valores de la variable promedio
     */

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    // metodo calculador del promedio
    public int promedio() {
        // calculo y redondeo del promedio
        promedio = Math.round(nota1B+nota2B);
        // paso de Double a Int
        return (int) promedio;
    }
    // Metodo calculador del estado de la materia
    public String estado(){
        if(promedio > 27){
            estado = "Aprobado";
        }else{
            estado = "Supletorios";
        }
        return estado;
    }

    // Presentacion de los datos
    public void presenta_Estudiante(){
        System.out.println("Universidad Técnica Particular de Loja\nInforme Semestral\nEstudiante: "+nombre+
                "\nAsignatura: "+nAsignatura+"\nNota 1 Bimestre: "+nota1B+"\nNota 2 Bimestre: "+nota2B+
                "\nPromedio: "+promedio()+"\nEstado de la Materia: "+estado());
    }
}
