package Part5;

import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "Hola que tal";
        Class strClass = texto.getClass(); //retrona una instacea tipo class

        System.out.println("strClass. = " + strClass.getName());
        System.out.println("strClass. = " + strClass.getSimpleName());
        System.out.println("strClass. = " + strClass.getPackage());
        System.out.println("strClass. = " + strClass);

        for(Method metodo: strClass.getMethods()) {
            System.out.println("Metodo.getName = " +metodo.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();
        System.out.println("intClass = "+intClass.getSuperclass().getSuperclass());
    }
}
