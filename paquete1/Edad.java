package paquete1;

public class Edad {
    //datos
    int edadHijo;
    int edadMadre;
    int edadPadre;

    //constructor por defecto
    public Edad(){
        edadHijo = 0;
        edadMadre = 0;
        edadPadre =0;

    }
    //constructo 2
    public Edad(int edad1){
        //pendientes

    }
    //constructir 3
    public Edad(int edad1, int edad2){
        //pendiente

    }
    //constructor 4
    public Edad(int edad1, int edad2, int edad3){
        edadHijo  = edad1;
        edadMadre = edad2;
        edadPadre = edad3;

    }
    


    public void iniciar(){

    }
    public int leerHijo(){ //get

        return edadHijo;
    }

    public void asignarEdadHijo(int edad){ //set
        edadHijo = edad;
    }

    public int leerMadre(){
        
        return edadMadre;
    }
    public void asignarEdadMadre(int edad){ //set
        edadMadre=edad;
    }

    public int leerPadre(){
        return edadPadre;
    }

    public void asignarEdadPadre(int edad){ //set
        edadPadre = edad;
    }


    
}
