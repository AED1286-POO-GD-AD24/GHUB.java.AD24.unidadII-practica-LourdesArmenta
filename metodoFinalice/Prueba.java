package metodoFinalice;

public class Prueba {
    private double x;
    //constructor por defecto
    public Prueba(){
        x= - 1.0;
    }
    @Override
    protected void finalize(){
        System.out.println("Fin de Objeto Prueba");
    }

}
