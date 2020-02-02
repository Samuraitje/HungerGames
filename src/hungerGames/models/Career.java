package hungerGames.models;

public class Career extends Contestant {
    //fields
    private static final boolean item = true;
    private int off;
    private static final int offBonus = 20;

    //constructors
    public Career() {
    }

    public Career(String type, int ID, String gender, String name, int off, int def) {
        super(type, ID, gender, name, off, def);
        this.off = off + offBonus;
    }

    //getters and setters
    @Override
    public int getOff() {
        return off;
    }

    @Override
    public void setOff(int off) {
        this.off = off;
    }

    @Override
    public String isLiving(boolean alive){
        String status = "the Career contestant is dead.";
        if(alive){
            status = "the Career contestant is alive.";
        }
        return status;
    }

    @Override
    public void attack(Contestant con, Contestant opp){
        con.setOff(con.getOff() + offBonus);
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

    //toString method for the Career class

    @Override public String toString(){
        StringBuilder career = new StringBuilder();
        career.append(getType() + " ID: " + getID()).append("\n");
        career.append("Name: " + getName()).append("\n");
        career.append("Gender: ").append(getGender()).append("\n");
        career.append("HP: ").append(getHP()).append("\n");
        career.append("Offense: ").append(getOff()).append("\n");
        career.append("Defense: ").append(getDef()).append("\n");
        career.append("Battle item: ").append(isItem()).append("\n");
        career.append("Status: ").append(isLiving(isAlive())).append("\n");
        career.append("\n");
        return career.toString();
    }
}
