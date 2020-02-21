package arreglosDeberPoo;

public class Ficha {
    // declaracion de variables globales
    private String[] nombre = new String[5];
    private int[] edad = new int[5];
    private String[] universidad = new String[5];
    private String[] celular = new String[5];

    // COnstructor de la clase Ficha
    public Ficha(String nombre[], int edad[], String universidad[], String celular[]) {
        this.nombre = nombre;
        this.edad = edad;
        this.universidad = universidad;
        this.celular = celular;
    }

    // Establecer los valores ingresados
    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public int[] getEdad() {
        return edad;
    }

    public void setEdad(int[] edad) {
        this.edad = edad;
    }

    public String[] getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String[] universidad) {
        this.universidad = universidad;
    }

    public String[] getCelular() {
        return celular;
    }

    public void setCelular(String[] celular) {
        this.celular = celular;
    }
    // metodo para presentar los alumnos
    public void presentarAlumno() {
        // ciclo para presentar cada estudiante
        for (int i = 0; i < nombre.length; i++) {
            // presentacion de datos
            System.out.println("\tNombre: " + nombre[i]);
            System.out.println("\tEdad: " + edad[i]);
            System.out.println("\tUniversidad: " + universidad[i]);
            System.out.println("\tCelular: " + celular[i]+"\n");
        }
    }
}
