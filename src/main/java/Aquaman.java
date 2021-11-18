import lombok.Data;

@Data
public class Aquaman extends SuperHero {

    @Override
    public void useSuperPower() {
        super.useSuperPower();
        System.out.println("Aquaman использует удар трезубцем");
    }
}
