package metodosEstaticos;

public class SumaSerie {
    private static long n;
    private static long m;
    
    static{
        n = 0;
        m= 1;
    }
    

    public static long suma(){
        m = m +n; //como el métoso es estatico puedo acceder a los miembros estatico
        n = m-n;
        return m;
    }
    
}
