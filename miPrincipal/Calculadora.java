//package miPrincipal;

public class Calculadora {
    private String marca;
    private String modelo;
    private double precio;
    private double operador1;
    private double operdor2;

    public Calculadora() {

    }
    public Calculadora(String marca, String modelo, double precio, double operador1, double operdor2) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.operador1 = operador1;
        this.operdor2 = operdor2;
    }
    public double calcularSuma(){
        return 0.0;
        
    }
    public double calcularResta(){
        return 0.0;

    }
    public double calcularMult(){
        return 0.0;

    }
    public int calcularCociente(){
        return 0;

    }
    public int calcularResiduo(){
        return 0;

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
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getOperador1() {
        return operador1;
    }
    public void setOperador1(double operador1) {
        this.operador1 = operador1;
    }
    public double getOperdor2() {
        return operdor2;
    }
    public void setOperdor2(double operdor2) {
        this.operdor2 = operdor2;
    }

    
    
}
