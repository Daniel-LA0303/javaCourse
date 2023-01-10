package Part9_ClassMath;

public class Random {
    public static void main(String[] args) {

        double random = Math.random();
        System.out.println("random= "+ random);

        random*=7;
        System.out.println(random);

        String[] colores = {"azul", "verde", "negro", "amarillo", "morado"};
        System.out.println(colores[(int) random]);

        Random randomObj = new Random();
        //int randomInt = randomObj.n
    }
}
