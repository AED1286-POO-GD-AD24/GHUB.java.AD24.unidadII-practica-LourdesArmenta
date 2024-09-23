package miPrincipal;
import paquete2.*;

public class AppRelacionAsociacion {
    public static void main(String[] args) {
        System.out.println("Comprobando la relación de asociación:");
        Profesor profesor = new Profesor("Lourdes Armenta");
        Estudiante estudiante = new Estudiante("Maximiliano Martin");
        profesor.ensenar(estudiante);
        
    }
    
}
