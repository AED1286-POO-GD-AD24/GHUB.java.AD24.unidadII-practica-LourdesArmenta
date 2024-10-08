package constructoresSobrecargados;

public class Objetos {
    public static void main(String[] args) {
        Contador1 k,g,r,a;//Declaración de cuatro referencias a objetos de la clase Contador1
        //se crean cuatro objetos de la clase Contador1 con los constructores por defecto
        k = new Contador1();
        g = new Contador1();
        r = new Contador1();
        a = new Contador1();
        /*
        La siguiente asignacion hace que g referencie al mismo objeto que k
        además el objeto origanal de g será automáticamente eliminado por el recolector de basura
        */


        g = k;//Se asigna la referencia del objeto referenciado por k a la referencia g

        k = null;//Se libera la memoria del objeto referenciado por k
        System.gc();//Se invoca al recolector de basura
        //metodo finalize 
    }


}
