package constructoresSobrecargados;

public class AppEquipoSonido {
    public static void main(String[] args) {
        EquipoSonido eq1,eq2,eq3; //Declaración de tres referencias a objetos de la clase EquipoSonido
        eq1 = new EquipoSonido(); //Se crea un objeto de la clase EquipoSonido con el constructor por defecto
        eq2 = new EquipoSonido("Sony"); //Se crea un objeto de la clase EquipoSonido con el constructor con un parámetro
        eq3 = new EquipoSonido("Panasonic", 100, 220); //Se crea un objeto de la clase EquipoSonido con el constructor con tres parámetros

        eq1=null;//Se libera la memoria del objeto referenciado por eq1
        eq2=null;//Se libera la memoria del objeto referenciado por eq2
        eq3=null;//Se libera la memoria del objeto referenciado por eq3

        System.gc();//Se invoca al recolector de basura
        

       
    }
    
}
