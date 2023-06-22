public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    //getters e setters


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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //metodos especiais
    public void fazerAniversario(){
        this.idade++;
    }

    public Pessoa(String nome, int idade, String sexo){
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
    }

}
