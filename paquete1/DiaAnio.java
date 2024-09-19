package paquete1;
/*
 * Definir una clase de nombre DiaAnio que contenga los atributos: mes y dia
 * y los métodos: igual() y visualizar(). Que el mes se registre como un Entero: 1- Enero
 * 2-Febrero,....12-Diciembre y el día  del mes debe registrarse en una variable entero
 * Escribir un programa que compruebe si es una fecha de su cumpleaños
 * El metodo main() es la clase Principal, El va a esta en una clase de nombre Cumple y esta
 * creará un objeto de tipo DiaAnio y va a llamar all método igual para determinar si la fecha coincide con
 * la fecha de su cumpleaños
 */

class DiaAnio {
    private int mes;
    private int dia;
    //constructores

    public DiaAnio() {
    }
    public DiaAnio(int d,int m){
        this.mes =m;
        this.dia = d;
    }
    //métodos propios
    public boolean igual(DiaAnio d){
        if((this.dia == d.dia) &&(this.mes == d.mes))
           return true;
        else
           return false;

    }
    //getter y setter
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void visualizar(){
        System.out.println("mes = "+this.mes+ " dia = "+this.dia);
     
    }
    
    
    
}
