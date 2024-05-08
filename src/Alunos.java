import javax.swing.*;

public class Alunos extends usuario{  // INÍCIO

    private int RA;

                                                // GETTERS E SETTERS

    public int getRA() {
        return RA;
    }

    public void setRA() {
        this.RA = Integer.parseInt(JOptionPane.showInputDialog("Digite seu RA:"));
    }


                                              // FIM GETTERS E SETTERS


                                                 // INÍCIO MÉTODOS



    @Override
    public void ConfirmarDados() {
        JOptionPane.showMessageDialog(null, "Por favor, confirme os dados: ");
        JOptionPane.showMessageDialog(null, "Nome: " + getNome() + "\n" + "Idade: " + getIdade() + "\n" + "Email: " + getEmail() + "\n" + "RA: " + RA + "\n" + "Telefone: " + getTelefone());
    }

    @Override
    public void IdentificarUsuario() {
        super.IdentificarUsuario();
        setRA();
    }

    public void MediaNotas() {
        int soma = super.notaAleatoria + super.notaAleatoria + super.notaAleatoria;
        int media = soma / 3;
        JOptionPane.showMessageDialog(null, "A soma das notas é: " + soma + "\n" + "A média das notas é: " + media);
    }

    // FIM MÉTODOS

} // FIM





