package miPrincipal;

public class Libro {
    private String titulo;
    private String autor;
    private int numPaginas;
    private double precio;

    public Libro(){
        this.titulo="sin titulo";
        this.autor = "sin autor";
        this.numPaginas = 0;
        this.precio = 0.0;

    }
    public Libro(String titulo, String auto, int numPaginas, double precio){
        this.titulo = titulo;
        this.autor = auto;
        this.numPaginas = numPaginas;
        this.precio = precio;
    }

    public int abrir(){
        return 0;
    }

    public boolean cerrar(){
        return true;
    }

    public void mostraTitulo(){
        System.out.println("El titulo del libro es "+this.titulo);

    }

    public boolean prestar(){
        return true;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getNumPaginas(){
        return this.numPaginas;
    }
    public void setNumPaginas(int numPaginas){
        this.numPaginas = numPaginas;
    }

    public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }





    


    
}
