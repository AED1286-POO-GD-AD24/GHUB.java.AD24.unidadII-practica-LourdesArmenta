package herencia;

public class testHerencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan Perez",18);
        persona1.setNombre("Luis Perez");
        persona1.setEdad(17);
        System.out.println("Persona 1: nombre "+persona1.getNombre());
        System.out.println("Persona 1: edad "+persona1.getEdad());

        System.out.println(persona1.toString());

        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Maximiliano Martin");
        alumno1.setEdad(20);
        alumno1.setNumControl("23170226");
        System.out.println("Alumno 1: nombre "+alumno1.getNombre());
        System.out.println("Alumno 1: edad "+alumno1.getEdad());
        System.out.println("Alumno 1: numero de control "+alumno1.getNumControl());

        System.out.println(alumno1);
        

        Empleado empleado1 = new Empleado();
        empleado1.setSueldo(20000);
        empleado1.setNombre("Lourdes Armenta");
        empleado1.setEdad(57);

        System.out.println("Empleado 1: nombre "+alumno1.getNombre());
        System.out.println("Empleado 1: edad "+alumno1.getEdad());
        System.out.println("Empleado 1: sueldo "+empleado1.getSueldo());

        System.out.println(empleado1.toString());


        Integer a = 123;
        
        Integer b = 456;
        
    
        System.out.println("Valores de a y b "+a.toString()+b.toString());

    











        
    }

}
