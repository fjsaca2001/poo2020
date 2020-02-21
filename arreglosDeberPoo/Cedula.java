package arreglosDeberPoo;
public class Cedula {
    // variables globales privadas
    private int cedula;
    private String estado;
    private int validacion = 0;
    // establcer datos ingresados por el usuario
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getEstado() {
        return estado;
    }

    public int getValidacion() {
        return validacion;
    }

    public void setValidacion(int validacion) {
        this.validacion = validacion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    // constructor de la clase cedula
    public Cedula(int cedula){
        this.cedula = cedula;
    }
    // metodo para validar la cedula
    public void validacion() {
        // arreglo con los coeficioentes necesarios
        int[] coeficientes = {2,1,2,1,2,1,2,1,2};
        // inicializacion del estado en modo cedula incorrecta
        estado = "Cédula incorrecta";
        // Arreglo usado para almacear los valores por separado de la cedula
        int[] cedulaArr = new int[10];
        // contador usado para el for siguiente
        int c = 9;
        // ciclo usado para el almacenamiento de los datos unitarios
        for (int i = 0; i < cedulaArr.length ; i++) {
            // asignacion de valores desde el ultimo hasta el primero
                                // formula para obtener el ultimo valor de la cedula
            cedulaArr[c] = (int)((cedula/Math.pow(10,i))%10);
            // decremento del contador
            c--;
        }
        // inizializacion de la variable suma con cero
        int suma = 0;
        // declaracion de variabes local
        int resultCoe;
        // ciclo para obtener la suma de los productos entre los dijitos de la cedula u los coeficientes
        for (int i = 0; i < (cedulaArr.length-1); i++){
            resultCoe = coeficientes[i] * cedulaArr[i];
            // en caso de que sean mayores que nueve se les restara nueve
            if (resultCoe > 9){
                resultCoe -= 9;
            }
            suma += resultCoe;
        }
        // declaracion de variabes local y asignacion del residuo
        int residuo = suma%10;
        // condicional para obtener el valor del ultimo dijito
        if(residuo != 0){
            validacion = 10 - residuo;
        }
        // condicional para validar si tiene igualdad el ultimo dijito con el valor encontrado
        if(validacion == cedulaArr[9]){
            estado = "El numer de cedula es correcto";
        }
    }
    // metodo para obtener el numero de cedula
    public int obtenerCedula(){
        // retorno de la cedula
        return cedula;
    }
    // metodo para obtener el valor de validacion
    public int obtenerValidador(){
        // retorno de la validacion
        return validacion;
    }
    // metodo para obtener el estado
    public String obtenerEstado(){
        // retorno del estado
        return estado;
    }
}
