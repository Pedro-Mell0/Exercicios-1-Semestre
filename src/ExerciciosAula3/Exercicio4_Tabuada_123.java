package ExerciciosAula3;

import javax.swing.*;

public class Exercicio4_Tabuada_123 {
    public static void main(String[] args) {
        int p = 1;

        while (p < 11) {
            JOptionPane.showMessageDialog(null,"Tabuada do 1 = " + 1 * p);
            p++;
        }


        for (int e = 1; e < 11; e++) {
            JOptionPane.showMessageDialog(null,"Tabuada do 2 = " + 2 * e);
        }

        for (int d = 1; d < 11; d++) {
            JOptionPane.showMessageDialog(null,"Tabuada do 3 = " + 3 * d);
        }


    }
}
