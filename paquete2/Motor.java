package paquete2;

public class Motor {
    private String tipo;
    private int potencia;
    //contructores
    public Motor() {
    }
    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }
    //getter y setter
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    //
    public void obtenerDetalles(){
        System.out.println("tipo: "+this.tipo+"potencia: "+this.potencia);

    }
    

    
    
}
