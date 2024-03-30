package Estruturas;

import javax.swing.JOptionPane;
public class EstruturaIfJOption {
    public static void main (String[]args){
        int usuario;

        usuario = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para aluno e 2 para professor: "));

        if (usuario == 1) {
            JOptionPane.showInputDialog("Bem-vindo aluno!");
        } else if (usuario == 2) {
            JOptionPane.showInputDialog("Bem-vindo professor!");
        } else
            JOptionPane.showInputDialog("Digite novamente");
    }
}
