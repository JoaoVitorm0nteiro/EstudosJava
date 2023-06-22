public class Livro implements Publicacao {
    private String Livro;
    private String Autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //getters e setters
    public String getLivro() {
        return Livro;
    }

    public void setLivro(String livro) {
        Livro = livro;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //metodos
    public String detalhes() {
        return "Livro{" +
                "Livro='" + Livro + '\'' +
                ", Autor='" + Autor + '\'' +
                ", totPaginas=" + totPaginas +
                ", pagAtual=" + pagAtual +
                ", aberto=" + aberto +
                ", leitor=" + leitor +
                '}';
    }

    //metodos OVERRIDE
    @Override
    public void Abrir() {
    this.aberto = true;
    }

    @Override
    public void Fechar() {
    this.aberto = false;
    }

    @Override
    public void Folhear(int p) {
        this.pagAtual = p;
    }

    @Override
    public void AvancarPag() {
    this.pagAtual++;
    }

    @Override
    public void Voltarpag() {
    this.pagAtual--;
    }

    //construtor
    public Livro(String livro, String autor, int totPaginas, Pessoa leitor) {
        Livro = livro;
        Autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }
}
