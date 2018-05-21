public class Wizard extends HeroClass {

    private String uniqueSkill;

    Wizard(String name,int level, int hp, int mp, int attack, int defense, String uniqueSkill){
        super(name,level,hp,mp,attack,defense);
        this.uniqueSkill=uniqueSkill;
    }

    public void typeOfClass(){
        System.out.println("You are a Wizard");
    }

}
