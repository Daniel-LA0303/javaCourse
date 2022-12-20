package Part4;

public class Sentencia_bucle_etiquetas {
    public static void main(String[] args) {

        bucle: //esto es una etiqueta
        for (int i=0; i<5; i++){
            for (int j =0; j<5; j++){
                if(i==2){
                    continue bucle;
                }
                System.out.print("[ i =" + i+ " j= "+ j+"], ");
                j++;
            }
        }
        System.out.printf("\n");
        //bucle for y while
        bucle2: //esto es una etiqueta
        for (int i=0; i<5; i++){
            int j = 0;
            while (j<5){
                if(i==2){
                    continue bucle2;
                }
                System.out.print("[ i =" + i+ " j= "+ j +"], ");
                j++;
            }
        }

        bucle3: //esto es una etiqueta
        for (int i=0; i<=7; i++){
            int j = 0;
            while (j<=8){
                if(i==6 || i == 7){
                    System.out.println("Dia "+ i + ", Hoy se descansa papu");
                    continue bucle3;

                }
                System.out.println("Dia "+ i + ", trabajando a las "+ j+" hrs,");
                j++;
            }
        }

    }
}
