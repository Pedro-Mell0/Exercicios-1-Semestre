import javax.swing.*;

public class Aluno extends usuario{  // INÍCIO

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
    public void IdentificarUsuario() {
        setEmail();
        setIdade();
        setRA();
        setTelefone();
    }


    @Override
    public void ConfirmarDados() {
        JOptionPane.showMessageDialog(null, "Por favor, confirme os dados: ");
        JOptionPane.showMessageDialog(null, "Nome: " + getNome() + "\n" + "Idade: " + getIdade() + "\n" + "Email: " + getEmail() + "\n" + "RA: " + RA + "\n" + "Telefone: " + getTelefone());
    }

                                                 // FIM MÉTODOS

} // FIM





