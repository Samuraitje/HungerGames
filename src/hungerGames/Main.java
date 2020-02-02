//Sam
package hungerGames;
import hungerGames.models.Contestant;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        ArenaController a = new ArenaController();
        System.out.println(a.getContestants());
        System.out.println(a.getContestants().size());

        System.out.println(a.getContestants().get(2).getID());
        System.out.println(a.getContestants().get(2).isLiving(a.getContestants().get(2).isAlive()));
        System.out.println(a.numberGen(0, 2));
        a.getContestants().get(2).attack(a.getContestants().get(2), a.getContestants().get(23));

    }
}
