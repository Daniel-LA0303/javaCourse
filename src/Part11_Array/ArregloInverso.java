package Part11_Array;

public class ArregloInverso {
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

        System.out.println("Inverso 1");
        for (int i = 0; i<tamanioA; i++){
            System.out.println("producto = " +productos[tamanioA-1-i]);
        }

        System.out.println("Inverso 2");
        for (int i = tamanioA-1; i>=0; i--){
            System.out.println("producto = " +productos[i]);
        }
    }
}
