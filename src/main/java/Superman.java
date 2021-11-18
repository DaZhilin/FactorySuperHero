import lombok.Data;

@Data
public class Superman extends SuperHero {

    @Override
    public void useSuperPower() {
        super.useSuperPower();
        System.out.println("Superman использует свою суперскорость");
    }
}
