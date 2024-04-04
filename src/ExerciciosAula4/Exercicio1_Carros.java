package ExerciciosAula4;

import javax.swing.JOptionPane;
public class Exercicio1_Carros {
    private String modelo;
    private String ano;

    public Exercicio1_Carros(String modelo, String ano) { // classe
        this.modelo = modelo; //Atributo 1
        this.ano = ano;// Atributo 2
    }

    public String getModelo() { //Metodo get para atributo 1
        return modelo;

    }

    public void setModelo(String modelo) { //Metodo set para atributo 1
        this.modelo = modelo;

    }


    public String getAno() {// Metodo get para atributo 2
        return ano;

    }


    public void setAno(String ano) { //Metodo set para atributo 2
        this.ano = ano;
    }

    public void velocidade() { //Metodo para exibir a velocidade do carro

        int numeroAleatorio = (int) (Math.random() * 199) + 2;
        JOptionPane.showMessageDialog(null, "O carro está a " + numeroAleatorio + "Km/h");
    }

    public void exibirInformacoes() { //Metodo para exibir o modelo e o ano do carro
        JOptionPane.showMessageDialog(null, "Modelo: " + modelo);
        JOptionPane.showMessageDialog(null, "Ano: " + ano);

    }

    public static void main (String []args){
        Exercicio1_Carros meuCarro = new Exercicio1_Carros("Tiggo 7 Sport", "2025");

        meuCarro.exibirInformacoes(); //Chama o metodo com o modelo e o ano do carro
        meuCarro.velocidade(); //Chama o metodo velocidade


        meuCarro.setModelo(null); //Atualizar modelo
        meuCarro.setAno(null); //Atualizar ano

        // remover barras abaixo para mostrar informações atualizadas
        // meuCarro.exibirInformacoes();















    }
}
