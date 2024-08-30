package miPrincipal;

public class Principal {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        //System.out.println(new Principal().getGreeting());
        //Creando un objeto de tipo Alumno
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno(123,"Lourdes","Armenta","Lindoro",'M',56);
        Alumno alumno3 = new Alumno(123,"Pedro","Lopez","Perez",'H',18);
        

        alumno1.saludo(); //el alumno1 invoca al salido
        //alumno1.id = 123; //el id no es visible desde la clase Principal porque es privado
        //alumno1.nombre ="Juan";
        alumno1.setNombre("Lucia");
        alumno1.setApellidoPaterno("Gallardo");
        alumno1.setApellidoMaterno("Quiñonez");

        System.out.println("Mi nombre es "+alumno1.getNombre());

        alumno2.saludo(); //el alumno2 invoca al saludo
        System.out.println("Mi nombre completo es "+alumno2.getNombre()+" "+
                     alumno2.getApellidoPaterno()+" "+alumno2.getApellidoMaterno());
        //alumno2.id = 124;
        //alumno2.nombre ="Paco";

        alumno3.saludo(); //el alumno3 invoca al salido
        System.out.println("Mi nombre completo es "+alumno3.getNombre()+" "+
                     alumno2.getApellidoPaterno()+" "+alumno3.getApellidoMaterno());
        //alumno3.id = 125;
        //alumno3.nombre = "Luis";

        
        //System.out.println("El nombre del alumno 1 ="+alumno1.nombre);
        //System.out.println("El nombre del alumno 2 ="+alumno2.nombre);
        //System.out.println("El nombre del alumno 3 ="+alumno3.nombre);



       

    }
}