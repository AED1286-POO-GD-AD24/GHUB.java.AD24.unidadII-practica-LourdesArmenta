package metodoFinalice;

public class Demo {
    private int datos;

    //constructor por defecto
    public Demo(){
        datos=0;

    }
    
    @Override
    protected void finalize(){
        System.out.println("Fin de Objeto Demo");
    }



}
