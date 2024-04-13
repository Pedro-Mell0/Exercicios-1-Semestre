import javax.swing.JOptionPane;

public class JokenPô {
    public static void main(String[] args) {

        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        int usuario = JOptionPane.showOptionDialog(null, "Escolha", "JokenPô",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        int numeroAleatorio = (int) (Math.random() * 3); // Gera um número entre 0 e 2

        switch (numeroAleatorio) {

            case 0:
                JOptionPane.showMessageDialog(null, "O sistema selecionou: Pedra");
                break;

            case 1:
                JOptionPane.showMessageDialog(null, "O sistema selecionou: Papel");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "O sistema selecionou: Tesoura");
                break;
        }

        if (usuario == numeroAleatorio) {
            JOptionPane.showMessageDialog(null, "Empate");

        } else if (usuario == 0 && numeroAleatorio == 1) {
            JOptionPane.showMessageDialog(null, "Papel embrulha pedra\nVocê perdeu!");

        } else if (usuario == 0 && numeroAleatorio == 2) {
            JOptionPane.showMessageDialog(null, "Pedra quebra tesoura\nVocê ganhou!");

        } else if (usuario == 1 && numeroAleatorio == 0) {
            JOptionPane.showMessageDialog(null, "Papel embrulha pedra\nVocê ganhou!");

        } else if (usuario == 1 && numeroAleatorio == 2) {
            JOptionPane.showMessageDialog(null, "Tesoura corta papel\nVocê perdeu!");

        } else if (usuario == 2 && numeroAleatorio == 0) {
            JOptionPane.showMessageDialog(null, "Pedra quebra tesoura\nVocê perdeu!");

        } else if (usuario == 2 && numeroAleatorio == 1) {
            JOptionPane.showMessageDialog(null, "Tesoura corta papel\nVocê ganhou!");
        }









    }
}
