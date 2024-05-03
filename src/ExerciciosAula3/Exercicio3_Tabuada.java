package ExerciciosAula3;

import javax.swing.JOptionPane;

public class Exercicio3_Tabuada {
    public static void main(String[] args) {
        int i = 1;
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor desejado: "));

        while (i < 11) {
           JOptionPane.showMessageDialog(null,"tabuada do " + numero + " = " + numero * i);
            i++;
        }


    }
}
