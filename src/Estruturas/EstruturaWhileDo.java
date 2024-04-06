package Estruturas;

public class EstruturaWhileDo {
    public static void main(String[] args) {
        int numero = 10;
        do {
            System.out.println(numero);
            numero++;
        }
        while (numero <= 20);
        numero++;
        System.out.println(numero);
    }
}
