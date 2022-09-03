public class EjemplosExtensionArchivo {

    public static void main(String[] args) {

        String archivo = "archivo.Imagen.jpg";
        int i = archivo.lastIndexOf(".");
        System.out.println(i);
        System.out.println(archivo.length());
        System.out.println(archivo.substring(i+1));

    }
}
