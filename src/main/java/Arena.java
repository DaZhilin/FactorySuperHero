import java.util.Random;

public class Arena {

    private final int RANGE = 100;
    private final int BORDOR = 50;
    private final Random RANDOM = new Random();

    public void fight (SuperHero superHero1, SuperHero superHero2) {
        System.out.println("На арену выходят " + superHero1 + " и " + superHero2);
        superHero1.useSuperPower();
        superHero2.useSuperPower();
        if ((RANDOM.nextInt(RANGE)) > BORDOR) {
            System.out.println("В этой дуэли побеждает: " + superHero1);
        }
        else {
            System.out.println("В этой дуэли побеждает: " + superHero2);
        }
        System.out.println("К дуэли готовятся следующие участники.\n");
    }
}
