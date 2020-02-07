package tallerUno;

public class EjecutaDocente {
    public static void main(String[] args) {
        Docente docente1 = new Docente();
        docente1.actualizar_departamento("Quimica");
        docente1.actualizar_lugartrabajo("Quito");
        docente1.actualizar_nombre("José Perez");
        docente1.actualizar_materia("Quimica");
        docente1.actualizar_horario("Diurno");
    }
}
