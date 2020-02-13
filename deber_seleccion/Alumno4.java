package deber_seleccion;
public class Alumno4 {
    // declaracion de variables globales
    private String nombreAlum;
    private String observacion;
    private double calif1;
    private double calif2;
    private double calif3;
    private double calif4;
    private double promedio;
    /**
     * Constructor para la clase Alumno
     */
    public Alumno4(String nombreAlum, double n1, double n2, double n3, double n4){
        this.nombreAlum = nombreAlum;
        this.calif1 = n1;
        this.calif2 = n2;
        this.calif3 = n3;
        this.calif4 = n4;
    }
    // almacenamiento de datos en la variable nombreAlum
    public String getNombreAlum() {
        return nombreAlum;
    }
    public void setNombreAlum(String nombreAlum) {
        this.nombreAlum = nombreAlum;
    }

    // almacenamiento de datos en la variable observacion
    public String getObservacion() {
        return observacion;
    }
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    // almacenamiento de datos en la variable califi1
    public double getCalif1() {
        return calif1;
    }
    public void setCalif1(double calif1) {
        this.calif1 = calif1;
    }

    // almacenamiento de datos en la variable califi2
    public double getCalif2() {
        return calif2;
    }
    public void setCalif2(double calif2) {
        this.calif2 = calif2;
    }

    // almacenamiento de datos en la variable califi3
    public double getCalif3() {
        return calif3;
    }
    public void setCalif3(double calif3) {
        this.calif3 = calif3;
    }

    // almacenamiento de datos en la variable califi4
    public double getCalif4() {
        return calif4;
    }
    public void setCalif4(double calif4) {
        this.calif4 = calif4;
    }

    // almacenamiento de datos en la variable promedio
    public double getPromedio() {
        return promedio;
    }
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    // metodo que calculara el promedio
    public void calcularPromedio(){
        promedio = (calif1 + calif2 + calif3 + calif4)/4;
    }
    // metodo que calculara a observacion
    public void calcularObservacion(){
        // condicion si es mayor o igual a  60 aprobara
        if(promedio >= 60){
            observacion = "Aprobado";
        }else{
            // si no se cumple reprobara
            observacion = "Reprobado";
        }
    }
    // Retorno del valor nombreAlum
    public String obtenerNombre(){
        return nombreAlum;
    }
    // Retorno del valor promedio
    public Double obtenerPromedio(){
        return promedio;
    }
    // Retorno del valor observacion
    public String obtenerObservacio(){
        return observacion;
    }
}
