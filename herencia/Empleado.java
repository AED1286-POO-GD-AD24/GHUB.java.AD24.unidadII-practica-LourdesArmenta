package herencia;

public class Empleado extends Persona{
    private double sueldo;

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String saludo(){
        return "Hola soy un Empleado";
    }

    @Override
    public String toString(){
        return "Empleado: "+this.getNombre()+", "+this.getEdad()+", "+sueldo;
    }
    
    
}
