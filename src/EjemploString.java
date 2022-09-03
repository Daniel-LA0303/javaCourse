public class EjemploString {

    public static void main(String[] args) {
        String curso = "Programación en java";
        String curso2 = new String("Programación en java");

        boolean esIgual = curso == curso2;
        System.out.println(esIgual);

        esIgual = curso.equals(curso2);
        System.out.println(esIgual);

        String curso3 = "Programación en java";
        esIgual = curso == curso3;
        System.out.println(esIgual);
    }
}
