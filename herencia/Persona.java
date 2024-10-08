package herencia;

public class Persona {
    private String nombre;
    private int edad;
    public Persona() {
    }
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    protected String saludo(){ //protected es un modificador de acceso que permite que 
                                //los métodos o atributos sean accesibles desde las clases hijas y desde
                                //las clases del mismo paquete
        return "Hola soy  una Persona";
    }

    @Override
    public String toString() {
        return "Persona :" +nombre +", "+edad;

        
    }
 
    
}
