package paquete1;

public class Monitor {
    private String marca;
    private int tamaño;

    public Monitor(String marca, int tamaño) {
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public int getTamaño() {
        return tamaño;
    }
    public void obtenerDetalles(){
        System.out.println("monitor marca = "+marca+" Monitor Tamaño:"+tamaño);
    }

    
    
}
