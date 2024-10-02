//package miPrincipal;
import paquete1.Edad;

public class AppEdad {
    public static void main(String[] arg){
        //probar la forma de crear objetos
        Edad edad1 = new Edad();
        edad1.asignarEdadHijo(12);
        edad1.asignarEdadMadre(40);
        edad1.asignarEdadPadre(42);
        System.out.println("Edad del hijo: "+edad1.leerHijo());
        System.out.println("Edad de la Madre:"+edad1.leerMadre());
        System.out.println("Edad del Padre: "+edad1.leerPadre());

        //crear un objeto edad através de sus constructores

        Edad edad2 = new Edad(8,20,40);
        System.out.println("Edad del hijo: "+edad2.leerHijo());
        System.out.println("Edad de la Madre:"+edad2.leerMadre());
        System.out.println("Edad del Padre: "+edad2.leerPadre());

        //crear un objeto edad a traves de su constructor  sin argumentos
        Edad edad3 = new Edad();
        System.out.println("Edad del hijo: "+edad3.leerHijo());
        System.out.println("Edad de la Madre:"+edad3.leerMadre());
        System.out.println("Edad del Padre: "+edad3.leerPadre());



        


       

    }
    
}
