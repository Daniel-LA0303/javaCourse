package Part2;

public class EjemploStringInmutable {

    public static void main(String[] args) {
        String curso = "Programación Java";
        String alumno = "Luis ";

        String res = curso.concat(alumno);
        System.out.println(res);
        String res2 = curso.transform(c -> {
            return c + " con " + alumno;
        });

        System.out.println(res2);

        String res3 = res.replace("a", "A");

        System.out.println(res3);
    }
}
