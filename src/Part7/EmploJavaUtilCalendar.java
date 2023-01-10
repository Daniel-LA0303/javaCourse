package Part7;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EmploJavaUtilCalendar {
    public static void main(String[] args) {

        //Instancear
        Calendar calendario = Calendar.getInstance();
        //calendario.set(2022, Calendar.SEPTEMBER, 25, 19, 20, 20);
        calendario.set(Calendar.YEAR, 2022);
        calendario.set(Calendar.MONTH, Calendar.DECEMBER);
        calendario.set(Calendar.DAY_OF_MONTH, 21);
        //calendario.set(Calendar.HOUR_OF_DAY,10);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 39);
        calendario.set(Calendar.SECOND, 10);
        Date fecha = calendario.getTime();

        System.out.println("Calendario = " +fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MMMM-dd");
    }
}
