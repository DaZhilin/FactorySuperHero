public class Factory {

    public static void main(String[] args){
        SuperHero batman = new SuperHero();
        batman.setName("Batman");
        batman.setStrength(7);
        batman.setLabel("DC");
        batman.setSuperpower("ужасный крик - Ааа, я бэтмэн!");
        System.out.println("Вами создан: " + batman);

        SuperHero aquaman = new SuperHero();
        aquaman.setName("AquaMan");
        aquaman.setStrength(5);
        aquaman.setLabel("DC");
        aquaman.setSuperpower("Взмах трезубцем");

        System.out.println("Вами создан: " + aquaman);

        SuperHero hulk = new SuperHero();
        hulk.setName("Hulk");
        hulk.setStrength(10);
        hulk.setLabel("Marvel");
        hulk.setSuperpower("Халк крушить");

        System.out.println("Вами создан: " + hulk);

        SuperHero spiderMan = new SuperHero();
        spiderMan.setName("SpiderMan");
        spiderMan.setStrength(7);
        spiderMan.setLabel("Marvel");
        spiderMan.setSuperpower("Паутина");

        System.out.println("Вами создан: " + spiderMan);

        SuperHero superMan = new SuperHero();
        superMan.setName("Superman");
        superMan.setStrength(10);
        superMan.setLabel("DC");
        superMan.setSuperpower("Я с криптона");

        System.out.println("Вами создан: " + superMan);

        SuperHero wolverine = new SuperHero();
        wolverine.setName("Wolverine");
        wolverine.setStrength(8);
        wolverine.setLabel("Marvel");
        wolverine.setSuperpower("Когти");

        System.out.println("Вами создан: " + wolverine);

        Object[] hero = new Object[6];
        hero[0] = batman;
        hero[1] = aquaman;
        hero[2] = hulk;
        hero[3] = spiderMan;
        hero[4] = superMan;
        hero[5] = wolverine;

        new Arena(hero);


    }
}
