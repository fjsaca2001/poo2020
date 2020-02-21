package matrizPoo;
/**
 * Integrantes: Frank Saca, Pablo Montaño Jeferson Cueva, Isaias Silva
 */
public class Promedio {
    // declaracion de variables globales
    private int[][] matrizA;
    private double suma;
    private double prom = 0;
    private  int cont;

    /**
     * Método constructor de la clase
     *
     * @param matriz
     */
    public Promedio(int matriz[][]) {
        this.matrizA = matriz;
    }


    public int[][] getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    /**
     * Método para obtener la Matriz ingresada
     */
    public void obtenerMatriz() {
        System.out.println("La Matriz ingresada es:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    /**
     * Método para calcular la suma de la matriz
     */
    public void calcularSuma() {
        cont = 0;
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                suma = suma + matrizA[i][j];
                cont++;
            }
        }
    }

    /**
     * Método para obtener la suma de la matriz
     * @return
     */
    public double obtenerSuma() {
        return suma;
    }

    /**
     * Método para calcular el promedio de la matriz
     */
    public void calcularPromedio() {
        prom = (suma / cont);
    }

    /**
     * Método para obtener el promedio de la matriz
     * @return
     */
    public double obtenerPromedio() {
        return prom;
    }

}
