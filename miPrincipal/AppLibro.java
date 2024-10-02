//package miPrincipal;
public class AppLibro{
    public static void menu(){
        System.out.println("********************************");
        System.out.println("          CLASE LIBRO           ");
        System.out.println("********************************");
        Libro libro1 = new Libro(); //invoca al contructor vacio
        Libro libro2 = new Libro("Cien años de soledad","Grabriel García Marquez",400,450.00);
        Libro libro3 = new Libro("Rayuela","Julio Cortazar",350,685.00);
        System.out.println("Titulo de Libro1 "+libro1.getTitulo());
        System.out.println("Autor de Libro1 "+libro1.getAutor());
        System.out.println("Num paginas libro1 "+libro1.getNumPaginas());
        System.out.println("Precio libro1 "+libro1.getPrecio());

        libro1.setAutor("Juan Rulfo");
        libro1.setTitulo("El Llano en llamas");
        libro1.setNumPaginas(50);

        System.out.println("Titulo de Libro1 "+libro1.getTitulo());
        System.out.println("Autor de Libro1 "+libro1.getAutor());
        System.out.println("Num paginas libro1 "+libro1.getNumPaginas());
        System.out.println("Precio libro1 "+libro1.getPrecio());

       
        libro1.mostrarTitulo();
        libro2.mostrarTitulo();
        libro3.mostrarTitulo();
        










    }
}