
public class AppAnimal{
    public static void menu(){
        System.out.println("********************************");
        System.out.println("          CLASE ANIMAL          ");
        System.out.println("********************************");
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