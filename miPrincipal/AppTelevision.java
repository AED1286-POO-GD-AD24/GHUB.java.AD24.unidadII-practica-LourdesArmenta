package miPrincipal;

public class AppTelevision {
    public static void menu() {
        System.out.println("********************************");
        System.out.println("        CLASE TELEVISION        ");
        System.out.println("********************************");

        Television tv1 = new Television("Sony","14 pulgadas","1080 pixeles",7250.52);

        Television tv2 = new Television();

        System.out.println("Datos de la Television 1:");
        System.out.println(tv1.getMarca());
        System.out.println(tv1.getTamanio());
        System.out.println(tv1.getResolucion());
        System.out.println(tv1.getPrecio());

        System.out.println("Datos de la Television 2:");
        System.out.println(tv2.getMarca());
        System.out.println(tv2.getTamanio());
        System.out.println(tv2.getResolucion());
        System.out.println(tv2.getPrecio());



        
    }
    
}
