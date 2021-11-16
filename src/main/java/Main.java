import java.util.UUID;

public class Main {


    public static void main(String[] args) {



        DomainController dc = new DomainController();

        UUID testBuilding1 = dc.addBuilding("a");
        UUID testBuilding2 = dc.addBuilding("b");
        UUID testBuilding3 = dc.addBuilding("c");

        UUID testSens1 = dc.addCo2Sensor(testBuilding1, "testSens1");
        UUID testSens2 = dc.addCo2Sensor(testBuilding1, "testSens2");


        System.out.println(dc.getSensorInformation(testBuilding1));



    }
}
