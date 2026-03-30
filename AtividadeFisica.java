public class AtividadeFisica {
    protected int duracaoMinutos;
    protected int intensidade;
    public AtividadeFisica(int duracaoMinutos, int intensidade) {
        this.duracaoMinutos = duracaoMinutos;
        this.intensidade = intensidade;
    }
    public double calcularCalorias() {
        return duracaoMinutos * intensidade * 5;
    }
    public void exibir() {
        System.out.println("Duração: " + duracaoMinutos + " minutos");
        System.out.println("Intensidade: " + intensidade);
        System.out.println("Calorias queimadas: " + calcularCalorias());
    }
}