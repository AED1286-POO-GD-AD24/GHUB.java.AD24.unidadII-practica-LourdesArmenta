package descuento;
import java.util.Scanner;

public class testDescuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingresa el nombre del producto:");
        String nombre = sc.nextLine();
        System.out.print("ingresa el precio del producto:");
        double precio = sc.nextDouble();
        System.out.print("ingresa el descuento del producto:");
        Producto producto = new Producto(nombre, precio);

    
        double descuento = sc.nextDouble();

        double nuevoPrecio =producto.calcularDescuento(precio, descuento);

        
        System.out.println("El producto " + producto.getNombre()+ " tiene un precio de " +
              producto.getPrecio() + " y con el descuento de " + descuento + "% tiene un precio de " + 
              nuevoPrecio);

        System.out.println("Precio producto: " + producto.getPrecio());
        
    }
    
}
