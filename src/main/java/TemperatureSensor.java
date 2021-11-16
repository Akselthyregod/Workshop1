import java.util.UUID;

public class TemperatureSensor extends Sensor{

    public TemperatureSensor(String name, double value) {
        super(name, value);
    }

    @Override
    public String toString() {
        return super.toString() + " Value: " + this.getValue();
    }
}
