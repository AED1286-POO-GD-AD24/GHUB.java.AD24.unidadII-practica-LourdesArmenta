package miPrincipal;

public class Animal {
    private String genero;
    private String nombre;
    private int edad;
    private String especie;
    private String propietario;

    public Animal(){

    }
    public Animal(String genero, String nombre, int edad, String especie, String propietario){
        genero = genero;
        nombre = nombre;
        edad = edad;
        especie = especie;
        propietario = propietario;

    }

    public void obtenerNombreDueño(){
        System.out.println(propietario);
    }
    
}
