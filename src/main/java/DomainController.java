import java.util.*;

public class DomainController implements IBuildingManagementSystem{

    private Map<UUID, Building> buildingMap;

    public DomainController() {
        buildingMap = new HashMap<>();
    }

    public UUID addBuilding(String name){
        Building b = new Building(name);
        buildingMap.put(b.getId(), b);
        return b.getId();
    }

    public void removeBuilding(UUID id){
        buildingMap.remove(id);
    }

    @Override
    public Map<UUID, String> getBuildingInformation() {

        Map<UUID, String> buildings = new HashMap<>();
        buildingMap.forEach((k,v) -> buildings.put(k, v.getName()));

        return buildings;

    }

    @Override
    public Map<UUID, String> getSensorInformation(UUID buildingId) {
        List<Sensor> sensors = buildingMap.get(buildingId).getSensors();
        Map<UUID, String> senMap = new HashMap<>();

        for (Sensor s :
                sensors) {
            senMap.put(s.getId(), s.getName());
        }

        return senMap;
    }

    @Override
    public Map<UUID, String> getActuatorInformation(UUID buildingId) {

        List<Actuator> actuators = buildingMap.get(buildingId).getActuators();
        Map<UUID, String> actMap = new HashMap<>();

        for (Actuator a :
                actuators) {
            actMap.put(a.getId(), a.getName());
        }
        return actMap;
    }

    @Override
    public UUID addTemperatureSensor(UUID buildingId, String name) {
        return buildingMap.get(buildingId).addTempSensor(name);
    }

    @Override
    public UUID addCo2Sensor(UUID buildingId, String name) {
        return buildingMap.get(buildingId).addCo2Sensor(name);
    }

    @Override
    public void removeSensor(UUID buildingId, UUID sensorId) {

       buildingMap.get(buildingId).removeSensor(sensorId);

    }

    @Override
    public UUID addVentilationActuator(UUID buildingId, String name) {
        return buildingMap.get(buildingId).addVentActuator(name);
    }

    @Override
    public void removeActuator(UUID buildingId, UUID actuatorId) {

        buildingMap.get(buildingId).removeActuator(actuatorId);
    }
}
