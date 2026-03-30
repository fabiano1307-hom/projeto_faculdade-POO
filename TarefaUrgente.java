public class TarefaUrgente extends Tarefa {
    private int prazoDias;

    public TarefaUrgente(String descricao, int horasEstimadas, int prazoDias) {
        super(descricao, horasEstimadas);
        this.prazoDias = prazoDias;
    }

    @Override
    public void exibirResumo() {
        super.exibirResumo();
        System.out.println("ALERTA!!! PRAZO: " + prazoDias + " DIAS");
    }

    public int getPrazoDias() {
        return prazoDias;
    }
}