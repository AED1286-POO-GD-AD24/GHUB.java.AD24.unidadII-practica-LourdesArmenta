package miPrincipal;
import paquete2.Computadora;
import paquete2.Monitor;

public class AppRelacionAgregacion {
    public static void main(String[] args) {
        System.out.println("Comprobando Relacion de Agregacion:");
        Computadora computadora = new Computadora("Apple","MacBook pro");
        computadora.obtenerDetalles();
    }
    
}
