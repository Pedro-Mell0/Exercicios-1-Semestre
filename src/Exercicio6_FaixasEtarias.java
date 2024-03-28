import javax.swing.JOptionPane;
public class Exercicio6_FaixasEtarias {
    public static void main (String[]args){

        int Pessoas = 10;
        int Ate15Anos = 0;
        int De16_A_30Anos = 0;
        int De31_A_45Anos = 0;
        int MaiorDe45 = 0;



        int idade;


        for (int i =0; i < 10; i++){
            idade = Integer.parseInt(JOptionPane.showInputDialog("Pessoa " + (i + 1) + " Digite a sua idade: "));

            if(idade < 16 ){
                Ate15Anos++;
            }else if(idade > 15 && idade < 31){
                De16_A_30Anos++;
            }else if(idade > 30 && idade < 46){
                De31_A_45Anos++;
            }else{
                MaiorDe45++;
            }

        }

        JOptionPane.showMessageDialog(null, "Das 10 pessoas: " + Ate15Anos + " Tem até 15 anos, " + De16_A_30Anos + " tem entre 16 e 30 anos, " + De31_A_45Anos + " tem entre 30 e 45 anos, e " + MaiorDe45 + " tem mais de 45 anos");





    }
}
