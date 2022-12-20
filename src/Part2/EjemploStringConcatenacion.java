package Part2;

public class EjemploStringConcatenacion {

    public static void main(String[] args) {
        String curso = "Programación Java";
        String alumno = "Luis ";

        String detalle = curso + " con " + alumno;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB= 5;

        System.out.println(detalle + (numeroA + numeroB)); //Los parentesis para evitar la precendencia

        System.out.println(numeroA + numeroB + detalle);

        String detalle2 = curso.concat("con").concat(alumno);
        System.out.println(detalle2);
    }
}
