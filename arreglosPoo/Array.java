package arreglosPoo;

public class Array {
    // declaracion de variables
    private int[] vectorA = new int[10];
    private int[] vectorB = new int[10];
    private int sumatoriaProducto;

    /**
     * Constructor de la clase
     */
    public Array(int[] vectorA, int[]vectorB){
        this.vectorA = vectorA;
        this.vectorB = vectorB;
    }
    // establecer de las variables
    public int[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(int[] vectorA) {
        this.vectorA = vectorA;
    }

    public int[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(int[] vectorB) {
        this.vectorB = vectorB;
    }

    public int getSumatoriaProducto() {
        return sumatoriaProducto;
    }

    public void setSumatoriaProducto(int sumatoriaProducto) {
        this.sumatoriaProducto = sumatoriaProducto;
    }
    // calculo de la sumatoria
    public void calcularSumatoria(){
        // inicializacion de las variables
        sumatoriaProducto = 0;
        // ciclo for para el recorrido del arreglo
        for (int i = 0; i < getVectorB().length; i++) {
            // acumulador de resultados
            sumatoriaProducto += vectorA[i] * vectorB[i];
        }
    }
    // Presentacion del vectorA
    public void presentarVectorA(){
        // recorrer el arreglo para presentar cada valor
        for (int i = 0; i < vectorA.length; i++){
            // presentacion
            System.out.print(vectorA[i]);
        }
        // salto de linea
        System.out.println("");
    }
    // Presentacion del vectorB
    public void presentarVectorB(){
        // recorrer el arreglo para presentar cada valor
        for (int i = 0; i < vectorB.length; i++) {
            // presentacion
            System.out.print(vectorB[i]);
        }
        // salto de linea
        System.out.println("");
    }
    // metodo para obtener la sumatoria
    public int obtenerSumatoria(){
        // retorno de la sumatoria
        return sumatoriaProducto;
    }

}