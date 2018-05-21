import java.util.ArrayList;

public class Monsters {
    private String name;
    private int level;
    private int attack;
    private int defense;


    public Monsters (String name,int level, int attack, int defense){
        this.name = name;
        this.level = level;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName(){ return name; }
    public int getLevel(){return level;}
    public int getAttack(){return attack;}
    public int getDefense(){return defense;}

}
