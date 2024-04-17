import javax.swing.*;

public class Aluno {

    private String nome;
    private int idade;
    private int RA;
    private String email;
    private String telefone;


    public void IdentificarAluno() {
        JOptionPane.showMessageDialog(null, "Insira seus dados: ");

    }

    //MÉTODOS ALTERAR

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
        RA = Integer.parseInt(JOptionPane.showInputDialog("Digite seu RA"));
    }

    public void alterarTelefone() {
        telefone = JOptionPane.showInputDialog("Digite seu telefone:");
    }
    // FIM METODOS ALTERAR

    // GETTERS E SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome() {
        nome = JOptionPane.showInputDialog("Digite o seu nome:");
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade() {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        this.idade = idade;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail() {
        email = JOptionPane.showInputDialog("Digite seu email:");
    }

    public int getRA() {
        return RA;
    }

    public void setRA() {
        this.RA = Integer.parseInt(JOptionPane.showInputDialog("Digite seu RA:"));
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone() {
        telefone = JOptionPane.showInputDialog("Digite seu telefone:");
    }

    // FIM GETTERS E SETTERS


    public void ExibirDadosAluno() {
        JOptionPane.showMessageDialog(null, "O nome do aluno é: " + nome);
        JOptionPane.showMessageDialog(null, "A idade do aluno é: " + idade);
        JOptionPane.showMessageDialog(null, "O email do aluno é: " + email);
        JOptionPane.showMessageDialog(null, "O RA do aluno é: " + RA);
        JOptionPane.showMessageDialog(null, "O Telefone do aluno é " + telefone);
    }


    public void ConfirmarDadosAluno() {
        JOptionPane.showMessageDialog(null, "Por favor, confirme os dados: ");
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Email: " + email + "\n" + "RA: " + RA + "\n" + "Telefone: " + telefone);
    }


}





