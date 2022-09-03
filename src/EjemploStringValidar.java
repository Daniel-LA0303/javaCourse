import java.util.Locale;

public class EjemploStringValidar {

    public static void main(String[] args) {
        String curso = null;
        boolean esNulo = curso == null;

        System.out.println(esNulo);
        if(esNulo){
            //System.out.println(curso.toUpperCase()); //Da error ya que no tiene nada

            curso = "Bienvenue á Paris";
        }
        boolean esVacio = curso.length() ==0;
        boolean esVacio2 = curso.isEmpty();
        if(curso.isEmpty() == false){
            System.out.println("Salut" + curso);
        }


    }
}
