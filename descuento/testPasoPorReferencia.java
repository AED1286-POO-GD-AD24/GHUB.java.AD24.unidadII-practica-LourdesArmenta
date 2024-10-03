package descuento;

public class testPasoPorReferencia {

    public static void main(String[] args) {
        int a = 5;
        pasoPorValor(a);
        System.out.println("valor de a = "+a);

        int [] arr = {0,2,4};
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
        pasoPorReferencia(arr);
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
    }
    public static void pasoPorValor(int a){
        a = a + 1;
        System.out.println("valor de a = "+a);
    }
    public static void pasoPorReferencia( int[] arreglo){
        arreglo[0]=5;
        arreglo[1]=10;
        arreglo[2]=30;

    }
    
}
