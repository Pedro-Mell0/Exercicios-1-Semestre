import javax.swing.*;

public class Professor {
    public String nome;
    public int idade;
    public String email;

    public void IdentificarProfessor() {
        JOptionPane.showMessageDialog(null, "Insira seus dados: ");

    }

    public void alterarNome() {
        nome = JOptionPane.showInputDialog("Digite o seu nome:");
    }


    public void alterarIdade() {
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
    }

    public void alterarEmail() {
        email = JOptionPane.showInputDialog("Digite seu email:");
    }


    public void ExibirDadosProfessor() {
        JOptionPane.showMessageDialog(null, "O nome do professor é: " + nome);
        JOptionPane.showMessageDialog(null, "A idade do professor é: " + idade);
        JOptionPane.showMessageDialog(null, "O email do professor é: " + email);
    }

    public void ConfirmarDadosProfessor() {
        JOptionPane.showMessageDialog(null, "Por favor, confirme os dados: ");
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Email: " + email);
    }


}


