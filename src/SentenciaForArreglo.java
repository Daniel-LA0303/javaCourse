import javax.swing.*;
import java.util.Locale;

public class SentenciaForArreglo {
    public static void main(String[] args) {


        String[] nombres = {"luis", "joh", "gats", "jorge", "noe", "sophia", "mark", "pepa"};
        int count = nombres.length;

        for(int i = 0; i < count; i++){
            if (nombres[i].toLowerCase().contains("ANDRES".toLowerCase()) || nombres[i].toLowerCase().contains("pEpA".toLowerCase())){
                continue;
            }
            System.out.println( i + "._" + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Luis\" o \"Noe\"");
        System.out.println("buscar = " +buscar);
        boolean encontrado = false;
        for (int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado= true;
                break;
            }
        }
        if(encontrado){
            System.out.println("Ese nombre fue encontrado");
        }else{
            System.out.println("Ese nombre NO fue encontrado");
        }
    }
}
