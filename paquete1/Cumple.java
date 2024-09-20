package paquete1;
import java.util.Scanner;

public class Cumple {
    public static void main(String[] args) {
        //Declara un objeto tipo DiaAnio
        DiaAnio hoy;
        Scanner entrada=new Scanner(System.in);
        System.out.print("Introduzca feha de hoy: mes :");
        int m = entrada.nextInt();
        System.out.print("Introduzca fecha de hoy: dia");
        int d = entrada.nextInt();
        hoy = new DiaAnio(d,m);
        System.out.print("Introduzca feha de Nacimiento: mes :");
        m = entrada.nextInt();
        System.out.print("Introduzca fecha de Nacimiento: dia");
        d = entrada.nextInt();
        DiaAnio cumpleanio = new DiaAnio(d,m);
        System.out.print("la fecha de hoy = ");
        hoy.visualizar();
        System.out.print("la fecha de cumpleañios = ");
        cumpleanio.visualizar();
        if(hoy.igual(cumpleanio))
           System.out.println("FELIZ CUMPLEAÑOS");
        else
           System.out.println("Feliz Dia");
        entrada.close();
        
 }

    
}
