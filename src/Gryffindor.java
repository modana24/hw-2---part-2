import java.util.Objects;

public class Gryffindor {

    private String fullName;

    private int nobility;
    private int honor;
    private int bravery;

    private int magicPower;
    private int magicDistance;

    public Gryffindor(String fullName, int nobility, int honor, int bravery, int magicPower, int magicDistance) {
        this.fullName = fullName;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        this.magicPower = magicPower;
        this.magicDistance = magicDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
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
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery && magicPower == that.magicPower && magicDistance == that.magicDistance && Objects.equals(fullName, that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, nobility, honor, bravery, magicPower, magicDistance);
    }

    @Override
    public String toString() {
        return fullName ;
    }
}