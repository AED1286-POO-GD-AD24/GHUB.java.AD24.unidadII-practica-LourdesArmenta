package miPrincipal;
import paquete2.Automovil;
import paquete2.Motor;

public class AppRelacionComposicion {

    public static void main(String[] args) {
        System.out.println("Comprobando la relación de composicion:");
        Motor motor = new Motor("turbo dohc",190);
        Automovil automovil = new Automovil("Honda","crv",motor);
        automovil.obtenerDetalles();



        
    }
    
}
