public class Contribuinte {
    private String nome;
    private double rendaAnual;

    public Contribuinte(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public double calcularImposto() {
        if (rendaAnual <= 30000) {
            return 0;
        } else if (rendaAnual <= 80000) {
            return rendaAnual * 0.15;
        } else {
            return rendaAnual * 0.25;
        }
    }

    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Renda Anual: R$ " + String.format("%.2f", rendaAnual));
        System.out.println("Imposto a Pagar: R$ " + String.format("%.2f", calcularImposto()));
    }

    public String getNome() {
        return nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }
}