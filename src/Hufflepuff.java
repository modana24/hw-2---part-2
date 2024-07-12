import java.util.Objects;

public class Hufflepuff extends PersonInfo {

    private int  industrious;
    private int loyalty;
    private int honesty;


    public Hufflepuff(String fullName, int industrious, int loyalty, int honesty, int magicPower, int magicDistance) {
        super(fullName, magicPower, magicDistance);
        this.industrious = industrious;
        this.loyalty = loyalty;
        this.honesty = honesty;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return industrious == that.industrious && loyalty == that.loyalty && honesty == that.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), industrious, loyalty, honesty);
    }

}