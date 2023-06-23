public class Animal implements interfaceSerVivo {


    @Override
    public void move() {

    }

    @Override
    public void eat(int mass) {

    }

    @Override
    public void info() {
        System.out.printf("Vivo:%s%n", this.vivo  ? "Sim":"Não");
    }
    public Animal(){}

}
