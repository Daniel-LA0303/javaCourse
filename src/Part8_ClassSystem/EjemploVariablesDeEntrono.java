package Part8_ClassSystem;

import java.util.Map;

public class EjemploVariablesDeEntrono {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de ambiente del sistema = " + varEnv);

        String username= System.getenv("USERNAME");
        System.out.println(username);

        String javaHome= System.getenv("JAVA_HOME");
        System.out.println(javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println(temDir);

        String path = System.getenv("Path");
        System.out.println(path);


    }
}
