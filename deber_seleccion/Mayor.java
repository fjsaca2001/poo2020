package deber_seleccion;

public class Mayor {
    // declaracion de variables globales
    private int n1;
    private int n2;
    private int n3;
    private int n4;
    private int mayor;

    /**
     * Constructor de la clase Mayor
     *
     */
    public Mayor(int num1, int num2, int num3, int num4){
        this.n1 = num1;
        this.n2 = num2;
        this.n3 = num3;
        this.n4 = num4;
    }
    // almacenamiento de datos en la variable n1
    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }
    // almacenamiento de datos en la variable n2
    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    // almacenamiento de datos en la variable n3
    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }
    // almacenamiento de datos en la variable n4
    public int getN4() {
        return n4;
    }

    public void setN4(int n4) {
        this.n4 = n4;
    }
    // almacenamiento de datos en la variable mayor
    public int getMayor() {
        return mayor;
    }

    public void setMayor(int mayor) {
        this.mayor = mayor;
    }
    // metodo para calcular el numero mayor
    public void calculaMayor(){
        // Condicion para el n1
        if ((n1 > n2) && (n1 > n3) && (n1 > n4)){
            mayor = n1;
        }else{
            // Condicion para el n2
            if((n2 > n3) && (n2 > n4)){
                mayor = n2;
            }else{
                // condicion para el n3
                if(n3 > n4){
                   mayor = n3;
                }else{
                    // al no cumplir con las condiciones anteriores el mayor sera el ultimo
                    mayor = n4;
                }
            }
        }
    }
    // Metodo que retorna el numero mayor
    public int obtenerMayor(){
        return mayor;
    }
}
