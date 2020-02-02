package hungerGames.models;

public class District extends Contestant {
    //fields
    private int def;
    private static final int defBonus = 20;

    //constructors
    public District() {
    }

    public District(String type, int ID, String gender, String name, int off, int def) {
        super(type, ID, gender, name, off, def);
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

    //methods
    @Override
    public String isLiving(boolean alive){
        String status = "the District contestant is dead.";
        if(alive){
            status = "the District contestant is alive.";
        }
        return status;
    }

    @Override
    public void attack(Contestant con, Contestant opp){
        if(con.getOff() > opp.getDef()){
            int dam;
            dam = con.getOff() - opp.getDef();
            opp.setHP(opp.getHP() - dam);
            System.out.println(con.getType() + " contestant " +  con.getName() + " succesfully hits " + opp.getType() +
                    " contestant " + opp.getName() + " with " + dam + " points with " + opp.getHP() + " health points " +
                    "remaining.");
        } else System.out.println(con.getType() + " contestant " +  con.getName() + " misses its opponent " +
                opp.getType() + " contestant " + opp.getName() + ".");
    }

    //toString method for the District class
    @Override
    public String toString(){
        StringBuilder district = new StringBuilder();
        district.append(getType() + " ID: " + getID()).append("\n");
        district.append("Name: " + getName()).append("\n");
        district.append("Gender: ").append(getGender()).append("\n");
        district.append("HP: ").append(getHP()).append("\n");
        district.append("Offense: ").append(getOff()).append("\n");
        district.append("Defense: ").append(getDef()).append("\n");
        district.append("Battle item: ").append(isItem()).append("\n");
        district.append("Status: ").append(isLiving(isAlive())).append("\n");
        district.append("\n");
        return district.toString();
    }
}
