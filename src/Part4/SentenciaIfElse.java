package Part4;

public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 2.8f;
        //Podemos omitir las llaves siempre y cuando solo sean una instruccion a hacer
        if(promedio >= 6.5){
            System.out.println("Exelente");
        }else if(promedio >= 6.0){
            System.out.println("Mas o menos");
        }else  if(promedio >= 5.5){
            System.out.println("Menos de la media");
        }else if(promedio >= 5.0){
            System.out.println("Mal promedio");
        }else {
            System.out.println("Reprobado xD");
        }
    }
}
