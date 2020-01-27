package hungerGames.models;

public class Career extends Contestant {
    //fields
    private static final boolean item = true;
    private int off;
    private static final int offBonus = 20;

    //constructors
    public Career() {
    }

    public Career(String type, String gender, String name, int off, int def) {
        super(type, gender, name, off, def, item);
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


    //toString method for the Career class

    @Override public String toString(){
        StringBuilder career = new StringBuilder();
        career.append(getType() + " contestant: ").append(getName()).append("\n");
        career.append("Status: ").append(getStatus()).append("\n");
        career.append("Gender: ").append(getGender()).append("\n");
        career.append("HP: ").append(getHP()).append("\n");
        career.append("Offense: ").append(getOff()).append("\n");
        career.append("Defense: ").append(getDef()).append("\n");
        career.append("Battle item: ").append(isItem()).append("\n");
        career.append("\n");
        return career.toString();
    }
}
