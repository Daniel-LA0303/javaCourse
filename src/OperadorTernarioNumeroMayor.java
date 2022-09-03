import java.util.Scanner;

public class OperadorTernarioNumeroMayor {

    public static void main(String[] args) {
        int max = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un numero 1: ");
        int num1 = in.nextInt();
        System.out.println("Ingrese un numero 2: ");
        int num2 = in.nextInt();
        System.out.println("Ingrese un numero 3: ");
        int num3 = in.nextInt();

        System.out.println("Ingrese un numero 4: ");
        int num4 = in.nextInt();

        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        max = (max > num4) ? max : num4;

        System.out.println("Numero maximo es: " + max);


    }
}
