package miPrincipal;
import paquete1.*;


public class AppPunto {
    public static void main(String[] args) {
        Punto punto1 = new Punto(); //crear un objeto de la Clase Punto
        punto1.fijarX(5);
        punto1.fijarY(10);
        System.out.println("El eje X de punto1 ="+punto1.leerX());
        System.out.println("El eje Y de punto1 ="+punto1.leerY());

        Punto punto2 = new Punto(3,4); 
        System.out.println("El eje X de punto2 ="+punto2.leerX());
        System.out.println("El eje Y de punto2 ="+punto2.leerY());

        

        //VISIBILIDAD DE LOS MIEMBROS DE LA CLASE


        
    }
    
}
