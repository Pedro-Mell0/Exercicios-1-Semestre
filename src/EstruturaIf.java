//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EstruturaIf {
    public static void main(String[] args) {
        double numero = 90;

        if(numero <= 70){
            System.out.println("Aprovado com conceito C");
        }else if(numero <= 80){
            System.out.println("Aprovado com conceito B");
        }else if(numero <= 90){
            System.out.println("Aprovado com conceito A");
        }else{
            System.out.println("Reprovado");
        }
        }
    }