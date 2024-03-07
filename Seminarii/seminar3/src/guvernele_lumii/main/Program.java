package guvernele_lumii.main;

import guvernele_lumii.model.Guvern;
import guvernele_lumii.model.GuvernRegistry;

public class Program {
    public static void main(String[] args) {
        GuvernRegistry guvernReg = GuvernRegistry.getInstance();
        guvernReg.adaugaGuvern("Romania", "Popescu Ion", 20);
        guvernReg.adaugaGuvern("Romania", "Marcel Ion", 10);
        guvernReg.adaugaGuvern("Ungaria", "Szabo", 40);

        guvernReg.getGuvern("Romania").setNumePrimMinistru("Bogdan");

        System.out.println(guvernReg.getGuvern("Romania"));
        System.out.println(guvernReg.getGuvern("Ungaria"));

    }
}
