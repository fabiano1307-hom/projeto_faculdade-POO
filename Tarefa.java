public class Tarefa {
    protected String descricao;
    protected int horasEstimadas;

    public Tarefa(String descricao, int horasEstimadas) {
        this.descricao = descricao;
        this.horasEstimadas = horasEstimadas;
    }

    public void exibirResumo() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Horas Estimadas: " + horasEstimadas + " horas");
    }

    public String getDescricao() {
        return descricao;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }
}