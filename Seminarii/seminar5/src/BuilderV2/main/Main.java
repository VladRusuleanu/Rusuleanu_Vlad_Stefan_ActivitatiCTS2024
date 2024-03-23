package BuilderV2.main;
import BuilderV2.model.AbstractBuilder;
import BuilderV2.model.Pacient;
public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder = new Pacient.PacientBuilder("Marcel");
        Pacient pacient = builder.adaugaMicDejun(true).adaugaPapuciCamera(true).build();
        System.out.println(pacient);
    }
}
