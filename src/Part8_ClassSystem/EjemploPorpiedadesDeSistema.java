package Part8_ClassSystem;

import java.util.Properties;

public class EjemploPorpiedadesDeSistema {
    public static void main(String[] args) {

        String username = System.getProperty("user.name");
        System.out.println(username);

        String home = System.getProperty("user.home");
        System.out.println(home);

        String workspace = System.getProperty("user.dir");
        System.out.println(workspace);

        String java = System.getProperty("java.version");
        System.out.println(java);

        String lineSeparator = System.getProperty("line.separator");
        System.out.println(lineSeparator);

        Properties p = System.getProperties();
        p.list(System.out);
    }
}
