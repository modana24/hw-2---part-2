import java.util.Objects;

public class Ravenclaw extends PersonInfo{

    private int mind;
    private int wisdom;
    private int wit;
    private int creation;


    public Ravenclaw(String fullName, int mind, int wisdom, int wit, int creation, int magicPower, int magicDistance) {
        super(fullName, magicPower, magicDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return mind == ravenclaw.mind && wisdom == ravenclaw.wisdom && wit == ravenclaw.wit && creation == ravenclaw.creation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mind, wisdom, wit, creation);
    }
}