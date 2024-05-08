package ExerciciosAula3;

import javax.swing.*;

public class Exercicio2While_Do_For_Reverse {
    public static void main(String[] args) {
        int i = 10;

        while (i > -1) {
            JOptionPane.showMessageDialog(null, "i = " + i);
            i--;
        }


        int j = 10;
        do {
            JOptionPane.showMessageDialog(null, "j = " + j);
            j--;

        }
        while (j > 0);
        JOptionPane.showMessageDialog(null,"j = " + j);
        j++;


        for (int k = 10; k > -1; k--) {
            JOptionPane.showMessageDialog(null,"k = " + k);

        }
    }
}
