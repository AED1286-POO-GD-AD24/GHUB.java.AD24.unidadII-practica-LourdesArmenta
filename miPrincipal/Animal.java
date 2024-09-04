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
        this.genero = genero;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.propietario = propietario;

    }

    public void obtenerNombreDueño(){
        System.out.println("El propietario = "+ propietario);
    }

    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;

    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getEspecie(){
        return this.especie;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }

    public String getPropietario(){
        return this.propietario;
    }
    public void setPropietario(String propietario){
        this.propietario = propietario;

    }


    
}
