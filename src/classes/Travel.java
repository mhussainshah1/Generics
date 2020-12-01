package classes;

class Elephant {
}

class Zebra {
}

class Robot {

}

public class Travel {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Crate<Elephant> crateForElephant = new Crate<>();
        crateForElephant.setContents(elephant);
        Elephant inNewHome = crateForElephant.getContents();

        Crate<Zebra> crateForZebra = new Crate<>();

        Robot joeRobot = new Robot();
        Crate<Robot> robotCrate = new Crate<>();
        robotCrate.setContents(joeRobot);
        Robot atDestination = robotCrate.getContents();

        /**
         *         Robot joeRobot = new Robot();
         *         Crate robotCrate = new Crate();
         *         robotCrate.setContents(joeRobot);
         *         Robot atDestination = (Robot)robotCrate.getContents();
         */
        Integer numPounds = 15_000;
        SizeLimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate<>(elephant, numPounds);

//        SizeLimitedCrate<Elephant, int> c2 = new SizeLimitedCrate<>(elephant, numPounds);
    }
}
