package miPrincipal;

public class Licuadora {
    private String marca;
    private String modelo;
    private int velocidades;
    private double precio;

    public Licuadora() {
    }
    public Licuadora(String marca, String modelo, int velocidades, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidades = velocidades;
        this.precio = precio;
    }
    public boolean encender(){
        return true;
    }
    public boolean apagar() {
        return true;
    }
    public void licuar(){
        System.out.println("Licuando");
    }
        
    public void cambiarVelocidad(){
        System.out.println("Cambiando velocidad");
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
    public int getVelocidades() {
        return velocidades;
    }
    public void setVelocidades(int velocidades) {
        this.velocidades = velocidades;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
}
