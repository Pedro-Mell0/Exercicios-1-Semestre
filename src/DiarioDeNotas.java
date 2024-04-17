import javax.swing.JOptionPane;

public class DiarioDeNotas {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        String[] opcoes = {"Aluno", "Professor"};

        int usuario = JOptionPane.showOptionDialog(null, "Você é um aluno ou um professor?", "Escolha",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        switch (usuario) {

            case 0:
                aluno.IdentificarAluno();
                aluno.setNome();
                JOptionPane.showMessageDialog(null, "Bem-vindo " + aluno.getNome());
                aluno.setIdade();
                aluno.setRA();
                aluno.setEmail();
                aluno.setTelefone();
                aluno.ConfirmarDadosAluno();
                break;

            case 1:
                professor.IdentificarProfessor();
                professor.setNome();
                JOptionPane.showMessageDialog(null, "Bem-vindo " + professor.getNome());
                professor.setEmail();
                professor.setIdade();
                professor.ConfirmarDadosProfessor();
                professor.Notas();
                break;
        }
    }
}
