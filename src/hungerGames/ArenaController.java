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
        this.contestants = generateContestants(18, 6);
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
    public ArrayList<Contestant> generateContestants(int district, int career){
        ArrayList<Contestant> contestants = new ArrayList<>();
        for(int i = 0; i < district; i++ ) {
            contestants.add(generateDistrict());
        }
        for(int i = 0; i < career; i++ ) {
            contestants.add(generateCareer());
        }

        return contestants;
    }

    public District generateDistrict(){
        District district = new District(
                "District",
                numberGen(10000, 99999),
                genderGen(),
                randomName(),
                numberGen(0, 100),
                numberGen(0, 100));

        return district;
    }

    public Career generateCareer(){
        Career career = new Career(
                "Career",
                numberGen(10000, 99999),
                genderGen(),
                randomName(),
                numberGen(0, 100),
                numberGen(0, 100));

        return career;
    }

    //Generates a random name from an Array
    public String randomName() {
        String name;
        String[] names = { "Jesenia", "Dominga", "Eloise", "Janett", "Julius", "Violet", "Temika", "Marchelle",
                "Goldie", "Denice",  "Nicholle", "Reva", "Elayne", "Edith", "Reatha", "Roger", "Lieselotte", "Audrie",
                "Rosella", "Catrina", "Karissa", "Evalyn", "Cecila", "Sharla", "Aurelia", "Tammie", "Denisha", "India",
                "Sharell", "Sam", "Ahmed", "Gio", "Jeroen", "Clyde"
        };
        Random random = new Random();
        name = names[random.nextInt(34)];

        return name;
    };

    //Generates the gender type randomly
    public String genderGen() {
        String gender;
        if(Math.random() < 0.5){
            gender = "Male";
        } else
            gender = "Female";

        return gender;
    }

    //Generates a random number form a min to max range
    public int numberGen(int min, int max){
        if(min > max){
            throw new IllegalArgumentException("Max must be greater than min");
        }
        Random random = new Random();

        return random.nextInt((max - min) +1) + min;
    }

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
    }





//    public void fight(Contestant contestant, Contestant opponent){
//        if
//
//    }

//    public void fight(Contestant contestant, Contestant opponent){
//        while((contestant.getHP() + opponent.getHP()) / 2 <= 0 ) {
//            if (contestant.getOff() >= opponent.getDef()) {
//                opponent.setHP(opponent.getHP() - (contestant.getOff() - opponent.getDef()));
//                System.out.println("Attack succesfully! " + opponent.getName() + " took "
//                        + (contestant.getOff() - opponent.getDef()) + " damage!");
//                opponent.setStatus("Deceased");
//            } else if (opponent.getDef() > contestant.getOff() && opponent.getOff() > contestant.getDef()) {
//                contestant.setHP(contestant.getHP() - (opponent.getOff() - contestant.getDef()));
//                System.out.println("Opponent succesfully defended and countered with "
//                        + (opponent.getOff() - contestant.getDef()) + " damage!");
//                contestant.setStatus("Deceased");
//            } else if (opponent.getDef() > contestant.getOff() && opponent.getOff() < contestant.getDef()) {
//                System.out.println(contestant.getName() + " had an accident and died!");
//                contestant.setStatus("Deceased");
//                contestant.setHP(0);
//            }
//        }
//    }
}
