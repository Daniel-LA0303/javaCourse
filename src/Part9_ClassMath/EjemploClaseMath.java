package Part9_ClassMath;

public class EjemploClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println(absoluto);

        double max = Math.max(3.5, 1.5);
        System.out.println(max);

        double min = Math.min(3.4,10);
        System.out.println(min);

        double techo = Math.ceil(3.5);
        System.out.println(techo);

        double piso = Math.floor(2.1);
        System.out.println(piso);

        long entero = Math.round(2.3);
        System.out.println(entero);

        double exp = Math.exp(1);
        System.out.println(exp);

        double logaritmoN = Math.log(0);
        System.out.println(logaritmoN);

        double potencia = Math.pow(10, 3);
        System.out.println(potencia);

        double raiz = Math.sqrt(5);
        System.out.println(raiz);

        double grados = Math.toDegrees(1.57);
        grados=Math.round(grados);

        System.out.println("sin(90) " +Math.sin(grados));
        System.out.println("cos(90) " +Math.cos(grados));
       // System.out.println("sin(90) " +Math.sin(grados));
    }
}
