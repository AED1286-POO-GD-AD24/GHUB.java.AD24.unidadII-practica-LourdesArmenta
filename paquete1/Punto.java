package paquete1;
/*
 * Definicios de una clase llamada punto que contiene coordenadas x-y de un
 * punto en un plano
 */

public class Punto {
    private int x; // coordenadas x
    private int y; //coordenada y
    /*
     * tres tipos de modificadores de acceso: private, public, omisiom
     */
    //constructor sin argumentos
    public Punto() {
        x = 0;
        y = 0;
    }
    //constructor con argumentos
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // devuelva el valor de x
    public int leerX(){
        return x;
    }

    //devuelve el valor de y
    public int leerY(){
        return y;
    }

    //establece el valor de x
    public void fijarX(int valorX){
        x = valorX;
    }

    //establece el valor de y
    public void fijarY(int valorY){
        y = valorY;
    }

    
}
