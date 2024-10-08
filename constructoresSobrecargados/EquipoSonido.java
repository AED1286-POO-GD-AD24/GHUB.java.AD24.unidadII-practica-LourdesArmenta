package constructoresSobrecargados;

public class EquipoSonido {
    private int potencia;
    private int voltios;
    private int numCd;
    private String marca;
    //Definimos tres constructores sobrecargados
    //constructor por defecto 
    public EquipoSonido(){
        marca ="sin marca";
        System.out.println("Constructor por defecto");
    }
    //constructor con un parámetro
    public EquipoSonido(String mt){
        this.marca = mt;
        System.out.println("Constructor con un parámetro tipo cadena");
    }
    //constructor con tres parámetros
    public EquipoSonido(String mt, int p, int v){
        this.marca = mt;
        this.voltios = v;
        this.potencia= p;
        System.out.println("Constructor con tres parámetros:tipo cadena y dos enteros");
    }

}
