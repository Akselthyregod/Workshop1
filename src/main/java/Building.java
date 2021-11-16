import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Building extends Unit{

    private List<Sensor> sensors;
    private List<Actuator> actuators;

    public Building(String name) {
        super(name);
        this.sensors = new ArrayList<>();
        this.actuators = new ArrayList<>();
    }

    public List<Sensor> getSensors() {
        return sensors;
    }

    public List<Actuator> getActuators() {
        return actuators;
    }

    public UUID addTempSensor(String name){

        TemperatureSensor tempSens1 = new TemperatureSensor(name, 0);
        sensors.add(tempSens1);
        return tempSens1.getId();
    }

    public UUID addCo2Sensor(String name){

        Co2Sensor co2Sens1 = new Co2Sensor(name, 0);
        sensors.add(co2Sens1);
        return co2Sens1.getId();

    }

    public UUID addVentActuator(String name){

        VentilationActuator ventAct = new VentilationActuator(name, 1);
        actuators.add(ventAct);

        return ventAct.getId();

    }

    public void removeSensor(UUID id){
        sensors.removeIf(sensor -> sensor.getId() == id);
    }

    public void removeActuator(UUID id){
        actuators.removeIf(act -> act.getId() == id);
    }

    @Override
    public String toString() {
        return super.toString() + "\nBuilding{" +
                "\nsensors=" + sensors +
                ", \nactuators=" + actuators +
                '}';
    }
}
