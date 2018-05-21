
/*
Explanation -
Hero class has base stats which then other classes extends and uses different values
if there time implementation of random monster encounters would be good
then there are different classes to choose from which all extends from heroclass.
Each class should have a unique skill

BaronMoor.java contains all the methods main would call to make the game run.

Kinda unique story with a few to be continues while the rest leads to death. Good luck finding the to be continues
and good luck finding all the deaths
Currently only has one event link to combat however the combat monsters are randomly generated.
To get to fighting combat, after initial direction choice F/L/R (no B) then choose L for combat

Personal Achievement List?
Isekai?
No Longer Alone?
Haitus?


10:26 - only archer works and initial journey half works.
12:14 - only archer works, initial journey works choosing Right procs church event
both which leads to death this was to test play again which worked.
Choosing other directions currently has events so the program just ends.
12:49 - all classes can now be chosen
13:00 - one path leads to a to be continued story (close enough for victory condition)
14:40 - tested fighting option where hero gets hit by an undead, prints "The Undead hits you hard"
from initial 100hp it reduces to 40 well that undead is strong
15:11 - Do you want to play again pops up too quickly, if only there was a system sleep for x amount of microseconds
to allow the user to read the text that they died. This would make a smoother user experience.
15:35 - Game loops all the way until user decides not to play again.
15:36 - Realised the fighting system is one turn only...
15:48 - Tried doing a loop for combat but it became a never ending loop of same results
15:55 - When hp drops to 0 hpDeath actually works
15:57 - Tested directions and they seem fine


 */



public class BaronMoorMain {
    public static void main(String[] args) {

        BaronMoor bm = new BaronMoor();
        bm.populatingMonsters();
        bm.printOut();
    }

}
