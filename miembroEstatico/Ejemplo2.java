package miembroEstatico;

public class Ejemplo2 {
    private int datos;
    public int cuenta=0; //contador de objetos
    public Ejemplo2(){
        this.datos=0;
        this.cuenta++;

    }
    public Ejemplo2(int g){
        this.datos=g;
        this.cuenta++;
    }
    
    @Override
    protected void finalize(){
        System.out.println("Fin de objeto Ejemplo");
        cuenta--;
    }
    
}
