package Part3;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        String variable = 7 == 5 ? "true" : "false";
        System.out.println(variable);

        String estado = "";
        double promedio = 6.2;

        double mat = 0.0;
        double sci = 0.0;
        double his = 0.0;

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese calificación Matemáticas: ");
        mat = in.nextDouble();
        System.out.println("Ingrese calificación Matemáticas: ");
        sci = in.nextDouble();
        System.out.println("Ingrese calificación Matemáticas: ");
        his = in.nextDouble();


        promedio = (mat + sci + his) / 3;


        estado = promedio >= 5.49 ? "Aproado" : "Rechazado";

        System.out.println("El estado es: ".concat(estado).concat("Promedio es: " + promedio));

        /*if (promedio >= 5.49){
            estado = "Aprobado";
        }*/
    }
}
