package Part11_Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArregloInversoMutable {
    public  static void arregloInverso(String[] arreglo){
        int tamanioA = arreglo.length;
        int tamanioA2 = arreglo.length;
        for (int i = 0; i<tamanioA/2; i++){
            //System.out.println("producto = " +productos[i]);
            String actual = arreglo[i];
            String inverso = arreglo[tamanioA-1-i];
            arreglo[i] = inverso;
            arreglo[tamanioA-1-i] = actual;
            tamanioA2--;
        }
    }
    public static void main(String[] args) {
        String[] productos = new String[7];
        productos[0] = "producto 1";
        productos[1] = "producto Buena";
        productos[2] = "producto camisa";
        productos[3] = "producto 4";
        productos[4] = "producto tarjeta";
        productos[5] = "producto 6";
        productos[6] = "producto xd";

        //iteracion 1
        int tamanioA = productos.length;
        for (int i = 0; i<tamanioA; i++){
            System.out.println("producto = " +productos[i]);
        }
        System.out.println("-----------------");
        //reagrupando
        arregloInverso(productos);

        Collections.reverse(Arrays.asList(productos));
        System.out.println("-----------------");
        for (int i = 0; i<tamanioA; i++){
            System.out.println("producto = " +productos[i]);
        }
    }
}
