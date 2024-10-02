//package miPrincipal;
import java.util.Scanner;

public class Principal {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        //System.out.println(new Principal().getGreeting());
        Scanner teclado = new Scanner(System.in);
        int opc = 0;
        do{
            System.out.println("********************************");
            System.out.println("         MENU PRINCIPAL         ");
            System.out.println("********************************");
            System.out.println(" 1) Alumno");
            System.out.println(" 2) Animal");
            System.out.println(" 3) Libro");
            System.out.println(" 4) Television");
            System.out.println(" 5) Celular");
            System.out.println(" 6) Tostadora");
            System.out.println(" 7) Licuadora");
            System.out.println(" 8) Calculadora");
            System.out.println("\t 0) Salir");
            System.out.print("Seleccione la opción deseada:");
            opc = teclado.nextInt();
            switch (opc){
                case 1:
                   AppAlumno.menu();
                   break;

                case 2:
                   AppAnimal.menu();
                   break;
                case 3:
                   AppLibro.menu();
                   break;
                case 4:
                   AppTelevision.menu();
                   break;
                case 5:
                   AppCelular.menu();
                   break;
                case 6:
                    AppTostadora.menu();
                    break;
                case 7:
                    AppLicuadora.menu();
                    break;
                case 8:
                    AppCalculadora.menu();
                    break;
                case 0:
                    System.out.println("Hasta luego!");
                    //teclado.close();
                    break;
                default:
                   System.out.println("Opción incorrecta");

            }
        } while (opc !=0);
        

        

        
    }
}