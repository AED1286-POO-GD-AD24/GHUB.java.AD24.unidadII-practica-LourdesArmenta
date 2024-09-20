package paquete2;

public class Profesor {
    String nombre;

    public Profesor() {

    }

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void ensenar(Estudiante estudiante){
        System.out.println("el profesor "+this.nombre+      
                           " enseña al estudiante "+estudiante.getNombre());
    }
    
    public void obtenerDetalles(){
        System.out.println("Nombre: "+nombre+"\n");
    }

    
}
