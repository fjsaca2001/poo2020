package tallerUno;

public class EjecutaUniversidad {
    public static void main(String[] args) {
        Universidad universidad = new Universidad();
        universidad.actualizar_area("Tecnica");
        universidad.actualizar_carrera("Administración Pública");
        universidad.actualizar_direccion("San cayetano");
        universidad.actualizar_docente("Pedro Martinez");
    }
}
