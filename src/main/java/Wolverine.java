import lombok.Data;

@Data
public class Wolverine extends SuperHero {

    @Override
    public void useSuperPower() {
        super.useSuperPower();
        System.out.println("Wolverine достал когти");
    }
}
