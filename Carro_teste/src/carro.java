public class carro {
    private String producer;
    private String model;
    private int year;
    private int topspeed = 200;
    private int actualspeed = 0;
    private boolean ignition = false;

    public carro(String producer, String model, int year){
        setProducer(producer);
        setModel(model);
        setYear(year);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getTopspeed() {
        return topspeed;
    }

    public void setTopspeed(int topspeed) {
        this.topspeed = topspeed;
    }

    public int getActualspeed() {
        return actualspeed;
    }

    public void setActualspeed(int actualspeed) {
        this.actualspeed = actualspeed;
    }

    public void start(){
        if(!ignition){
            ignition = !ignition;
        }
        System.out.println("Starting engine...");
        System.out.println("Ligado.");
    }

    public void acelerar(){
        if (ignition){
            setActualspeed(+5);
            System.out.println("Velocidade atual: " + getActualspeed() + " KM/H");
        }else{
            System.out.println("Carro desligado, de partida no carro primeiro.");
        }

    }

    public void about (){
        System.out.println("Producer: " + getProducer());
        System.out.println("Car model : " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Velocidade atual: " + getActualspeed());
    }
}
