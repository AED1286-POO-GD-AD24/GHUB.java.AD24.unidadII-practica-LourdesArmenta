package miembroEstatico;

public class ProbarEjemplo2 {
    public static void main(String[] args) {
        Ejemplo2 ejemplo2 = new Ejemplo2();
        System.out.println(ejemplo2.cuenta);
        probarEjemplo2();



        
    }

    static void probarEjemplo2(){
        Ejemplo2 ejemplo2 = new Ejemplo2();
        System.out.println("objetos activos:"+ejemplo2.cuenta);//en este caso la variable cuenta pertenece al 
                                            //objeto y no a la clase

        Ejemplo2 ej1,ej2;
        ej1=new Ejemplo2();
        ej2=new Ejemplo2(11);

        System.out.println("objetos activos:"+ejemplo2.cuenta);//porque siguie siendo uno


    

    }
}
