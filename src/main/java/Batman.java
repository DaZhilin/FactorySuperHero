import lombok.Data;
@Data

public class Batman extends SuperHero {

    @Override
    public void useSuperPower() {
        super.useSuperPower();
        System.out.println("Batman использует ужасный крик - Ааа, я бэтмэн!");
    }
}