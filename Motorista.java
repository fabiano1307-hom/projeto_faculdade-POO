public class Motorista {
    private String nome;
    private double notaAvaliacao;
    private double taxaBase;

    public Motorista(String nome, double notaAvaliacao, double taxaBase) {
        this.nome = nome;
        this.notaAvaliacao = notaAvaliacao;
        this.taxaBase = taxaBase;
    }

    public double calcularValorCorrida(double distancia, double percentualDica) {
        double valorCorrida = taxaBase + (taxaBase * (notaAvaliacao / 10));
        double valorTotal = valorCorrida * distancia;
        double valorComDica = valorTotal + (valorTotal * (percentualDica / 100));
        return valorComDica;
    }
}