public class Main {
    public static void main(String[] args) {
        Pessoa [] p = new Pessoa[2];
        Livro [] l  = new Livro[3];
        p[0] = new Pessoa ("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25,"F");

        l[0] = new Livro("Aprendendo Java","Joseph Pussy", 200, p[0]);
        l[1] = new Livro("POO para iniciantes", "Gramsci", 500, p[1]);
        l[2] = new Livro("A conqusita do pão", "Kropotkin", 250, p[0]);

        System.out.println("Detalhes do livro: \n" + l[0].detalhes());
    }
}