package Part5;

public class OperadoresRelacionalesWrapper {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000); //explicta
        Integer num2 = num1;

        System.out.println(num1 + " " + num2);

        System.out.println("Son el mismo? " + (num1 == num2));


        num2 = 1000;

        System.out.println("Son el mismo? " + (num1 == num2)); //contiene el mismo valor pero no la misma instancea
        System.out.println("Son el mismo? " + (num1.equals(num2))); //compara el valor
        System.out.println("Son el mismo? " + (num1.intValue() == num2.intValue())); //compara por primitivos


        boolean condicion = num1 > num2; //compara en instancea
        System.out.println(condicion);
    }
}
