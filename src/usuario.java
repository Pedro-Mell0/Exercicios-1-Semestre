import javax.swing.JOptionPane;

public class usuario {


    private String nome;
    private int idade;
    private String email;
    private int telefone;




    public int getTelefone() {
        return telefone;
    }

    public void setTelefone() {
        telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu telefone:"));
    }


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


    public void IdentificarUsuario() {
        setEmail();
        setIdade();
        setNome();
    }

    public void IserirDados() {
        JOptionPane.showMessageDialog(null, "Insira seus dados: ");
    }

    public void ConfirmarDados() {
        JOptionPane.showMessageDialog(null, "Por favor, confirme os dados: ");
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Email: " + email);
    }

    public void ExibirDados() {
        JOptionPane.showMessageDialog(null, "O nome do usuário é: " + nome);
        JOptionPane.showMessageDialog(null, "A idade do usuário é: " + idade);
        JOptionPane.showMessageDialog(null, "O email do usuário é: " + email);
    }
}
