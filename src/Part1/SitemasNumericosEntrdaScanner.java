package Part1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SitemasNumericosEntrdaScanner {

    public static void main(String[] args) {
        //Intancear clase scanner para entrada de datos
        Scanner in = new Scanner(System.in);

        //Leyendo datos
        System.out.println("Ingrese un numero");
        String numeroStr = in.nextLine();
        System.out.println("Su numero es: " + numeroStr);

        int numneroDecimal = 0;
        try{
            numneroDecimal = in.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Error");
            main(args);
            System.exit(0);
        }

        System.out.println("Numero decimal es: " + numneroDecimal);
    }
}
