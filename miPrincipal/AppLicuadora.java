package miPrincipal;

public class AppLicuadora {
    public static void menu() {
        System.out.println("********************************");
        System.out.println("          CLASE LICUADORA       ");  
        System.out.println("********************************");

        Licuadora licuadora1 = new Licuadora();
        System.out.println("Atributos del objeto Licuadora1:");
        System.out.println("Marca: "+licuadora1.getMarca());
        System.out.println("Modelo: "+licuadora1.getModelo());
        System.out.println("Velocidad: "+licuadora1.getVelocidades());
        System.out.println("Precio: "+licuadora1.getPrecio());

        licuadora1.setMarca("Pillip");

        System.out.println("Atributos del objeto Licuadora1:");
        System.out.println("Marca: "+licuadora1.getMarca());
        System.out.println("Modelo: "+licuadora1.getModelo());
        System.out.println("Velocidad: "+licuadora1.getVelocidades());
        System.out.println("Precio: "+licuadora1.getPrecio());

        Licuadora licuadora2 = new Licuadora("Oster","XL26", 40000,580);

        System.out.println("Atributos del objeto Licuadora2:");
        System.out.println("Marca: "+licuadora2.getMarca());
        System.out.println("Modelo: "+licuadora2.getModelo());
        System.out.println("Velocidad: "+licuadora2.getVelocidades());
        System.out.println("Precio: "+licuadora2.getPrecio());

        licuadora2.setMarca("Ostericer");

        System.out.println("Atributos del objeto Licuadora2:");
        System.out.println("Marca: "+licuadora2.getMarca());
        System.out.println("Modelo: "+licuadora2.getModelo());
        System.out.println("Velocidad: "+licuadora2.getVelocidades());
        System.out.println("Precio: "+licuadora2.getPrecio());



        
    }

   
    

    
}
