public class Factory {

    public Batman createBatman() {
        Batman batman = new Batman();
        batman.setName("Batman");
        batman.setStrength(7);
        batman.setLabel("DC");
        batman.setSuperPower("ужасный крик - Ааа, я бэтмэн!");

        return batman;
    }

    public Aquaman createAquaman() {
        Aquaman aquaman = new Aquaman();
        aquaman.setName("AquaMan");
        aquaman.setStrength(5);
        aquaman.setLabel("DC");
        aquaman.setSuperPower("трезубец");

        return aquaman;
    }

    public Hulk createHulk() {
        Hulk hulk = new Hulk();
        hulk.setName("Hulk");
        hulk.setStrength(10);
        hulk.setLabel("Marvel");
        hulk.setSuperPower("прыжок");

        return hulk;
    }

    public Spiderman createSpiderMan() {
        Spiderman spiderMan = new Spiderman();
        spiderMan.setName("SpiderMan");
        spiderMan.setStrength(7);
        spiderMan.setLabel("Marvel");
        spiderMan.setSuperPower("паутину");

        return spiderMan;
    }

    public Superman createSuoerMan() {
        Superman superMan = new Superman();
        superMan.setName("Superman");
        superMan.setStrength(10);
        superMan.setLabel("DC");
        superMan.setSuperPower("сверхскорость");

        return superMan;
    }

    public Wolverine createWolverine() {
        Wolverine wolverine = new Wolverine();
        wolverine.setName("Wolverine");
        wolverine.setStrength(8);
        wolverine.setLabel("Marvel");
        wolverine.setSuperPower("когти");

        return wolverine;
    }
}
