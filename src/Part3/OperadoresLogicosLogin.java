package Part3;

import java.util.Scanner;

public class OperadoresLogicosLogin {

    public static void main(String[] args) {

        /*String[] usernames = new String[2];
        String[] passwords = new String[2];

        usernames[0] = "Luis";
        passwords[0] = "1234";

        usernames[1] = "admin";
        passwords[1] = "0000";*/

        String[] usernames = {"Luis", "Johana", "El pepe"};
        String[] passwords = {"123", "1234", "000"};

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese el usuario: ");
        String u = in.next();

        System.out.println("Ingrese el password: ");
        String p = in.next();

        boolean isAuth = false;

        for(int i= 0; i< usernames.length; i++){

            isAuth = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : isAuth;

            /*if(  usernames[i].equals(u) && passwords[i].equals(p)){
                isAuth = true;
                break;
            }*/
        }

        String mensaje = isAuth ? " Bienvenido usuario ".concat(u).concat("!") :
                " Username o password incorrectos! \n";
        System.out.println("Mensaje: ".concat(mensaje));
        /*if(isAuth){
            System.out.println("Bienvenido: ".concat(u).concat("!"));
        }else {
            System.out.println("datos incorrectos");
        }*/

    }
}
