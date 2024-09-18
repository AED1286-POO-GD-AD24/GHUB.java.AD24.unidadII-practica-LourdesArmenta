package paquete1; 
/*
 * métodos de la clase
 * miembro de una clase: atributos y métodos
 * 
 */

class Racional {
    private int numerador;
    private int denominador;

    public Racional(){
        numerador = 0;
        denominador = 1;

    }
    public Racional(int a, int b){
        numerador = a;
        denominador = b;

    }
    public int getNumerador() {
        return numerador;
    }
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    public int getDenominador() {
        return denominador;
    }
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Racional producto(Racional r1, Racional r2){
        return new Racional();

    }

    public Racional suma(Racional r1, Racional r2){
        return new Racional();

    }

    public Racional resta(Racional r1, Racional r2){
        return new Racional();

    }

    public Racional division(Racional r1, Racional r2){
        return new Racional();

    }

    
    
}
