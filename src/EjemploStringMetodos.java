import java.util.Locale;

public class EjemploStringMetodos {

    public static void main(String[] args) {

        String nombre = "Luis Alberto";

        System.out.println(nombre.length());
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.equals("Luis"));
        System.out.println(nombre.equalsIgnoreCase("luis"));
        System.out.println(nombre.compareTo("Luis Alberto"));
        System.out.println(nombre.charAt(0));
        System.out.println(nombre.substring(1));

        String trabalenguas = "  trabaleguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));
        System.out.println(trabalenguas.indexOf('a'));
        System.out.println(trabalenguas.lastIndexOf('a'));
        System.out.println(trabalenguas.contains("t"));
        System.out.println(trabalenguas.startsWith("lenguas"));
        System.out.println(trabalenguas.endsWith("lenguas"));
        System.out.println(trabalenguas.trim());

    }
}
