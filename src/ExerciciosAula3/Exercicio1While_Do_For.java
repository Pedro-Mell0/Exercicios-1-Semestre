package ExerciciosAula3;

import javax.swing.*;

public class Exercicio1While_Do_For {
    public static void main(String[] args) {
        int i = 1;

        while (i < 11) {
            JOptionPane.showMessageDialog(null, "i = " + i);
            i++;
        }


        int j = 1;
        do {
            JOptionPane.showMessageDialog(null, "j = " + j);
            j++;

        }
        while (j < 10);
        JOptionPane.showMessageDialog(null, "j = " + j);
        j++;


        for (int k = 0; k < 11; k++) {
            JOptionPane.showMessageDialog(null,"k = " + k);

        }


    }

}


