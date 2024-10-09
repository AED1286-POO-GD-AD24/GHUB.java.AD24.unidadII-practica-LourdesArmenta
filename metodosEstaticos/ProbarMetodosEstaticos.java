package metodosEstaticos;

public class ProbarMetodosEstaticos {
    public static void main(String[] args) {
        SumaSerie obj = new SumaSerie();
        //obj.suma(); //Esto no es posible porque le método suma es estático y pertenece a la clase y no
                      //al objeto
        System.out.println(SumaSerie.suma());


        
        
        
    }
    

}
    

