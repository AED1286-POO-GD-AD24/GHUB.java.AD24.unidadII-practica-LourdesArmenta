package miPrincipal;
import paquete2.*;

public class AppRelacionAsociacion {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Lourdes Armenta");
        Estudiante estudiante = new Estudiante("Maximiliano Martin");
        profesor.ensenar(estudiante);
        
    }
    
}
