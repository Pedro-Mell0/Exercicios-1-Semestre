import javax.swing.*;

public class Aluno {

    public String nome;
    public int idade;
    public String RA;
    public String email;


    public void IdentificarAluno() {
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

    public void alterarRA() {
        RA = JOptionPane.showInputDialog("Digite seu RA");
    }

    public void ExibirDadosAluno() {
        JOptionPane.showMessageDialog(null, "O nome do aluno é: " + nome);
        JOptionPane.showMessageDialog(null, "A idade do aluno é: " + idade);
        JOptionPane.showMessageDialog(null, "O email do aluno é: " + email);
        JOptionPane.showMessageDialog(null, "O RA do aluno é: " + RA);
    }


    public void ConfirmarDadosAluno() {
        JOptionPane.showMessageDialog(null, "Por favor, confirme os dados: ");
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Email: " + email + "\n" + "RA: " + RA);
    }


}




