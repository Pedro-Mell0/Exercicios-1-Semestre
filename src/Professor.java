import javax.swing.*;

public class Professor { // INÍCIO


    private String nome;
    private int idade;
    private String email;
    private int A1;
    private int A2;
    private int A3;


    public void IdentificarProfessor() {
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
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        email = JOptionPane.showInputDialog("Digite seu email:");
    }

    public int getA1() {
        return A1;
    }

    public void setA1() {
        A1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da A1:"));
    }

    public int getA2() {
        return A2;
    }

    public void setA2() {
        A2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da A2:"));
    }

    public int getA3() {
        return A3;
    }

    public void setA3() {
        A3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da A3:"));
    }

    //  FIM GETTERS E SETTERS


    public void ExibirDadosProfessor() {
        JOptionPane.showMessageDialog(null, "O nome do professor é: " + nome);
        JOptionPane.showMessageDialog(null, "A idade do professor é: " + idade);
        JOptionPane.showMessageDialog(null, "O email do professor é: " + email);
    }


    public void ConfirmarDadosProfessor() {
        JOptionPane.showMessageDialog(null, "Por favor, confirme os dados: ");
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Email: " + email);
    }


    public void Notas() {
        JOptionPane.showMessageDialog(null, "Digite as notas das avaliações.");


        A1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da A1:"));
        A2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da A2:"));
        A3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da A3:"));
        int soma = A1 + A2 + A3;
        int media = soma / 3;
        JOptionPane.showMessageDialog(null, "A soma das notas é: " + soma + "\n " + "A média das notas é: " + media);

    }


} // FIM


