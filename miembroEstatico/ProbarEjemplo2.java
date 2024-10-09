package miembroEstatico;

public class ProbarEjemplo2 {
    public static void main(String[] args) {
        probarEjemplo2();
}

void probarEjemplo2(){
    Ejemplo2 d1,d2; 
        System.out.println("Objetos Ejemplo "+Ejemplo2.cuenta); //el miembro cuenta como es estático pertenece
                                                              //a la clase, no a los objetos
        d1 = new Ejemplo2();
        d2 = new Ejemplo2(11);

        System.out.println("Objetos Ejemplo "+Ejemplo2.cuenta);

        d2=d1;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
          
            e.printStackTrace();
        }

        System.out.println("Objetos Ejemplo "+Ejemplo2.cuenta);

        d2 = d1  = null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
          
            e.printStackTrace();
        }

        System.out.println("Objetos Ejemplo "+Ejemplo2.cuenta);

}
}
