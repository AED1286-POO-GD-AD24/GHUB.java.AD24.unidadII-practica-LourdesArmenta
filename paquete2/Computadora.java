package paquete2;

public class Computadora {
    private String marca;
    private String modelo;
    private Monitor monitor;
    private Monitor monitor2;
    private Monitor []  monitores;

    //
    public Computadora() {
        this.marca="";
        this.modelo ="";
        this.monitor=null;
        this.monitor2=null;
    }
    public Computadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.monitor=null;
        monitores = new Monitor[3];
    }
    public Computadora(String marca, String modelo, Monitor monitor) {
        this.marca = marca;
        this.modelo = modelo;
        this.monitor = monitor;
    }

    public Computadora(String marca, String modelo, Monitor monitor1, Monitor monitor2) {
        this.marca = marca;
        this.modelo = modelo;
        this.monitor = monitor1;
        this.monitor2 = monitor2;
    }


    public Computadora(String marca, String modelo, int n) {
        this.marca = marca;
        this.modelo = modelo;
        monitores = new Monitor[n];
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
    public Monitor getMonitor() {
        return monitor;
    }
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    

    public void obtenerDetalles(){
        if(monitor ==null)
             System.out.println("Computadora: "+marca+" Modelo: "+modelo);
        else
             System.out.println("Computadora: "+marca+" Modelo: "+modelo+
                        "Monitor Marca: "+monitor.getMarca()+" Monitor Tamaño:"+monitor.getTamanio());

    }
    public Monitor getMonitor2() {
        return monitor2;
    }
    public void setMonitor2(Monitor monitor2) {
        this.monitor2 = monitor2;
    }

    //el metodo get,regresa un arreglo de monitores
    public Monitor[] getMonitores() {
        return monitores;
    }

    //el método set asigna un arreglo de monitores
    public void setMonitores(Monitor[] monitores) {
        this.monitores = monitores;
    }
    


    
    
    
}
