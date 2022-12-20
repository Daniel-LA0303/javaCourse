package Part3;

public class OperadorInstanceOfTiposAbstractos {
    public static void main(String[] args) {
        Object texto = new String("Creando un objeto de la clase String ....Salut!!");

        Number num = Integer.valueOf(7); //7;
        boolean b1 = texto instanceof String;
        System.out.println("Texto es del tipo String " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es del tipo Object " + b1);

        b1 = texto instanceof Integer;
        System.out.println("Texto es del tipo Integer " + b1);

        b1 = num instanceof Number;
        System.out.println("Texto es del tipo Number " + b1);

        Double decimal = 45.22;
        b1 = decimal instanceof Number;
        System.out.println("Texto es del tipo Double " + b1);

        b1 = num instanceof Long;
        System.out.println("Num es del tipo Long" + b1);

        b1 = num instanceof Double;
        System.out.println("Num es del tipo Double" + b1);

        /*Number decimal = 45.22;*/


        /*b1 = b1 instanceof Boolean;*/

    }
}
