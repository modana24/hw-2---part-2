import java.util.Objects;

public class Slytherin extends PersonInfo{

    private int cunning;
    private int determination;
    private int ambition;
    private int resource;
    private int power;


    public Slytherin(String fullName, int cunning, int determination, int ambition, int resource, int power, int magicPower, int magicDistance) {
        super(fullName, magicPower, magicDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resource = resource;
        this.power = power;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slytherin slytherin = (Slytherin) o;
        return cunning == slytherin.cunning && determination == slytherin.determination && ambition == slytherin.ambition && resource == slytherin.resource && power == slytherin.power;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, determination, ambition, resource, power);
    }
}