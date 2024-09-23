package paquete2;

public class Automovil {
    private String marca;
    private String modelo;
    private Motor motor;
    //constructores
    
    public Automovil(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    //getter y setter
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
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void obtenerDetalles(){
        System.out.println("Marca:"+marca+" Modelo: "+modelo+" Motor tipo: "+ 
                           motor.getTipo()+" Motor Potencia: "+motor.getPotencia());
    }
    

    
    

    
}
