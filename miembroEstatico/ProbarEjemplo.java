package miembroEstatico;

public class ProbarEjemplo {
    public static void main(String[] args) {
        Ejemplo d1,d2; 
        System.out.println("Objetos Ejemplo "+Ejemplo.cuenta); //el miembro cuenta como es estático pertenece
                                                              //a la clase, no a los objetos
        d1 = new Ejemplo();
        d2 = new Ejemplo(11);

        System.out.println("Objetos Ejemplo "+Ejemplo.cuenta);

        d2=d1;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
          
            e.printStackTrace();
        }

        System.out.println("Objetos Ejemplo "+Ejemplo.cuenta);

        d2 = d1  = null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
          
            e.printStackTrace();
        }

        System.out.println("Objetos Ejemplo "+Ejemplo.cuenta);







        




    }
    
}
