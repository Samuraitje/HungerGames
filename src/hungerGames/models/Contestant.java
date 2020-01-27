package hungerGames.models;

public abstract class Contestant {
    //fields
    private String type;
    private String gender;
    private String name;
    private int HP = 100;
    private int off;
    private int def;
    private boolean item;
    private int kills = 0;
    private String status = "Living";

    //constructors
    public Contestant() {
    }

    public Contestant(String type, String gender, String name, int off, int def, boolean item) {
        this.type = type;
        this.gender = gender;
        this.name = name;
        this.off = off;
        this.def = def;
        this.item = item;
    }

    //getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) { this.gender = gender; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) { this.HP = HP; }

    public int getOff() {
        return off;
    }

    public void setOff(int off) {
        this.off = off;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public boolean isItem() {
        return item;
    }

    public void setItem(boolean item) {
        this.item = item;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //Methods

    //simulates
    public void fight(Contestant contestant, Contestant opponent){
        while(contestant.getHP() > 0 && opponent.getHP() > 0) {
            if (contestant.getOff() >= opponent.getDef()) {
                opponent.setHP(opponent.getHP() - (contestant.getOff() - opponent.getDef()));
                System.out.println("Attack succesfully! " + opponent.getName() + " took "
                        + (contestant.getOff() - opponent.getDef()) + " damage!");
                opponent.setStatus("Deceased");
            } else if (opponent.getDef() > contestant.getOff() && opponent.getOff() > contestant.getDef()) {
                contestant.setHP(contestant.getHP() - (opponent.getOff() - contestant.getDef()));
                System.out.println("Opponent succesfully defended and countered with "
                        + (opponent.getOff() - contestant.getDef()) + " damage!");
                contestant.setStatus("Deceased");
            } else if (opponent.getDef() > contestant.getOff() && opponent.getOff() < contestant.getDef()) {
                System.out.println(contestant.getName() + " had an accident and died!");
                contestant.setStatus("Deceased");
                contestant.setHP(0);
            }
        }
    }
}
