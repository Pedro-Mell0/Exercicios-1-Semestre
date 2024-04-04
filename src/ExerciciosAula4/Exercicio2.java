package ExerciciosAula4;

import javax.swing.JOptionPane;

public class Exercicio2 {
    private String marca;
    private String modelo;
    private String ano;
    private String cor;

    public Exercicio2(String marca, String modelo, String ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String Marca) {
        this.marca = Marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void velocidade() {

        int numeroAleatorio = (int) (Math.random() * 199) + 2;
        JOptionPane.showMessageDialog(null, "O carro está a " + numeroAleatorio + "Km/h");

    }

    public void RPM() {

        int numeroAleatorio2 = (int) (Math.random() * 199) + 2;
        JOptionPane.showMessageDialog(null, "Faltam " + numeroAleatorio2 + "Km para chegar no destino");
    }


    public void exibirInformacoes() { //Metodo para exibir o modelo e o ano do carro
        JOptionPane.showMessageDialog(null, "Marca do 1º veículo: " + marca);
        JOptionPane.showMessageDialog(null, "Modelo do 1º veículo: " + modelo);
        JOptionPane.showMessageDialog(null, "Ano do 1º veículo: " + ano);
        JOptionPane.showMessageDialog(null, "Cor do 1º veículo: " + cor);
    }
    public void exibirInformacoes2() { //Metodo para exibir o modelo e o ano do carro
        JOptionPane.showMessageDialog(null, "Marca do 2º veículo: " + marca);
        JOptionPane.showMessageDialog(null, "Modelo do 2º veículo: " + modelo);
        JOptionPane.showMessageDialog(null, "Ano do 2º veículo: " + ano);
        JOptionPane.showMessageDialog(null, "Cor do 2º veículo: " + cor);
    }


        public static void main (String[]args){
            Exercicio2 meuCarro1 = new Exercicio2("Caoa Cherry", "Tiggo 7 sport", "2025", "Cinza");
            Exercicio2 meuCarro2 = new Exercicio2("Jeep", "Jeep Compass", "2024", "Cinza");
            meuCarro1.exibirInformacoes();
            meuCarro1.velocidade();
            meuCarro1.RPM();
            meuCarro2.exibirInformacoes2();
            meuCarro2.velocidade();
            meuCarro2.RPM();



            meuCarro1.setMarca(null);
            meuCarro1.setModelo(null);
            meuCarro1.setAno(null);
            meuCarro1.setCor(null);

            meuCarro2.setMarca(null);
            meuCarro2.setModelo(null);
            meuCarro2.setAno(null);
            meuCarro2.setCor(null);



            // remover barras abaixo para mostrar informações atualizadas
            // meuCarro.exibirInformacoes();










        }
}





