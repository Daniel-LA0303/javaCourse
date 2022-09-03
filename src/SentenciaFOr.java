public class SentenciaFOr {

    public static void main(String[] args) {


        for (int i =0; i<5; i++){
            System.out.println("i = " + i);
        }

        int j = 0;
        for ( ; ;){
            if(j > 5){
                break;
            }
            System.out.println("j = " + j);
            j++;
        }


    }
}
