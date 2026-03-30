public class PrincipalQuestao3 {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE PAGAMENTOS ===\n");
        Transacao transacao1 = new Transacao("T001", 150.00);
        System.out.println("Transação 1 criada:");
        transacao1.exibir();
        System.out.println();
        System.out.println("Processando pagamento com limite de R$ 200.00:");
        transacao1.processarPagamento(200.00);
        transacao1.exibir();
        System.out.println("\n" + "=".repeat(40) + "\n");
        Transacao transacao2 = new Transacao("T002", 500.00);
        System.out.println("Transação 2 criada:");
        transacao2.exibir();
        System.out.println();
        System.out.println("Processando pagamento com limite de R$ 200.00:");
        transacao2.processarPagamento(200.00);
        transacao2.exibir();
        System.out.println("\n" + "=".repeat(40) + "\n");
        Transacao transacao3 = new Transacao("T003", -50.00);
        System.out.println("Transação 3 criada (com valor inválido):");
        transacao3.exibir();
    }
}