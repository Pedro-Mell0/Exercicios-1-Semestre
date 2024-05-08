import javax.swing.JOptionPane;

public class TesteAluno {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ");

        String turma = JOptionPane.showInputDialog(null, "Digite a turma do aluno: ");



        Aluno aluno = new Aluno(nome, turma);


        aluno.calcularNotaFinal(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de avaliações: ")));



        JOptionPane.showMessageDialog(null, "Nome do aluno: " + aluno.getNome() + "\n" + "Turma do aluno: " + aluno.getTurma() + "\n" + "Média do aluno: " + aluno.getNotaFinal());
    }
}

