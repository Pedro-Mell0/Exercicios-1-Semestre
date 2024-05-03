package Estruturas;

import javax.swing.*;

public class EstruturaWhileDo {
    public static void main(String[] args) {
        int numero;


       numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor desejado: "));


        do {
            JOptionPane.showMessageDialog(null, numero);
            numero++;
        }
        while (numero <= 20);
        numero++;
        JOptionPane.showMessageDialog(null, numero);
    }
}
