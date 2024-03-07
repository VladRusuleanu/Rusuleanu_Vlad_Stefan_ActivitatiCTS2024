package singleton.main;

import singleton.model.Guvern;

public class Main {
    public static void main(String[] args) {

        Guvern guv=Guvern.getInstance(4, "Marcel Ciolacu", 20);
        Guvern guv2=Guvern.getInstance(5, "Rusuleanu Vlad", 30);
        System.out.println(guv.toString()+'\n'+guv2.toString());
    }
}
