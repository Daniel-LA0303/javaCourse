package Part10_Argumentos;

public class ArgumentosLineaComando {
    public static void main(String[] args) {

        for (int i = 0; i<args.length; i++){
            System.out.println("Arguementos n " + i + ": " + args[i]);
        }
    }
}
