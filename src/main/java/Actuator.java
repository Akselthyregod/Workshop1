import java.util.UUID;

public abstract class Actuator extends Unit{

    private double value;

    public Actuator(String name, double value) {
        super(name);
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
