package descuento;

public class Producto {
    private String nombre;
    private double precio;
    
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getPrecio() {
        return precio;
    }



    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public  double calcularDescuento(double p, double d){
        double nuevo = p - (p * d / 100);

        this.precio = nuevo;

        return nuevo;

    }

    public  double calcularDescuento( double d){
        double nuevo = this.precio - (this.precio * d / 100);

        this.precio = nuevo;

        return nuevo;

    }

     public double calcularDescuento(int descuento){
        double nuevo = this.precio - (this.precio * descuento / 100);

        this.precio = nuevo;

        return nuevo;
    }


    
}