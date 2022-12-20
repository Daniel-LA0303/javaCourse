package Part1;

public class ConversionDeTipos {

    public static void main(String[] args) {
        String numeroStr = "50";
        //Conversion de string a numero;
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("Numero es "+ numeroInt);

        String realStr = "3124.12e-2";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("Numero double es: " +realDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println(logicoBoolean);

        //Conversion de primitivos a string
        int numeroInt2 = 100;
        String numeroStr2 = Integer.toString(numeroInt2);
        System.out.println(numeroStr2);

        double realDouble2 = 1.2432e2;
        String realStr2 = Double.toString(realDouble2);
        System.out.println(realStr2);

        //Conversion de primitivos a primitivos
        int i = 10000;
        short s = (short)i; //Fozando la conconversion (casting)
        System.out.println(s);
        long l = i;
        char b =(char) i;
        System.out.println(b);
        float f = (float) i;
        System.out.println(f);
    }
}
