public class Transacao {
    private String idTransacao;
    private double valor;
    private String status;

    public Transacao(String idTransacao, double valor) {
        this.idTransacao = idTransacao;
        if (valor <= 0) {
            this.valor = 0;
            System.out.println("ERRO: Valor inválido. Defina como 0.");
        } else {
            this.valor = valor;
        }
        this.status = "Pendente";
    }

    public void processarPagamento(double limiteDisponivel) {
        if (valor <= limiteDisponivel && valor > 0) {
            status = "Aprovada";
            System.out.println("Transação aprovada! ID: " + idTransacao);
        } else {
            status = "Recusada";
            System.out.println("Transação recusada! ID: " + idTransacao);
        }
    }

    public void exibir() {
        System.out.println("ID: " + idTransacao);
        System.out.println("Valor: R$ " + String.format("%.2f", valor));
        System.out.println("Status: " + status);
    }

    public String getIdTransacao() {
        return idTransacao;
    }

    public double getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }
}