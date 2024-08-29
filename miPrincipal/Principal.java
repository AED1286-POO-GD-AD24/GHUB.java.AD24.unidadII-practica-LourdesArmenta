package miPrincipal;

public class Principal {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        //System.out.println(new Principal().getGreeting());
        //Creando un objeto de tipo Alumno
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();
        Alumno alumno3 = new Alumno();

        alumno1.saludo(); //el alumno1 invoca al salido
        alumno1.id = 123;
        alumno1.nombre ="Juan";

        alumno2.saludo(); //el alumno2 invoca al saludo
        alumno2.id = 124;
        alumno2.nombre ="Paco";

        alumno3.saludo(); //el alumno3 invoca al salido
        alumno3.id = 125;
        alumno3.nombre = "Luis";

        
        System.out.println("El nombre del alumno 1 ="+alumno1.nombre);
        System.out.println("El nombre del alumno 2 ="+alumno2.nombre);
        System.out.println("El nombre del alumno 3 ="+alumno3.nombre);



       

    }
}