package miPrincipal;

public class AppCelular {
    public static void menu() {
        System.out.println("********************************");
        System.out.println("          CLASE CELULAR         ");
        System.out.println("********************************");

        //Crear un objeto celular vacio
        Celular celular1 = new Celular();
        System.out.println("valores de los atributos del objeto celular1:");
        System.out.println("Marca: "+celular1.getMarca());
        System.out.println("Modelo: "+celular1.getModelo());
        System.out.println("Capacidad: "+celular1.getCapacidad());
        System.out.println("Color: "+celular1.getColor());
        System.out.println("Precio: "+celular1.getPrecio());
        System.out.println("Número Camaras: "+celular1.getNumCamaras());

        celular1.setMarca("Nokia"); 
        celular1.setPrecio(5499.10);
        celular1.setCapacidad("128 Gb");
        celular1.setColor("negro");

        System.out.println("valores de los atributos del objeto celular1:");
        System.out.println("Marca: "+celular1.getMarca());
        System.out.println("Modelo: "+celular1.getModelo());
        System.out.println("Capacidad: "+celular1.getCapacidad());
        System.out.println("Color: "+celular1.getColor());
        System.out.println("Precio: "+celular1.getPrecio());
        System.out.println("Número Camaras: "+celular1.getNumCamaras());

        //Crear un objeto con valores iniciales
        Celular celular2 = new Celular("Apple","68 Gb",2 ,
                               "iphone 4","rojo",20000);

                               System.out.println("valores de los atributos del objeto celular2:");
                               System.out.println("Marca: "+celular2.getMarca());
                               System.out.println("Modelo: "+celular2.getModelo());
                               System.out.println("Capacidad: "+celular2.getCapacidad());
                               System.out.println("Color: "+celular2.getColor());
                               System.out.println("Precio: "+celular2.getPrecio());
                               System.out.println("Número Camaras: "+celular2.getNumCamaras());

        celular2.setColor("negro");

        System.out.println("valores de los atributos del objeto celular2:");
        System.out.println("Marca: "+celular2.getMarca());
        System.out.println("Modelo: "+celular2.getModelo());
        System.out.println("Capacidad: "+celular2.getCapacidad());
        System.out.println("Color: "+celular2.getColor());
        System.out.println("Precio: "+celular2.getPrecio());
        System.out.println("Número Camaras: "+celular2.getNumCamaras());

                                     

        

        


    }
        
    
}
