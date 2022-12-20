package Part1;

import javax.swing.*;

public class SistemasNumericos {

    public static void main(String[] args) {
        int numeroDecimal = 0;
        try{
            numeroDecimal = 500;
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error");
            main(args); //Se invoca todo nuestro codigo de forma recursiva
            System.exit(0);
        }

        System.out.println(numeroDecimal);
        System.out.println(Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100; //es binario
        System.out.println(numeroBinario);
        System.out.println(Integer.toOctalString(numeroBinario));

        int numeroOctal = 0764;
        System.out.println(numeroOctal);

        System.out.println(Integer.toHexString(numeroDecimal));

        int numeroHex = 0x1f4;
        System.out.println(numeroHex);

        String numero = JOptionPane.showInputDialog(null, "Ingrese un numero: ");
        int numeroDecimal2 = Integer.parseInt(numero);
        String mensaje = "Salut";
        mensaje += "Comment allez-vous?";
        JOptionPane.showMessageDialog(null, mensaje);



    }
}
