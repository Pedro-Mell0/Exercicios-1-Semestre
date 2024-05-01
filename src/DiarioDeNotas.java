import javax.swing.JOptionPane;

public class DiarioDeNotas { // INÍCIO


                                                      // INÍCIO MAIN

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        String[] opcoes = {"Aluno", "Professor"};

        int user = JOptionPane.showOptionDialog(null, "Você é um aluno ou um professor?", "Escolha",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        switch (user) {

            case 0:
                aluno.IserirDados();
                aluno.setNome();
                JOptionPane.showMessageDialog(null, "Bem-vindo " + aluno.getNome());
                aluno.IdentificarUsuario();
                aluno.ConfirmarDados();
                aluno.VerificarNotas();
                aluno.MediaNotas();
                break;

            case 1:
                professor.IserirDados();
                professor.setNome();
                JOptionPane.showMessageDialog(null, "Bem-vindo " + professor.getNome());
                professor.IdentificarUsuario();
                professor.ConfirmarDados();
                professor.AtribuirNotas();
                professor.VerificarNotas();
                professor.MediaNotas();
                break;

        }

    }

                                                        // FIM MAIN





} // FIM
