import lombok.Data;

/**
 * Класс, шаблон для создания супер героя
 */
@Data
public class SuperHero {
    /**
     * Имя нашего героя
     */
    private String name;
    /**
     * Сила нашего героя
     */
    private int strength;
    /**
     * Принадлежность к лейблу
     */
    private String label;
    /**
     * Суперспособность героя
     */
    private String superPower;

    protected void useSuperPower() {
    }
}

