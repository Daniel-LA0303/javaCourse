package Part5;

public class BooleanWrapper {
    public static void main(String[] args) {

        Integer num1, num2;

        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; //false
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = false;

        System.out.println(primBoolean);
        System.out.println(objBoolean);
        System.out.println(objBoolean2);


        System.out.println("Comparando 2 objetos boolean: "+(objBoolean==objBoolean2)); //compara por el valor
        System.out.println("Comparando 2 objetos boolean: "+(objBoolean.equals(objBoolean2)));
        System.out.println("Comparando 2 objetos boolean: "+(objBoolean2 == objBoolean3));
    }
}
