public class PrincipalQuestao4 {
    public static void main(String[] args) {
        System.out.println("=== GESTÃO DE PROJETOS ===\n");
        Tarefa tarefa1 = new Tarefa("Desenvolver módulo de autenticação", 20);
        System.out.println("Tarefa Normal:");
        tarefa1.exibirResumo();
        System.out.println("\n" + "=".repeat(40) + "\n");

        TarefaUrgente tarefaUrgente = new TarefaUrgente("Corrigir bug crítico em produção", 8, 2);
        System.out.println("Tarefa Urgente:");
        tarefaUrgente.exibirResumo();
        System.out.println("\n" + "=".repeat(40) + "\n");

        TarefaUrgente tarefaUrgente2 = new TarefaUrgente("Implementar nova funcionalidade de pagamento", 40, 5);
        System.out.println("Tarefa Urgente 2:");
        tarefaUrgente2.exibirResumo();
    }
}