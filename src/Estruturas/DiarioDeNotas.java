package Estruturas;

import javax.swing.JOptionPane;

public class DiarioDeNotas {
    public static void main(String[] args) {
        int usuario;
        int A1;
        int A2;
        int A3;


        usuario = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para aluno e 2 para professor: "));

        if (usuario == 1) {
            JOptionPane.showMessageDialog(null, "Bem-vindo aluno!");
        } else if (usuario == 2) {

            JOptionPane.showMessageDialog(null, "Bem-vindo professor!");
            A1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da A1:"));
            A2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da A2:"));
            A3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da A3:"));
            int soma = A1 + A2 + A3;
            int media = soma/3;
            JOptionPane.showMessageDialog(null,"A soma das notas é: " + soma + " e a média do aluno é: " + media);


        } else
            JOptionPane.showMessageDialog(null, "Digite novamente");





        }
    }