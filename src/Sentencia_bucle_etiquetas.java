public class Sentencia_bucle_etiquetas {
    public static void main(String[] args) {

        bucle: //esto es una etiqueta
        for (int i=0; i<5; i++){
            if(i==2){
                continue;
            }
            System.out.println("i =" + i);
        }
    }
}
