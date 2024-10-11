package operador_instanceof;
//Operador instanceof, se utiliza cuando requerimos conocer a que clase
//     pertenece un objeto
//Considerar las jerarquias de clasr que dan CONVERSIONES AUTOMARICA
//derivada de la base
//se puede considerae un operador relacional

public class DemoInstanceof {
    public static void main(String[] args) {
        short a = 150;
        int b = 50000;
        long c = 500L;

        b = (int) c; //conversiom explicita operacion de cast
        c = b; //conversion automatica 

        String nombre = "Lourdes";
        hacer(nombre);

        Integer numero = 123;
        hacer(numero);

        Persona p1=new Persona();
        Animal a1 = new Animal();

        hacer(p1);
        hacer(a1);

        String valor = "123";
        int num =  Integer.parseInt(valor); //convierto un Sting a un entero
        System.out.println(num);
        double num2 = Double.parseDouble(valor); //convierto un String a un double
        System.out.println(num2);

        

    }
    public static void hacer(Object g){
        if (g instanceof Integer){
            System.out.println("Me mandaste un Integer");
            Integer valor = (int)g; //conversion segura
            System.out.println(valor+10);
        } 
        
        if (g instanceof String){
            System.out.println("Me mandaste un String");
            String nuevaCadena = (String)g;
            System.out.println(nuevaCadena+"$");
        }
        if(g instanceof Persona){
            System.out.println("Me mandaste a una persona");
            Persona p = (Persona)g; //operacion de cast
            System.out.println("que se llama "+p.getNombre());
        }
        if (g instanceof Animal){
            System.out.println("Me mandate un animal");
            Animal a = (Animal) g;
            System.out.println("que se llama "+a.getNombre());

        }


    }

    
}
