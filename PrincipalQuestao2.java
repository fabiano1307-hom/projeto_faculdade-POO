public class PrincipalQuestao2 {
    public static void main(String[] args) {
        System.out.println("=== APLICATIVO DE SAÚDE ===\n");
        AtividadeFisica atividade = new AtividadeFisica(30, 2);
        System.out.println("Atividade Física Simples:");
        atividade.exibir();
        System.out.println("\n" + "=".repeat(40) + "\n");
        Corrida corrida = new Corrida(30, 2, 5);
        System.out.println("Atividade Física - Corrida:");
        corrida.exibir();
        System.out.println("\n" + "=".repeat(40) + "\n");
        double caloriasAtividade = atividade.calcularCalorias();
        double caloriasCorrida = corrida.calcularCalorias();
        System.out.println("COMPARAÇÃO DE CALORIAS:");
        System.out.println("Atividade Simples: " + caloriasAtividade + " calorias");
        System.out.println("Corrida: " + caloriasCorrida + " calorias");
        System.out.println("Diferença: " + (caloriasCorrida - caloriasAtividade) + " calorias a mais na corrida");
    }
}