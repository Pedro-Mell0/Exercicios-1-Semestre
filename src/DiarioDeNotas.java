
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JList;
import java.util.Arrays;

public class DiarioDeNotas {


        public void main(String[] args) {
            Aluno aluno = new Aluno();
            Professor professor = new Professor();


            int A1;
            int A2;
            int A3;
            String[] opcoes = {"Aluno", "Professor"};


            int usuario = JOptionPane.showOptionDialog(null, "Você é um aluno ou um professor?:", "Escolha",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            switch (usuario) {

                case 0:
                    aluno.IdentificarAluno();
                    aluno.alterarNome();
                    aluno.alterarIdade();
                    aluno.alterarRA();
                    aluno.alterarEmail();
                    break;

                case 1:

                    professor.IdentificarProfessor();
                    professor.alterarNome();
                    professor.alterarEmail();
                    professor.alterarIdade();

                    JOptionPane.showMessageDialog(null, "Digite as notas das avaliações.");


                    A1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da A1:"));
                    A2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da A2:"));
                    A3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da A3:"));
                    int soma = A1 + A2 + A3;
                    int media = soma / 3;
                    JOptionPane.showMessageDialog(null, "A soma das notas é: " + soma + "\n " + "A média do aluno é: " + media);
                    break;

            }







        }
    }

