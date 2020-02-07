package introPoo;

import com.sun.security.jgss.GSSUtil;

public class EjecutaTiempo {
    public static void main(String[] args) {
        // cracion de objeto tiempo
        Tiempo tiempo = new Tiempo();
        tiempo.actualizar_hora(10);
        tiempo.actualizar_minuto(51);
        tiempo.actualizar_segundo(35);
        String mostratTime = tiempo.obtener_tiempo();
        System.out.println(mostratTime);
    }
}
