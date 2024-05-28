import java.util.Objects;

public class Quality {
    private final String name;

    private int measurement;
    public Quality(String name, int measurement) {
        this.name = name;
        this.measurement = measurement;
    }

    public void setMeasurement(int measurement) {
        this.measurement = measurement;
    }

    public String getName() {
        return name;
    }

    public int getMeasurement() {
        return measurement;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Quality quality = (Quality) object;
        return measurement == quality.measurement && Objects.equals(name, quality.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, measurement);
    }

    @Override
    public String toString() {
        return  name;
    }
}
