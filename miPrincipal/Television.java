package miPrincipal;

public class Television {
    private String  marca;
    private String tamanio;
    private String resolucion;
    private double precio;

    
    public Television() {
    }
    
    public Television(String marca, String tamanio, String resolucion, double precio) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.resolucion = resolucion;
        this.precio = precio;
    }
   
    public boolean prender(){
        return true;
    }

    public boolean apagar(){
        return true;
    }

    public void subirBajarVolumen(){
        System.out.println("Le subi o baje volumen ");

    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanio() {
        return tamanio;
    }
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getResolucion() {
        return resolucion;
    }
    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    


    
}
