import javax.swing.JOptionPane;
public class Exercicio5_Idade {
    public static void main (String[]args){

        int Pessoas = 10;
        int MaioresDeIdade = 0;
        int idade;


        for (int i =0; i < 10; i++){
            idade = Integer.parseInt(JOptionPane.showInputDialog("Pessoa " + (i + 1) + " Digite a sua idade: "));

            if(idade > 17 ){
                MaioresDeIdade++;
            }

        }

        JOptionPane.showMessageDialog(null, "Das 10 pessoas " + MaioresDeIdade + " são maiores de idade.");
    }
}

