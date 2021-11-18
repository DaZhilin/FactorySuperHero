public class Application {

    public static void main(String[] args) {
        Factory factory = new Factory();

        Batman batman = factory.createBatman();
        Hulk hulk = factory.createHulk();
        Spiderman spiderman = factory.createSpiderMan();
        Superman superman = factory.createSuoerMan();
        Wolverine wolverine = factory.createWolverine();
        Aquaman aquaman = factory.createAquaman();

        Arena arena = new Arena();
        arena.fight(aquaman, spiderman);
        arena.fight(batman, hulk);
        arena.fight(superman, wolverine);
        arena.fight(wolverine, superman);


    }
}
