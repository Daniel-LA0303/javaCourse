package Part6;
class Persona{
    public String nombre;

    //metodo para modificar nombre
    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre; //referencia al atributo de la clase
    }

    public String leerNombre(){
        return this.nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        System.out.println("iniciamos el metodo main con  = ");
        persona.modificarNombre("Andres");
        System.out.println("persona = " + persona.leerNombre());


        test(persona); //pasar por valor

        System.out.println("Finaliza el metod main con el valor de  = " + persona.leerNombre());

    }

    public static void test(Persona persona){

        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el metodo");
    }
}
