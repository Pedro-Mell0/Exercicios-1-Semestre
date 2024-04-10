import javax.swing.*;

public class Professor {
        public String nome;
        public int idade;
        public String email;

        public void IdentificarProfessor() {
            JOptionPane.showMessageDialog(null, "Bem-vindo professor" + "\n" + "Insira seus dados: ");

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






    }


