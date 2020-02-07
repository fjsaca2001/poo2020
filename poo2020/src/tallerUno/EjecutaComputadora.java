package tallerUno;

public class EjecutaComputadora {
    public static void main(String[] args) {
        Computadora computadora1 = new Computadora();
        computadora1.actualizar_caracteristica("1 tera de almacenamiento\n4 gb de RAM");
        computadora1.actualizar_marca("Dell");
        computadora1.actualizar_precio(1200);
        computadora1.actualizar_sistemaO("Linux Ubuntu");
    }
}
