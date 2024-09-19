package paquete1;
public class Profesor {
    private String nombre;
    public Profesor(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void ensenar(Estudiante estudiante) {
        System.out.println(nombre + " está enseñando a " +
                           estudiante.getNombre());
    }
    public String obtenerDetalles() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan");
        Profesor profesor = new Profesor("Dr. Smith");
        profesor.ensenar(estudiante);
    }

    
}
