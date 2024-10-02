//package miPrincipal;

public class Celular {
    private String marca;
    private String capacidad;
    private int numCamaras;
    private String modelo;
    private String color;
    private double precio;

    public Celular() {
    }

    public Celular(String marca, String capacidad, int numCamaras, String modelo, String color, double precio) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.numCamaras = numCamaras;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public void realizarLlamada(){
        System.out.println("Realizando llamada");

    }
    public boolean prender() {
        return true;

    }
    public boolean apagar() {

        return true;
    }
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    public int getNumCamaras() {
        return numCamaras;
    }
    public void setNumCamaras(int numCamaras) {
        this.numCamaras = numCamaras;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
