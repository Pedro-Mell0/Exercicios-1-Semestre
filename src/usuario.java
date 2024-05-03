import javax.swing.JOptionPane;

public class usuario { // INÍCIO

    // Atributos
    private String nome;
    private int idade;
    private String email;
    private int telefone;
    private int A1;
    private int A2;
    private int A3;
    int notaAleatoria = (int) (Math.random() * 10);

    // GETTERS E SETTERS

    public int getA1() {
        return A1;
    }

    public int getA2() {
        return A2;
    }

    public int getA3() {
        return A3;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public void setTelefone() {
        telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu telefone:"));
    }

    public void setNome() {
        nome = JOptionPane.showInputDialog("Digite o seu nome:");
    }

    public void setIdade() {
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
    }

    public void setEmail() {
        email = JOptionPane.showInputDialog("Digite seu email:");
    }

    public void setA1() {
        A1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da A1:"));
    }

    public void setA2() {
        A2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da A2:"));
    }

    public void setA3() {
        A3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da A3:"));
    }


    // FIM GETTERS E SETTERS



    // INÍCIO MÉTODOS


    public void IdentificarUsuario() {
        setEmail();
        setIdade();
        setTelefone();
    }

    public void IserirDados() {
        JOptionPane.showMessageDialog(null, "Insira seus dados: ");
    }

    public void ConfirmarDados() {
        JOptionPane.showMessageDialog(null, "Por favor, confirme os dados: ");
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Email: " + email + "\n" + "Telefone: " + telefone);
    }

    public void ExibirDados() {
        JOptionPane.showMessageDialog(null, "O nome do usuário é: " + nome);
        JOptionPane.showMessageDialog(null, "A idade do usuário é: " + idade);
        JOptionPane.showMessageDialog(null, "O email do usuário é: " + email);
    }

    public void AtribuirNotas() {
        JOptionPane.showMessageDialog(null, "Digite as notas das avaliações.");


        A1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da A1:"));
        A2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da A2:"));
        A3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da A3:"));
    }

    public void MediaNotas() {
        int soma = A1 + A2 + A3;
        int media = soma / 3;
        JOptionPane.showMessageDialog(null, "A soma das notas é: " + soma + "\n" + "A média das notas é: " + media);
    }

    public void VerificarNotas() {
        String[] opcoes = {"A1", "A2", "A3"};

        int usuario = JOptionPane.showOptionDialog(null, "Qual nota deseja visualizar?", "Escolha",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        switch (usuario) {

            case 0:
                JOptionPane.showMessageDialog(null, "A nota da A1 é: " + notaAleatoria);
                break;

            case 1:
                JOptionPane.showMessageDialog(null, "A nota da A2 é: " + notaAleatoria);
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "A nota da A3 é: " + notaAleatoria);
                break;
        }


        // FIM MÉTODOS


    }






}  // Fim
