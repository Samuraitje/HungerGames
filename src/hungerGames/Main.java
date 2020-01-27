//Sam
package hungerGames;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world");

        ArenaController a = new ArenaController();
        System.out.println(a.getContestants());
        System.out.println(a.getContestants().size());

//        System.out.println(a.selectContestant());

        System.out.println(a.getContestants().get(2).getStatus().equals("Living"));
        a.getContestants().get(1).fight(a.getContestants().get(1), a.getContestants().get(2));
        System.out.println(a.getContestants().get(1).getHP());
        System.out.println(a.getContestants().get(1).getStatus());
        System.out.println(a.getContestants().get(2).getHP());
        System.out.println(a.getContestants().get(2).getStatus());


    }
}
