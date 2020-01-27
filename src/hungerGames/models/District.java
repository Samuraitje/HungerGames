package hungerGames.models;

public class District extends Contestant {
    //fields
    private int def;
    private static final int defBonus = 20;

    //constructors
    public District() {
    }

    public District(String type, String gender, String name, int off, int def, boolean item) {
        super(type, gender, name, off, def, item);
        this.def = def + defBonus;
    }

    //getters and setters
    @Override
    public int getDef() {
        return def;
    }

    @Override
    public void setDef(int def) {
        this.def = def;
    }

    //toString method for the District class
    @Override
    public String toString(){
        StringBuilder district = new StringBuilder();
        district.append(getType() + "  contestant: ").append(getName()).append("\n");
        district.append("Status: ").append(getStatus()).append("\n");
        district.append("Gender: ").append(getGender()).append("\n");
        district.append("HP: ").append(getHP()).append("\n");
        district.append("Offense: ").append(getOff()).append("\n");
        district.append("Defense: ").append(getDef()).append("\n");
        district.append("Battle item: ").append(isItem()).append("\n");
        district.append("\n");
        return district.toString();
    }
}
