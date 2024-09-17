package paquete1;
//REGLAS
/*
 * 1.- Poner los miembros privados primero, debido a que contiene los atributos
 * 2.- Pones los miembros publicos primero debido a que los métodos y los constructores 
 *      son la interfaz del usuario  del usuario de la clase
 */

public class Marco {
    private double p;
    String t;
    public Marco(){

    }
    public void poner(){
        Foto u = new Foto("Paloma");
        p = u.mtd();
        t = "*****"+u.q+"*****";
    }
    
}
