//Sam
package hungerGames;

import hungerGames.models.Career;
import hungerGames.models.Contestant;
import hungerGames.models.District;

import java.util.*;

public class ArenaController {
    //Fields
    private ArrayList<Contestant> contestants;
    private int battleDay;

    //Constructors
    public ArenaController() {
        this.contestants = generateContestants();
    }

    //getters and setters
    public ArrayList<Contestant> getContestants() {
        return contestants;
    }

    public void setContestants(ArrayList<Contestant> contestants) {
        this.contestants = contestants;
    }

    public int getBattleDay() {
        return battleDay;
    }

    public void setBattleDay(int battleDay) {
        this.battleDay = battleDay;
    }

    //Methods

    //Returns an filled ArrayList of 18 District and 6 Career contestants with random generated stats
    public ArrayList<Contestant> generateContestants(){
        ArrayList<Contestant> contestants = new ArrayList<>();
        for(int i = 0; i < 18; i++ ) {
            District district = new District(
                    "District", genderGen(), randomName(), statGen(), statGen(), false
            );
            contestants.add(district);
        }
        for(int i = 0; i < 6; i++ ) {
            Career career = new Career(
                    "Career", genderGen(), randomName(), statGen(), statGen()
            );
            contestants.add(career);
        }
        return contestants;
    }

    //Generates a random name from an Array
    public String randomName() {
        int max = 29;
        int min = 0;
        int range = max - min + 1;
        String name = "";
        String[] names = { "Jesenia", "Dominga", "Eloise", "Janett", "Julius", "Violet", "Temika", "Marchelle",
                "Goldie", "Denice",  "Nicholle", "Reva", "Elayne", "Edith", "Reatha", "Roger", "Lieselotte", "Audrie",
                "Rosella", "Catrina", "Karissa", "Evalyn", "Cecila", "Sharla", "Aurelia", "Tammie", "Denisha", "India",
                "Sharell","Sharell"
        };

        name = names[(int)(Math.random() * range) + min];

        return name;
    };

    //Generates the gender type randomly
    public String genderGen() {
        String gender = "";
        if(Math.random() > 0.5){
            gender = "Male";
        } else
            gender = "Female";

        return gender;
    }

    //Generates a random stat form 1 - 100
    public int statGen() {
        int stat = 0;
        int max = 100;
        int min = 1;
        int range = max - min + 1;

        stat = (int)(Math.random() * range) + min;

        return stat;
    };

    //Randomly selects a index number for the battle
    public int randomContestant(){
        int index = 0;
        int max = 24;
        int min = 1;
        int range = max - min + 1;

        index = (int)(Math.random() * range) + min;

        return index;
    }

    //Simulates the battle
    public void battleDaySimulation(){
        System.out.println(getBattleDay());
        for(Contestant contestant: contestants){
            int i = 1;
            if(contestant.getStatus().equals("Living") && Math.random() > 0.5){
                int opponent = randomContestant();
                if (!contestants.get(opponent).equals(contestant)){
                    contestant.fight(contestant, contestants.get(opponent));
                };
            } else System.out.println("Contestant " + contestant.getName() + "has not encountered an opponent today.");
            i++;
            setBattleDay(i);
        }
    }
}
