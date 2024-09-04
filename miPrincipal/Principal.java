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
        

        alumno1.saludo(); 
        
        alumno1.setNombre("Lucia");
        alumno1.setApellidoPaterno("Gallardo");
        alumno1.setApellidoMaterno("Quiñonez");
        alumno1.setEdad(15);
        

        System.out.println("Mi nombre es "+alumno1.getNombre());
        System.out.print("Mi nombre es ");
        alumno1.mostrarNombre();
        System.out.print("Mi edad es:");
        alumno1.mostrarEdad();

        alumno2.saludo(); //el alumno2 invoca al saludo
        System.out.println("Mi nombre completo es "+alumno2.getNombre()+" "+
                     alumno2.getApellidoPaterno()+" "+alumno2.getApellidoMaterno());
        System.out.print("Mi nombre es ");
        alumno2.mostrarNombre();
        System.out.print("Mi edad es:");
        alumno2.mostrarEdad();
       

        alumno3.saludo(); //el alumno3 invoca al salido
        System.out.println("Mi nombre completo es "+alumno3.getNombre()+" "+
                     alumno3.getApellidoPaterno()+" "+alumno3.getApellidoMaterno());
        System.out.print("Mi nombre es ");
        alumno3.mostrarNombre();
        System.out.print("Mi edad es:");
        alumno3.mostrarEdad();

        Animal animal1 = new Animal();
        Animal animal2 = new Animal("macho","Firulais",2,"Perro"," Damian");

        System.out.println("El animal 2 su propietario es: ");
        animal2.obtenerNombreDueño();

        animal1.setGenero("hembra");
        animal1.setNombre("Fiona");
        animal1.setEdad(1);
        animal1.setEspecie("Perro");
        animal1.setPropietario("Lourdes");

        animal2.setGenero("hembra");
        animal2.setPropietario("Pedro");

        System.out.println("El animal 1 su propietario es: ");
        animal1.obtenerNombreDueño();

        System.out.println("El animal 2 su propietario es: ");
        animal2.obtenerNombreDueño();
        
        System.out.println("Propietario de animal 1 "+animal1.getPropietario());
        System.out.println("Genero de animal1 "+animal1.getGenero());
        System.out.println("Nombre animal 1: "+animal1.getNombre());
        System.out.println("Edad de animal 1: "+animal1.getEdad());
        System.out.println("Especie de animal 1: "+animal1.getEspecie());

        System.out.println("Propietario de animal 2 "+animal2.getPropietario());
        System.out.println("Genero de animal 2 "+animal2.getGenero());
        System.out.println("Nombre animal 2: "+animal2.getNombre());
        System.out.println("Edad de animal 2: "+animal2.getEdad());
        System.out.println("Especie de animal 2: "+animal2.getEspecie());







      



       

    }
}