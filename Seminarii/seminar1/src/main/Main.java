package main;


import model.animal.Leu;
import model.animal.Maimuta;
import model.animal.Zebra;
import model.animal.Zookeeper;
import model.zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo=new Zoo("Zoo Bucuresti",new Zookeeper("Dorel"),null);
        Leu leu=new Leu("Alex",4,4);
        zoo.adaugaAnimal(leu,"carne de vita");
        zoo.adaugaAnimal(new Zebra("Marty",5,4),"iarba verde");
        zoo.adaugaAnimal(new Maimuta("Julian",3,4),"banane");
        zoo.hranesteToateAnimalele();
        TipuriAnimale tip=TipuriAnimale.LEU;
    }

    public enum TipuriAnimale{
        LEU,
        MAIMUTA,
        ZEBRA
    }
}