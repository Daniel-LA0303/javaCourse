package Part4;

public class Sentencia_while {
    public static void main(String[] args) {

        //clase 61
        int i = 0;
        while(i<5){
            System.out.println("i :" + i);
            i++;
        }

        i=0;
        boolean prueba = true;
        while (prueba){
            i++;
            System.out.println("i:"+i);
            if (i==10){
                prueba=false;
            }
        }

        //sentencia do while
        prueba = false;
        do {
            System.out.println("xd");
        }while (prueba);

        i=0;
        prueba=true;
        do{
            if (i == 10){
                prueba=false;
            }
            System.out.println("i: "+i);
            i++;
        }while (prueba);
    }
}