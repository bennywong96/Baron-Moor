import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BaronMoor {
    Scanner sc = new Scanner(System.in);
    boolean test = true;
    Random random = new Random();
    String classConfirm;
    String path;
    String yesno;
    String confront;
    int zero = 0;
    int two = 0;
    int one = 0;
    int three = 0;
    int four = 0;
    ArrayList<HeroClass> job = new ArrayList<>();
    ArrayList<Monsters> monsters = new ArrayList<>();
    Random rand = new Random();

    //the reason for two is because two is 0 and two only increments in play again
    //this means if play again happens the right hero class details is chosen.


    public void addPlayer(HeroClass newJob){job.add(newJob);}
    public void addMonsters(Monsters newMonsters) {monsters.add(newMonsters);}


    public void printOut(){
        System.out.println("You stand before the gigantic door with weird symbols.");
        System.out.println("You hear a voice, asking for your name.");
        System.out.println("What is your name, new adventurer?");
        String name = sc.nextLine();
        System.out.println("Welcome, " + name);
        System.out.println("I am known as the Guardian, Your new journey will be tough one");
        System.out.println("Come let's decide your class, pick from:");
        System.out.println("Archer, Protector, Duelist or Wizard");
        while(test){
            if (zero!= 0){
                System.out.println("Can't decide huh?, no worries I am here forever");
                System.out.println("So Archer, Protector, Duelist or Wizard");
                zero=0;
            }
            if(one!=0){
                System.out.println("I now know you suck so let's try this again");
                System.out.println("So Archer, Protector, Duelist or Wizard");
                one=0;
            }
            String chosenClass = sc.nextLine();





            if(chosenClass.toLowerCase().equals("archer")){
                System.out.println("So you have chosen Archer, are you sure about this? (Y/N)");
                classConfirm=sc.nextLine();
                if (classConfirm.toLowerCase().equals("y")){
                    System.out.println("I knew it, you seem like someone who have sharp eyes");
                    Archer a1 = new Archer(name,1, 100,100,40, 20, "Rapid Fire");
                            addPlayer(a1);
                    firstJourney(name, chosenClass);
                    break;
                }
                else if (classConfirm.toLowerCase().equals("n")){
                    zero++;
                }
                else {
                    System.out.println("Seems like you suck at answering, let's choose again");
                    one++;
                }
            }

            else if (chosenClass.toLowerCase().equals("protector")){
                System.out.println("So you have chosen Protector, are you sure about this? (Y/N)");
                classConfirm=sc.nextLine();
                if (classConfirm.toLowerCase().equals("y")){
                    System.out.println("You seem like the type that can take a few hits");
                    Protector p1 = new Protector(name,1, 150,100,30, 50, "Block");
                    addPlayer(p1);
                    firstJourney(name, chosenClass);
                    break;
                }
                else if (classConfirm.toLowerCase().equals("n")){
                    zero++;
                }
                else {
                    System.out.println("Seems like you suck at answering, let's choose again");
                    one++;
                }
            }

            else if (chosenClass.toLowerCase().equals("duelist")){
                System.out.println("So you have chosen Duelist, are you sure about this? (Y/N)");
                classConfirm=sc.nextLine();
                if (classConfirm.toLowerCase().equals("y")){
                    System.out.println("Duelist, Dualist, Yeah you use two swords");
                    Duelist d1 = new Duelist(name,1, 110,100,30, 30, "Death Dance");
                    addPlayer(d1);
                    firstJourney(name, chosenClass);
                    break;
                }
                else if (classConfirm.toLowerCase().equals("n")){
                    zero++;
                }
                else {
                    System.out.println("Seems like you suck at answering, let's choose again");
                    one++;
                }
            }

            else if (chosenClass.toLowerCase().equals("wizard")){
                System.out.println("So you have chosen Wizard, are you sure about this? (Y/N)");
                classConfirm=sc.nextLine();
                if (classConfirm.toLowerCase().equals("y")){
                    System.out.println("Great power comes great responsibility");
                    Wizard w1 = new Wizard(name,1, 80,200,60,
                            20, "Elemental Specialist");
                    addPlayer(w1);
                    firstJourney(name, chosenClass);
                    break;
                }
                else if (classConfirm.toLowerCase().equals("n")){
                    zero++;
                }
                else {
                    System.out.println("Seems like you suck at answering, let's choose again");
                    one++;
                }
            }
            else {
                //randomnumber generator here
                int guardianReplies = rand.nextInt(3) + 1;

                switch (guardianReplies) {
                    case 1:
                        System.out.println("Are you playing with me? Choose out of the list");
                        break;
                    case 2:
                        System.out.println("Why can't you type or read properly? Choose from the list");
                        break;
                    case 3:
                        System.out.println("Come on, be real");
                        break;

                }
            }
        }
    }

    public void firstJourney(String name, String className){
        System.out.println("Well " + name + " time to begin your new journey as a "+ className
        + ". Good luck." + "\n");
        System.out.println("Your first step pass the gigantic door, which direction do you want to go?" +
                "(F/L/B/R)");
        while(test) {
            if (three!=0){
                System.out.println("Now lets try this again");
                System.out.println("F/L/B/R?");
                three=0;
            }
            path = sc.nextLine();
            if(path.toLowerCase().equals("f")){
                System.out.println("Forward huh? Bold move");
                laterJourney(path);
                break;
            }
            else if (path.toLowerCase().equals("l")){
                System.out.println("Left? Alright your call");
                laterJourney(path);
                break;
            }

            else if (path.toLowerCase().equals("b")){
                System.out.println("Don't be stupid, the Guardian doesn't want to see you");
                three++;
            }
            else if (path.toLowerCase().equals("r")){
                System.out.println("Right Right Right. Alrighty then");
                laterJourney(path);
                break;
            }
            else{
                System.out.println("Come on now, choose from the list");
            }
        }
    }

    public void middleJourney(String path){
        //this method should be used for looping ability until laterjourney is used
        //but right now has no use as first journey links straight to laterjourney
        System.out.print("You walk towards your direction");
        while(test) {
            if (three!=0){
                System.out.println("Now lets try this again");
                System.out.println("F/L/B/R?");
                three=0;
            }
            path = sc.nextLine();
            if(path.toLowerCase().equals("f")){
                System.out.println("Straight it is");
                laterJourney(path);
                break;
            }
            else if (path.toLowerCase().equals("l")){
                System.out.println("Left, let's go");
                laterJourney(path);
                break;
            }

            else if (path.toLowerCase().equals("b")){
                System.out.println("Backwards the way");
                three++;
            }
            else if (path.toLowerCase().equals("r")){
                System.out.println("Right Right Right. Alrighty then");
                laterJourney(path);
                break;
            }
            else{
                System.out.println("Come on now, choose from the list");
            }
        }
    }

    public void churchChoiceN(){
        System.out.println("You decided not to go to the church." +
                " But you accidentally get swarmed by a mob and die");
        System.out.println("The End");
        playAgain();
    }
    public void churchChoiceY(){
        System.out.println("You head into the church but" +
                " a trapdoor opens and you fall to your death. GG");
        System.out.println("The End");
        playAgain();
    }

    public void laterJourney(String path){
        int whoGoesFirst = rand.nextInt(2)+1;
        int randomNumberM = rand.nextInt(monsters.size());
        int mattack = monsters.get(randomNumberM).getAttack();
        int mdefense = monsters.get(randomNumberM).getDefense();
        int hhp = job.get(two).getHp();
        int hattack = job.get(two).getAttack();
        int hdefense = job.get(two).getDefense();

        System.out.print("You walk towards your direction, ");
        System.out.println("You arrive but nothing interesting happens, where to next? (F/L/B/R)");
        path = sc.nextLine();
        while (test) {
            if (path.toLowerCase().equals("f")) {
                System.out.println("As you go forward, you see nothing but tall grass");
                System.out.println("You sense movement in the tall grass");
                System.out.println("Do you go near the grass? (Y/N)");
                yesno = sc.nextLine();
                if (yesno.toLowerCase().equals("y")){
                    System.out.println("You decided to walk into the tall grass");
                    System.out.println("You find an injured slime, you decide to help the slime");
                    System.out.println("The slime decides to follow you");
                    System.out.println("You gained an companion!");
                    System.out.println("And this is just the start for you and your companion");
                    System.out.println("To Be Continued");
                    playAgain();
                }
                else if (yesno.toLowerCase().equals("n")){
                    System.out.println("You decided not to go near the grass");
                    System.out.println("However you accidentally stepped into a hunter trap");
                    System.out.println("You dangle on a tree for three days straight and die of dehydration");
                    System.out.println("Poor way to go");
                    System.out.println("The End");
                    playAgain();
                }
                break;
            }
            if (path.toLowerCase().equals("l")) {
                System.out.println("As you head left, you see the ocean.");
                System.out.println("But that is not all you see, a wild monster has appeared.");
                /*
                Ideas
                Making use of the special skills of each class, each class has a unique skill which is in their
                personal .java

                Rapid Fire - allows archer to attack twice with 2nd damage being randomed but has to be less than
                the first damage, for example archer damage is 30 then the 2nd damage is randomed with
                random number as rand.nextInt(hattack); and skill uses 10mp

                Death Dance - times Duelist next attack by 4 but lose 10hp

                Elemental Specialist - Might as well be x10 damage but -half mp

                Block - Negates all damage costs 20mp
                 */
                System.out.println(monsters.get(randomNumberM).getName() + ", Level: " + monsters.get(randomNumberM).getLevel());
                System.out.println("Do you fight or run?");
                confront = sc.nextLine();
                if (confront.toLowerCase().equals("fight")) {
                    System.out.println("You decided to fight");
                    //while(test) {
                        if (whoGoesFirst == 1) {
                            //player goes first
                            if (hattack > mdefense) {
                                System.out.println("You slay the monster!");
                                System.out.println("Turns out the monster you killed dropped a teleportation item,");
                                System.out.println("As soon as you step close to the item you get teleported away.");
                                System.out.println("You find yourself in a castle, " +
                                        "the King welcomes you, turns out you are the destined hero to save this world");
                                System.out.println("But that's a story for next time");
                                System.out.println("To Be Continued");
                                playAgain();
                                //slighty rushed/forced ending at least no deaths though
                            } else if (hattack < mdefense) {
                                System.out.println("You tried hitting the monster");
                                System.out.println("Well you didn't do much, you should run");
                                System.out.println("Do you want to run? (Y/N)");
                                yesno = sc.nextLine();
                                if (yesno.toLowerCase().equals("y")) {
                                    int lucky = rand.nextInt(2) + 1;
                                    if (lucky == 1) {
                                        System.out.println("Lol, your tried running but tripped and died");
                                        System.out.println("The End");
                                    }
                                    else if (lucky == 2) {
                                        System.out.println("You run away but not before the monster hits you");
                                        whoGoesFirst = 2;
                                        //whoGoesFirst changes to 2 so monster can attack
                                        four++;
                                        //four increments to set off an if statement below
                                    }

                                }
                                else if (yesno.toLowerCase().equals("n")){
                                    System.out.println("You just had to stay");
                                    System.out.println("Good job, the monster slapped you and you died");
                                    System.out.println("The End");
                                    playAgain();
                                }
                            }
                        }
                        if (whoGoesFirst == 2) {
                            //monster goes first
                            if (mattack > hdefense) {
                                System.out.println("The " + monsters.get(randomNumberM).getName() + " hits you hard");
                                System.out.println(hhp);
                                //sout test to see what original hp is (ARCHER 100)
                                int newHp = hhp - mattack;
                                job.get(two).setHp(newHp);
                                //setting new hp
                                System.out.println(job.get(two).getHp());
                                //sout test to see new hp
                            }
                            if (mattack < hdefense) {
                                System.out.println("You defended against the " + monsters.get(randomNumberM).getName() +
                                        ", damage reduced greatly");
                                System.out.println(hhp);
                                int newHp = hhp - 2;
                                job.get(two).setHp(newHp);
                                System.out.println(job.get(two).getHp());
                            }
                            if (job.get(two).getHp()<=0){
                                hpDeath();
                            }
                        }
                        if (four != 0) {
                            System.out.println("After getting hit by the monster you run but " +
                                    "turns out you lost too much blood");
                            System.out.println("You start losing vision");
                            System.out.println("You died after loosing too much blood");
                            System.out.println("The End");
                            playAgain();
                        }

                    //}
                    //get hero attack and defense
                    //get monster attack and defense
                    //get hero hp
                    //roll to see who goes first,
                    //if hero attack>monster defense then monster dies
                    //if hero attack<monster defense then set monster defense to monsterdefense-heroattack
                    //if monster attack > hero defense then hero takes damage
                    //hero hp - monster attack
                    //if monster attack < hero defense then hero takes less damage
                    //instead of full damage it will be set damage of 2



                    //if hp==0 then hpDeath()
                    //method exists but confused myself a bit so don't actually know where to use if hp ever drops to 0


                }
                if(confront.toLowerCase().equals("run")){
                    System.out.println("You run away");
                    System.out.println("But not fast enough and get backstabbed and die");
                    System.out.println("The End");
                    playAgain();
                }
                break;
            }
            if (path.toLowerCase().equals("r")) {
                System.out.println("As you head right, you see a church");
                System.out.println("Do you head over to the church? (Y/N)");
                yesno = sc.nextLine();
                if (yesno.toLowerCase().equals("y")) {
                    churchChoiceY();
                }
                if (yesno.toLowerCase().equals("n")) {
                    churchChoiceN();
                }
                break;
            }
            if (path.toLowerCase().equals("b")) {
                System.out.println("As you head backwards, you see a ship");
                System.out.println("Do you head to the ship? (Y/N)");
                yesno = sc.nextLine();
                shipChoice(yesno);
                break;
            }

            else{
                System.out.println("Stop choosing invalid directions");
            }
        }
    }

    public void shipChoice(String choice){
        if (choice.toLowerCase().equals("y")){
            System.out.println("You approach the ship");
            System.out.println("Not your lucky day, it was a pirate ship and the " +
                    "crew thought you was raiding their ship");
            System.out.println("You got shot and bleed to death");
            System.out.println("The End");
            playAgain();
        }
        else if (choice.toLowerCase().equals("n")){

            System.out.println("You try to walk away from the ship");
            System.out.println("But you run into a bunch of muscular guys");
            System.out.println("Turns out they are slave traders");
            System.out.println("You get captured and become a slave, your journey comes to a huge halt");
            System.out.println("To Be Continued");
            playAgain();

        }

    }


    public void populatingMonsters(){
        Monsters m1 = new Monsters("Slime", 1,10,10);
        Monsters m2 = new Monsters("Orc", 8, 30,10);
        Monsters m3 = new Monsters("Kobold", 11, 45,30);
        Monsters m4 = new Monsters("Undead", 15, 60,60);
        Monsters m5 = new Monsters("Death Shadow",200,5000,5000);
        //might as well run
        addMonsters(m1);
        addMonsters(m2);
        addMonsters(m3);
        addMonsters(m4);
        addMonsters(m5);
    }


    public void playAgain() {
        System.out.println("Do you want to play again? (Y/N)");
        while (test) {
            yesno = sc.nextLine();
            if (yesno.toLowerCase().equals("y")) {
                two++;
                printOut();
                break;
            } else if (yesno.toLowerCase().equals("n")) {
                System.exit(0);
            }
            else{
                System.out.println("All I am asking is Y/N");
            }
        }
    }

    public void hpDeath(){
        System.out.println("Your HP dropped to 0 and died. GG");
        System.out.println("The End");
        playAgain();
    }



}
