package herencia;

public class Alumno extends Persona{
    private String numControl;

    public Alumno(){


    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    @Override
    public String toString(){

        return "Alumno :"+this.getNombre()+", "+this.getEdad()+" ,"+numControl;
    }


    
    
}
