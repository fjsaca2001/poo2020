package arreglosDeberPoo;
public class Conversor {
    // declaracion de variables globales
    private int binario;
    private int suma;
    // establer el valor ingresado por el usuario
    public int getBinario() {
        return binario;
    }

    public void setBinario(int binario) {
        this.binario = binario;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    // creacion del constructor conversor
    public Conversor(int binario){
        this.binario = binario;
    }

    // metodo para obtener el decimal
    public void obtenerDecimal(){
        // Arreglo usado para almacear los valores por separado
        int[] binarioDecimal = new int[6];
        // contador usado para el for siguiente
        int c = 5;
        // ciclo usado para el almacenamiento de los datos unitarios
        for (int i = 0; i < binarioDecimal.length ; i++) {
            // asignacion de valores desde el ultimo hasta el primero
            // formula para obtener el ultimo valor de la cedula
            binarioDecimal[c] = (int)((binario/Math.pow(10,i))%10);
            // decremento del contador
            c--;
        }
        // asignacion de un contador que va a decrecer
        c = 5;
        // for para calcular el valor decimal de cada digito
        for (int i = 0; i < binarioDecimal.length; i++) {
            // suma de los resultados
            suma += (binarioDecimal[i] * Math.pow(2, c));
            // decremento del contador
            c--;
        }
    }
    // metodo para la presentacion de datos
    public void obtenerSuma(){
        // impresion del resultado
        System.out.println(binario+" en binario = "+ getSuma() +" en decimal");
    }
}
