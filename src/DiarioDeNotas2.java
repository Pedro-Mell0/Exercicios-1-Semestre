import javax.swing.JOptionPane;
public class DiarioDeNotas2 {
    public static void main (String[]args){
        int aluno;

        aluno = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para aluno e 2 para professor: "));

        if (aluno == 1) {
            JOptionPane.showInputDialog("Bem-vindo aluno!");
        } else if (aluno == 2) {
            JOptionPane.showInputDialog("Bem-vindo professor!");
        } else
            JOptionPane.showInputDialog("Digite novamente");
    }
}
