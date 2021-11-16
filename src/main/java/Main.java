public class Main {


    public static void main(String[] args) {

        Building testBuild = new Building("Test Building");

        testBuild.addCo2Sensor("co2");
        testBuild.addTempSensor("Temp1");
        testBuild.addVentActuator("Vent1");

        System.out.println(testBuild);
    }
}
