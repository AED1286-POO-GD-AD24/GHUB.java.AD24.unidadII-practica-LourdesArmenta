package paquete1;

public class Automovil {
    private String marca;
    private String modelo;
    private Motor motor;

    public Automovil(String marca, String modelo, 
                 String tipoMotor, int potenciaMotor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(tipoMotor, potenciaMotor); 
            // Composición: Automovil contiene Motor
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

   
    public String obtenerDetalles() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor=" + motor +
                '}';
    }

    public static void main(String[] args) {
        Automovil auto = new Automovil("Toyota", "Corolla", "Gasolina", 132);
        System.out.println(auto.obtenerDetalles());
    }
    
}
