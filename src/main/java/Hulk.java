import lombok.Data;

@Data
public class Hulk extends SuperHero {

    @Override
    public void useSuperPower() {
        super.useSuperPower();
        System.out.println("Hulk использует прыжок");
    }
}
