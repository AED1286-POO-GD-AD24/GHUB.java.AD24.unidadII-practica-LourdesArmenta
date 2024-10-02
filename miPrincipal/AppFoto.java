//package miPrincipal;
import paquete1.Foto;
import paquete1.Marco;

public class AppFoto {
    public static void main(String[] args) {
        Foto foto1 = new Foto("Animalitos");
        System.out.println(foto1.mtd());
        Marco marco1 = new Marco();
        marco1.poner();
        marco1.poner("animalitos");

        
    }
    
}
