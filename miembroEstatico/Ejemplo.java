package miembroEstatico;
/*
 * proposito: dada una clase, se requiere conocer en todo momento los objetos activos en la aplicacion
 * 
 */

public class Ejemplo {
    private int datos;
    static  int cuenta=0; //contador de objetos
    public Ejemplo(){
        this.datos=0;
        this.cuenta++;

    }
    public Ejemplo(int g){
        this.datos=g;
        this.cuenta++;
    }
    
    @Override
    protected void finalize(){
        System.out.println("Fin de objeto Ejemplo");
        cuenta--;
    }


    
}
