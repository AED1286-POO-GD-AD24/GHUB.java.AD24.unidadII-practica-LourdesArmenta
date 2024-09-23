package paquete2;

public class Monitor {
    private String marca;
    private int tamanio;
    //constryctores
    public Monitor() {
    }
    public Monitor(String marca, int tamanio) {
        this.marca = marca;
        this.tamanio = tamanio;
    }
    //getter y setter
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getTamanio() {
        return tamanio;
    }
    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    public String obtenerDetalles(){
        return "Monitor Marca: "+marca+" Tamaño: "+tamanio;
    }
    

    
}
