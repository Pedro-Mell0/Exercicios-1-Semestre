import javax.swing.JOptionPane;
                                                                    //INÍCIO
public class Aluno {

    private String nome;
    private String turma;
    private double notaFinal;



                                                            // INÍCIO GETTES E SETTERS
    public String getNome() {
        return nome;
    }


    public String getTurma() {
        return turma;
    }


    public double getNotaFinal() {
        return notaFinal;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setTurma(String turma) {
        this.turma = turma;
    }


    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }




                                                             // FIM GETTERS E SETTERS

                                                                 // INÍCIO MÉTODOS

    public Aluno(String nome, String turma) { // Construtor
        this.nome = nome;
        this.turma = turma;
    }



    public void calcularNotaFinal(int NumeroDeAvaliacoes) {
        double SomarNotas = 0;

        for (int i = 1; i <= NumeroDeAvaliacoes; i++) {
            String nota = JOptionPane.showInputDialog(null, "Digite a nota da avaliação " + i + ":");
            double notas = Double.parseDouble(nota);
            SomarNotas += notas;
        }
                                                                  // FIM MÉTODOS


        this.notaFinal = SomarNotas / NumeroDeAvaliacoes;




    }
}                                                                        //FIM

