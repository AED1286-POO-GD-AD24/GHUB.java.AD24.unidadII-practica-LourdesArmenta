package metodoFinalice;

public class ProbarDemo {
    public static void main(String[] args) throws InterruptedException {
       
        Demo d1,d2;//declaracion de dos referencias de tipo Demo
        Prueba p1,p2;//declaracion de dos referencias de tipo Prueba
        d1 = new Demo();//creacion de un objeto de tipo Demo
        p1 = new Prueba();//creacion de un objeto de tipo Prueba
        System.gc(); //no se libera ningun objeto
        p2=p1;//p2 referencia al mismo objeto que p1
        p1=new Prueba();//se libera la referencia p1
        System.gc(); //No se libera ningun objeto
        p1=null;//se libera la referencia p1
        d1=new Demo();
        System.gc(); //Se libera dos objetos: p1 y d1
        //debido a que el recolector de basura no se ejecuta inmediatamente
        //se espera un segundo para que se ejecute
        Thread.sleep(1000); // Esperar un segundo para dar tiempo al recolector de basura

        




    }

}
