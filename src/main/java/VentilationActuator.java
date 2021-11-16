import java.util.UUID;

public class VentilationActuator extends Actuator{

    public VentilationActuator(String name, double value) {
        super(name, value);
    }

    @Override
    public String toString() {
        return super.toString() + " Value: " + this.getValue();
    }
}
