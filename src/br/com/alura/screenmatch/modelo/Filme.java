public class Filme {
    //Variaveis
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacaos;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    //geters
    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    int

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacaos += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacaos / totalDeAvaliacoes;
    }
}
