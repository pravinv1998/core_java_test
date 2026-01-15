public class ElectricCar implements CarControl {

    @Override
    public void turnRight() {
        System.out.println("Electric car turn right.");
    }

    @Override
    public void turnLeft() {
        System.out.println("Electric Car turn left");
    }
}
