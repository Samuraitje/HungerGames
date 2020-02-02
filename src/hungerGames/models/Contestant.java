package hungerGames.models;

public abstract class Contestant {
    //fields
    private String type;
    private int ID;
    private String gender;
    private String name;
    private int HP = 100;
    private int off;
    private int def;
    private boolean item;
    private int kills = 0;
    private boolean alive = true;

    //constructors
    public Contestant() {
    }

    public Contestant(String type, int ID, String gender, String name, int off, int def) {
        this.type = type;
        this.ID = ID;
        this.gender = gender;
        this.name = name;
        this.off = off;
        this.def = def;
    }

    //getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) { this.type = type; }

    public int getID() { return ID; }

    public void setID(int ID) { this.ID = ID; }

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

    public boolean isAlive() { return alive; }

    public void setAlive(boolean alive) { this.alive = alive; }

    //methods
    public abstract String isLiving(boolean alive);

    public abstract void attack(Contestant con, Contestant opp);

}
