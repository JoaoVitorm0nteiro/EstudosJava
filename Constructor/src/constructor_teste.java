public class constructor_teste {
    private String nome;
    private int idade;
    public constructor_teste(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void falarsobre () {
        System.out.println("Meu nome é: " + getNome() + " e eu tenho " + getIdade() + " anos.");
    }
}
