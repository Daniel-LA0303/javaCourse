package Part5;

public class IntegerWrapper {
    public static void main(String[] args) {

        int intPrinmitivo = 127;

        Integer intObject= Integer.valueOf(32768);
        Integer intObject2 = 32768;

        System.out.println("intObject= "+ intObject);

        int num = intObject;
        System.out.println("num = "+num);

        int num2 = intObject.intValue(); //explicita
        System.out.println("num2 = " + num2);

        //de strign a entero
        String valor = "67000";
        Integer valor2 = Integer.valueOf(valor);
        System.out.println(valor2);

        //de short
        Short shortOb = intObject.shortValue(); //perdida de info por que short soporta a hasta cierto nivel
        System.out.println(shortOb);

        //de byte
        Byte byteOb = intObject.byteValue();
        System.out.println(byteOb);

        //de Long
        Long longOb = intObject.longValue();
        System.out.println("longObj " + longOb);
    }
}
