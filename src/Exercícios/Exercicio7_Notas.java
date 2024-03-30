package Exercícios;

import javax.swing.JOptionPane;
public class Exercicio7_Notas {
    public static void main (String[] args){

        int Alunos = 10;
        double MaiorNota = Double.MIN_VALUE;
        double MenorNota = Double.MAX_VALUE;
        double soma = 0;

        double Notas;


        for (int i =0; i < 10; i++){
            String input = (JOptionPane.showInputDialog("Digite a nota do " + (i + 1) + " aluno: "));
            double nota = Double.parseDouble(input);

            soma += nota;


            if(nota > MaiorNota ){
                MaiorNota = nota;
            }else if(nota < MenorNota){
                MenorNota = nota;
            }

        }

        double MediaNotas = soma / Alunos;

        JOptionPane.showMessageDialog(null, "A maior nota da sala foi: " + MaiorNota + " A menor nota da sala foi: " + MenorNota + " A média das notas da sala foi: " + MediaNotas);








    }
}
