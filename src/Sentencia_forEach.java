public class Sentencia_forEach {
    public static void main(String[] args) {
        int[] num = {1,3,5,7,9,11,13,14};

        //recorrer un arreglo de numeros
        for(int numero: num){
            System.out.println("numero :"+ numero);
        }

        String[] nombres = {"luis", "joh", "gats", "jorge", "noe", "sophia", "mark", "pepa"};


        //recorrer un objeto
        for(String nombre: nombres){
            System.out.println("nombre: "+nombre);
        }
    }
}
