package paquete1;

public class Computadora {
    private String marca;
    private String modelo;
    private Monitor monitor;

    public Computadora(String marca, String modelo, Monitor monitor) {
        this.marca = marca;
        this.modelo = modelo;
        this.monitor = monitor; // Agregación: Computadora tiene un Monitor
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    
    public String obtenerDetalles() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", monitor=" + monitor +
                '}';
    }

    public static void main(String[] args) {
        Monitor monitor = new Monitor("Dell", 24);
        //Computadora computadora = new Computadora("HP", "Pavilion");
       
    }
    
}
