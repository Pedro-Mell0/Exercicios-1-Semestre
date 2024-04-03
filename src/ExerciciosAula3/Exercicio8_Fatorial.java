package ExerciciosAula3;

import javax.swing.JOptionPane;

public class Exercicio8_Fatorial {
    public static void main(String[] args) {


        int numero;
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para ser fatorado:"));


        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        JOptionPane.showMessageDialog(null, "O valor de: " + numero + " fatorado é: " + fatorial );
    }
}
