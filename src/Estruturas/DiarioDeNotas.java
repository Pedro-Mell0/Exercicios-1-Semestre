package Estruturas;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JList;
import java.util.Arrays;
public class DiarioDeNotas {
    public static void main(String[] args) {
        int A1;
        int A2;
        int A3;
        String[] opcoes = {"Aluno", "Professor"};


        int usuario = JOptionPane.showOptionDialog(null, "Você é um aluno ou um professor?:", "Escolha",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);


        if (usuario == 0) {
            JOptionPane.showMessageDialog(null, "Bem vindo Aluno");
            int nomeAluno =  Integer.parseInt(JOptionPane.showInputDialog("Digite seu nome"));  

        } else if (usuario == 1) {

            JOptionPane.showMessageDialog(null, "Bem-vindo professor!");
            JOptionPane.showMessageDialog(null,"Selecione seu nome: " );
            JList list = new JList(new String[] {"Danilo Miguel", "Tulio Vivaldini"});
            JOptionPane.showMessageDialog(
                    null, list, "Professor", JOptionPane.PLAIN_MESSAGE);
            System.out.println(Arrays.toString(list.getSelectedIndices()));
            A1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da A1:"));
            A2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da A2:"));
            A3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da A3:"));
            int soma = A1 + A2 + A3;
            int media = soma / 3;
            JOptionPane.showMessageDialog(null, "A soma das notas é: " + soma + "\n " + "A média do aluno é: " + media);


        }
    }
}