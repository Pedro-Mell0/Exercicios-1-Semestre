import javax.swing.*;

public class Aluno {

        public String nome;
        public int idade;
        public String RA;
        public String email;


        public void IdentificarAluno() {
            JOptionPane.showMessageDialog(null, "Bem-vindo aluno" + "\n" + "Insira seus dados: " );

        }

    public void alterarNome() {
        nome = JOptionPane.showInputDialog("Digite o seu nome:");
    }


    public void alterarIdade () {
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
    }

    public void alterarEmail() {
        email = JOptionPane.showInputDialog("Digite seu email:");
    }

    public void alterarRA(){
            RA = JOptionPane.showInputDialog("Digite seu RA");
    }
}

