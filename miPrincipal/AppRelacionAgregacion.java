//package miPrincipal;
import paquete2.Computadora;
import paquete2.Monitor;

public class AppRelacionAgregacion {
    public static void main(String[] args) {
        System.out.println("Comprobando Relacion de Agregacion:");
        Computadora computadora = new Computadora("Apple","MacBook pro");
        computadora.obtenerDetalles();
        Monitor monitor = new Monitor("LG",16);
        computadora.setMonitor(monitor);
        computadora.obtenerDetalles();

        //instanciar una computadora con tres monitores
        Computadora computadora2= new Computadora("HP","Mll50",3);
        Monitor []arregloMonitores = new Monitor[3];
        arregloMonitores[0]=new Monitor("HP",12);
        arregloMonitores[1]=new Monitor("Acer",15);
        arregloMonitores[2]=new Monitor("Mac",21);
        computadora2.setMonitores(arregloMonitores);
        




    }
    
}
