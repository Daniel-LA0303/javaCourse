public class PrimitivosCaracteres {
    public static void main(String[] args) {

        char caracter = 'a';
        char simbolo = '\u0221';

        System.out.println(caracter);
        System.out.println(simbolo);

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        System.out.println("concatenando: "+ caracter + espacio + simbolo);
        System.out.println("retroseso: "+ caracter + retroceso + simbolo);
        System.out.println("tabulador: "+ caracter + tabulador + simbolo);


    }
}
