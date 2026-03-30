public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; // Inicialmente, o livro está disponível
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false; // O livro não está mais disponível
            System.out.println("Livro emprestado: " + titulo);
        } else {
            System.out.println("Desculpe, o livro está indisponível.");
        }
    }

    public void devolver() {
        disponivel = true; // O livro volta a estar disponível
        System.out.println("Livro devolvido: " + titulo);
    }
}