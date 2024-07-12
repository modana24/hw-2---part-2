import java.util.Objects;

public class PersonInfo {
    String fullName;
    int magicPower;
    int magicDistance;

    public PersonInfo(String fullName, int magicPower, int magicDistance) {
        this.fullName = fullName;
        this.magicPower = magicPower;
        this.magicDistance = magicDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
        PersonInfo that = (PersonInfo) o;
        return magicPower == that.magicPower && magicDistance == that.magicDistance && Objects.equals(fullName, that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, magicPower, magicDistance);
    }

    @Override
    public String toString() {
        return fullName;
    }
}

