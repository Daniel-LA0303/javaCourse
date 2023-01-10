package Part6;

public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] edad = {10, 11, 12};

        System.out.println("iniciamos el metodo main con  = ");
        for(int i = 0; i<edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Antes de llamar al metodo test");
        test(edad); //pasar por valor

        for(int i = 0; i<edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Finaliza el metod main con el valor de i = ");
    }

    public static void test(int[] edadArr){

        for(int i = 0; i<edadArr.length; i++){
            edadArr[i] = edadArr[i] +20;
        }
    }
}
