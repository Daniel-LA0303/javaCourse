package Part11_Array;

import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        int[] a, pares, impares;
        int tPares=0, tImpares=0;
        a = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 numeros");
        for(int i = 0; i<a.length; i++){
            a[i] = s.nextInt();
        }
        for(int i = 0; i<a.length; i++){
            if (a[i]%2==0){
                tPares++;
            }else {
                tImpares++;
            }
        }

        pares = new int[tPares];
        impares = new int[tImpares];
        int j = 0, k=0;
        for(int i = 0; i<a.length; i++){
            if (a[i]%2==0){
                pares[j++]=a[i];
            }else {
                impares[k++] = a[i];
            }
        }

        System.out.println("Los praes son:");
        for(int i = 0; i<pares.length; i++){
            System.out.println(pares[i]);
        }

        System.out.println("Los impraes son:");
        for(int i = 0; i<impares.length; i++){
            System.out.println(impares[i]);
        }
    }
}
