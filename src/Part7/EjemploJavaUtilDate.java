package Part7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        //instancea
        Date fecha = new Date();

        System.out.println("fecha = " +fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd MMMM yyyy");

        String fechaStr = df.format(fecha); //formatea la fecha
        System.out.println(fechaStr);

        long j = 0;
        for (int i = 0; i<1000000;  i++){
            j +=i;
        }
        System.out.println("j = "+j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo en for " + tiempoFinal);
        System.out.println("fechaStr " +fechaStr);
    }
}
