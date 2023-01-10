package Part8_ClassSystem;

import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPorpiedadesDeSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/Part8_SystemClass/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("config.texto.ambiente","un valor");
            System.setProperties(p);
            System.getProperties().list(System.out);
        }catch (Exception e){
            System.out.println("No existe el archivo");
        }

    }
}
