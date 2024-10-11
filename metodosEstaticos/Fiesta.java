package metodosEstaticos;
public class Fiesta{
    int precio;
    String cartel; //miembro no estatico
    public static void main(String[] arg){
        //cartel = "Virgen de los pacientes"; //marca un error, porque los miembros de un metodo estatico
                                            //no pueden acceder a miembros NO estaticos
       //precio = 1;
        //estos errores se debem a que un método declarado como estático
        //no puede acceder a miembro No estaticos

    }
}