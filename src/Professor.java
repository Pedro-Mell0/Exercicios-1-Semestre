import javax.swing.*;

public class Professor extends usuario { // INÍCIO

    private int A1;
    private int A2;
    private int A3;

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

    public void Notas() {
        JOptionPane.showMessageDialog(null, "Digite as notas das avaliações.");


        A1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da A1:"));
        A2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da A2:"));
        A3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da A3:"));
        int soma = A1 + A2 + A3;
        int media = soma / 3;
        JOptionPane.showMessageDialog(null, "A soma das notas é: " + soma + "\n " + "A média das notas é: " + media);

    }

                                      // FIM MÉTODOS





} // FIM


