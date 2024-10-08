package metodoFinalice;

public class ProbarDemo {
    public static void main(String[] args) {
       
        Demo d1,d2;//declaracion de dos referencias de tipo Demo
        Prueba p1,p2;//declaracion de dos referencias de tipo Prueba
        d1 = new Demo();//creacion de un objeto de tipo Demo
        p1 = new Prueba();//creacion de un objeto de tipo Prueba
        System.gc(); //no se libera ningun objeto
        p2=p1;//p2 referencia al mismo objeto que p1
        p1 =new Prueba();//se crea un nuevo objeto de tipo Prueba
        System.gc(); //no se libera ningun objeto
        p1 = null;//se libera la memoria del objeto referenciado por p1
        p2 = null;//se libera la memoria del objeto referenciado por p2
        d1 = null;//se libera la memoria del objeto referenciado por d1
        d2 = null;
        System.gc(); //se libera la memoria del objeto referenciado por p1




    }

}
