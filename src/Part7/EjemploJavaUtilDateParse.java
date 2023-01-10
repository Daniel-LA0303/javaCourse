package Part7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fehca con formato 'yyyy-MM-dd'");
        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("fecha = " + format.format(fecha));

            Date fecha2 = new Date();
            if(fecha.after(fecha2)){
                System.out.println("facha1 y despues fecha2");
            }else if(fecha.before(fecha2)){
                System.out.println("fehca ");
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
