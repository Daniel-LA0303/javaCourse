package Part11_Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemploArreglo {
    public static void main(String[] args) {
        int[] numeros = new int[4]; //declaracion

        String[] productos = new String[7];
        productos[0] = "producto 1";
        productos[1] = "producto Buena";
        productos[2] = "producto camisa";
        productos[3] = "producto 4";
        productos[4] = "producto tarjeta";
        productos[5] = "producto 6";
        productos[6] = "producto xd";

        //orden
        Arrays.sort(productos);
        //iteracion 1
        int tamanioA = productos.length;
        for (int i = 0; i<tamanioA; i++){
            System.out.println("producto = " +productos[i]);
        }
        System.out.println("------------------");
        //iteracion 2 forEach
        for (String pro: productos){
            System.out.println("producto = " +pro);
        }
        System.out.println("------------------");
        //iteracion 3 while
        int i = 0;
        while (i < tamanioA){
            System.out.println("producto = " +productos[i]);
            i++;
        }
        System.out.println("------------------");
        //iteracion 4 do while
        int j = 0;
        do{
            System.out.println("producto = " +productos[j]);
            j++;
        }while (j < tamanioA);
    }
}
