package paquete2;

public class Estudiante {
    String nombre;

    public Estudiante() {
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void obtenerDetalles(){
        System.out.println("Nombre: "+nombre+"\n");

    }
    

    
}
