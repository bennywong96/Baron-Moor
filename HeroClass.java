public class HeroClass {
    private String className;
    private int level;
    private int hp;
    private int mp;
    private int attack;
    private int defense;

//    HeroClass(int hp, int mp,int attack, int defense){
//
//    }


    public HeroClass(String className,int level, int hp, int mp, int attack, int defense){
        this.className=className;
        this.level = level;
        this.hp=hp;
        this.mp=mp;
        this.attack=attack;
        this.defense=defense;
    }



    public void uniqueSkill(String job, String skillName){
        System.out.println("Your class is " + job + " and your unique skill is "+ skillName);
    }

    public void typeOfClass(){
        System.out.println("You are a Class");
    }

    public String getName(){ return className; }
    public int getLevel(){return level;}
    public int getAttack(){return attack;}
    public int getDefense(){return defense;}
    public int getHp() {return hp;}
    public int getMp() {return mp;}

    public void setHp(int newHp){this.hp = newHp;}


}
