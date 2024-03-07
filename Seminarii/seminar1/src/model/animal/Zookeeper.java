package model.animal;

public class Zookeeper {
    private String nume;

    public Zookeeper(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void hranesteAnimal(Vietate vietate, String mancare){
        vietate.eat(mancare);
    }
}
