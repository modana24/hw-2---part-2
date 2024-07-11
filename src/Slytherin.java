import java.util.Objects;

public class Slytherin {

    private String fullName;

    private int cunning;
    private int determination;
    private int ambition;
    private int resource;
    private int power;

    private int magicPower;
    private int magicDistance;

    public Slytherin(String fullName, int cunning, int determination, int ambition, int resource, int power, int magicPower, int magicDistance) {
        this.fullName = fullName;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resource = resource;
        this.power = power;
        this.magicPower = magicPower;
        this.magicDistance = magicDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
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
        Slytherin slytherin = (Slytherin) o;
        return cunning == slytherin.cunning && determination == slytherin.determination && ambition == slytherin.ambition && resource == slytherin.resource && power == slytherin.power && magicPower == slytherin.magicPower && magicDistance == slytherin.magicDistance && Objects.equals(fullName, slytherin.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, cunning, determination, ambition, resource, power, magicPower, magicDistance);
    }

    @Override
    public String toString() {
        return fullName ;
    }
}