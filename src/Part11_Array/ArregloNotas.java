package Part11_Array;

import java.util.Scanner;

public class ArregloNotas {
    public static void main(String[] args) {

        double[] mat, his, fran;
        mat = new double[7];
        his = new double[7];
        fran = new double[7];

        int sumaMat=0, sumaHis=0, sumaFran=0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese notas de Matematicas");
        for(int i = 0; i<mat.length; i++){
            mat[i] = s.nextInt();
        }
        System.out.println("Ingrese notas de Historia");
        for(int i = 0; i<his.length; i++){
            his[i] = s.nextInt();
        }
        System.out.println("Ingrese notas de Frances");
        for(int i = 0; i<fran.length; i++){
            fran[i] = s.nextInt();
        }

        for(int i = 0; i<7; i++){
            sumaMat += mat[i];
            sumaHis += his[i];
            sumaFran += fran[i];
        }

        System.out.println("Promedio para matematicas: "+(sumaMat/ mat.length));
        System.out.println("Promedio para historia: "+(sumaHis/ his.length));
        System.out.println("Promedio para frances: "+(sumaFran/ fran.length));

        System.out.println("Promedio total: "+((sumaMat+sumaFran+sumaHis)/(3)));

    }
}
