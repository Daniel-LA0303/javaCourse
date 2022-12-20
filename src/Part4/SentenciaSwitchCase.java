package Part4;

import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        int num = 3;
        //solo acepta char, short, int, byte, string

        switch (num){
            case 0:
                System.out.println("es 0");
                break;
            case 1:
                System.out.println("es 1");
                break;
            case 2:
                System.out.println(" es 2");
                break;
            case 3:
                System.out.println("es 3");
                break;
            default:
                System.out.println("No es ninguno");
                break;
        }

        //obtener el mes a partir del numero el mes

        Scanner in = new Scanner(System.in);
        int mes = in.nextInt();
        String nombreMes = null;
        switch (mes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                System.out.println("No hay coincidencia");
        }
        if (nombreMes == null){
            return;
        }else{
            System.out.println("El mes insertado por medio de un numero es: " + nombreMes);
        }

    }
}
