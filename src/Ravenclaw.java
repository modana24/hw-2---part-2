import java.util.Objects;

public class Ravenclaw {

    private String fullName;

    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    private int magicPower;
    private int magicDistance;

    public Ravenclaw(String fullName, int mind, int wisdom, int wit, int creation, int magicPower, int magicDistance) {
        this.fullName = fullName;
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
        this.magicPower = magicPower;
        this.magicDistance = magicDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getMagicDistance() {
        return magicDistance;
    }

    public void setMagicDistance(int magicDistance) {
        this.magicDistance = magicDistance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return mind == ravenclaw.mind && wisdom == ravenclaw.wisdom && wit == ravenclaw.wit && creation == ravenclaw.creation && magicPower == ravenclaw.magicPower && magicDistance == ravenclaw.magicDistance && Objects.equals(fullName, ravenclaw.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, mind, wisdom, wit, creation, magicPower, magicDistance);
    }

    @Override
    public String toString() {
        return  fullName;
    }
}