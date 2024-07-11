import java.util.Objects;

public class Hufflepuff {

    private String fullName;

    private int  industrious;
    private int loyalty;
    private int honesty;

    private int magicPower;
    private int magicDistance;

    public Hufflepuff(String fullName, int industrious, int loyalty, int honesty, int magicPower, int magicDistance) {
        this.fullName = fullName;
        this.industrious = industrious;
        this.loyalty = loyalty;
        this.honesty = honesty;
        this.magicPower = magicPower;
        this.magicDistance = magicDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getIndustrious() {
        return industrious;
    }

    public void setIndustrious(int industrious) {
        this.industrious = industrious;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
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
        Hufflepuff that = (Hufflepuff) o;
        return industrious == that.industrious && loyalty == that.loyalty && honesty == that.honesty && magicPower == that.magicPower && magicDistance == that.magicDistance && Objects.equals(fullName, that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, industrious, loyalty, honesty, magicPower, magicDistance);
    }

    @Override
    public String toString() {
        return  fullName;
    }

}