package Part11_Array;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        String[] productos = {"Producto 1", "Camisa", "Pantalon", "Chamarra", "Sombrero", "Sudadera", "telefono"};

        int total = productos.length;
        int contador = 0;
        for(int i=0; i<total-1; i++){
            for (int j=0; j<total; j++){
                if (productos[i].compareTo(productos[j]) < 0){
                    String aux = productos[i];
                    productos[i]=productos[j];
                    productos[j]=aux;
                }
                contador++;
            }
        }
        for (int i = 0; i<total; i++){
            System.out.println("producto = " +productos[i]);
        }
        System.out.println(contador);

        String[] productos2 = {"Producto 13", "Producto 1", "Producto 6", "Producto 4", "Producto 2", "Producto 0", "Producto 5"};

        //optimizado
        int contador2 = 0;
        for(int i=0; i<total -1; i++){
            for (int j=0; j<total -1 -i; j++){
                if (productos2[j+1].compareTo(productos2[j]) < 0){
                    String aux = productos2[i];
                    productos2[i]=productos2[j+1];
                    productos2[j+1]=aux;
                }
                contador2++;
            }
        }
        
        for (int i = 0; i<total; i++){
            System.out.println("producto = " +productos2[i]);
        }
        System.out.println(contador2);
    }
}
