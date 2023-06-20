import java.util.Random;

public class Luta {


        //atributos
        private lutador desafiado ;
        private lutador desafiante;
        private int round;
        private boolean aprovada;
        //metodos
    public void marcarLuta(lutador l1, lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada= true;
            this.desafiado= l1;
            this.desafiante=l2;
        }else{
            this.aprovada=false;
            this.desafiado=null;
            this.desafiante=null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0://empate
                    System.out.println("Empatou !!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1: //desafiado vence
                    System.out.println("Vitoria do: " + this.desafiado.getNome());
                    this.desafiado.ganharLutas();
                    this.desafiante.perderLuta();
                    break;
                case 2: //desafiante vence
                    System.out.println("Vitoria do: " + this.desafiante.getNome());
                    this.desafiante.ganharLutas();
                    this.desafiado.perderLuta();
                    break;
            }

        }else{
            System.out.println("A luta não pode acontecer");
        }
    }

    public lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(lutador desafiado) {
        this.desafiado = desafiado;
    }

    public lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
