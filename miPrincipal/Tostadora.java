//package miPrincipal;

public class Tostadora {
    private String marca;
    private String modelo;
    private int temperatura;
    private double precio ;

    public Tostadora() {
    }
    public Tostadora(String marca, String modelo, int temperatura, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.temperatura = temperatura;
        this.precio = precio;
    }

    public void tostar(){
        System.out.println("Tostando");
    }
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

    

    
}
