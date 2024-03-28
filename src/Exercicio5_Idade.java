import javax.swing.*;
public class Exercicio5_Idade {
    public static void main (String[] args) {


        int idade;
        int cont = 0;
        for(int i = 0; i < 11;){

            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));}

        if (idade > 17){
            cont++;
        }
        JOptionPane.showInputDialog("A quantidade de maiores de idade é: " + cont);



    }
}



