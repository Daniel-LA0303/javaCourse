package Part11_Array;

import java.util.Scanner;

public class DetectarOrden {
    public static void main(String[] args) {

        int[] a = new int[7];
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 numeros");
        for(int i = 0; i<a.length; i++){
            a[i] = s.nextInt();
        }
        boolean ascendente = false;
        boolean descendente = false;
        for(int i = 0; i<a.length -1; i++){
            if (a[i] > a[i+1]){
                descendente = true;
            }

            if (a[i]<a[i+1]) {
                ascendente = true;
            }
        }

        if (ascendente && descendente){
            System.out.println("Desordenado");
        }

        if (!ascendente && !descendente){
            System.out.println("Todos son iguales");
        }

        if (ascendente && !descendente){
            System.out.println("ascendente");
        }
        if (!ascendente && descendente){
            System.out.println("descendente");
        }
    }
}
