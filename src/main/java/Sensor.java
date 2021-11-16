import java.util.UUID;

public class Sensor extends Unit{

    private double value;

    public Sensor(String name, double value) {
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
