package miPrincipal;
public class Alumno{
    //campos o atributo de la clase
    private int id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private char genero;
    private int edad;
    //Metodo constructores
    public Alumno(){
        this.id = 0;
        this.nombre = "";
        this.apellidoMaterno="";
        this.apellidoPaterno="";
        this.genero ='X';
        this.edad = 0;

    }
    public Alumno(int id, String nombre, String apellidoPaterno,
                 String apellidoMaterno, char genero, int edad){
            this.id = id;
            this.nombre = nombre;
            this.apellidoPaterno = apellidoPaterno;
            this.apellidoMaterno = apellidoMaterno;
            this.genero = genero;
            this.edad = edad;

    }
    //Metodo
    public void mostrarNombre(){
        System.out.println(nombre+" "+apellidoPaterno+" "+apellidoMaterno);

    }
    public void mostrarEdad(){
        System.out.println(edad);

    }
    public void saludo(){
        System.out.println("Hola a todos, me da gusto conocerlos");

    }

    

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellidoPaterno(){
        return this.apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno(){
        return this.apellidoMaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno){
        this.apellidoMaterno = apellidoMaterno;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    




    
}