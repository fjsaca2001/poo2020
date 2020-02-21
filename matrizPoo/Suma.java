package matrizPoo;

public class Suma {
    // variables globales
    private int[][] a = new int[3][3];
    private int[][] b = new int[3][3];
    private int[][] suma = new int[3][3];
    // establecer y obtener variables locales
    public int[][] getA() {
        return a;
    }

    public void setA(int[][] a) {
        this.a = a;
    }

    public int[][] getB() {
        return b;
    }

    public void setB(int[][] b) {
        this.b = b;
    }

    public int[][] getSuma() {
        return suma;
    }

    public void setSuma(int[][] suma) {
        this.suma = suma;
    }
    // metodo del constructor
    public Suma(int [][] a, int[][] b){
        this.a=a;
        this.b=b;
    }
    // metodo para calcular la suma
    public void calcularSuma(){
        // recorrer el arreglo para sumarlo
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                suma[i][j] = a[i][j] + b[i][j];
            }
        }
    }
    // metodo que se usa para presentar cada uno de los arreglos
    public void obtenerResultados(int arr[][]) {
        // presentacion del arreglo
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            // salto de fila
            System.out.println("");
        }
    }
}
