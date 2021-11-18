import lombok.Data;

@Data
public class Spiderman extends SuperHero {

    @Override
    public void useSuperPower() {
        super.useSuperPower();
        System.out.println("Spiderman использует Паутину");
    }
}
