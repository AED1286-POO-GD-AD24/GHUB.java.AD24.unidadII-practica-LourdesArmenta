package paquete1;

public class AppPunto {
    public static void main(String[] args) {
        Punto punto1 = new Punto();
        //NO PUEDO ACCEDER A LAS VARIABLES x y y porque las cambie de públicas a privadas
        //System.out.println("La variable x esta disponible porque no tiene identificadod de acceso"+punto1.x);
        //System.out.println("La variable y esta disponible porque no tiene identificadod de acceso"+punto1.y);
        punto1.imprimirXY();

        
    }
    
}
