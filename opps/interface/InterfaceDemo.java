public class InterfaceDemo {
    public static void main(String[] args) {
        // ElectricCar electricCar = new ElectricCar();
        // electricCar.turnLeft();
        // electricCar.turnRight();
        //

        CarControl eleCarControl = new ElectricCar();
        eleCarControl.turnLeft();
        eleCarControl.turnRight();

        CarControl spoCarControl = new SportCar();
        spoCarControl.turnLeft();
        spoCarControl.turnRight();

    }
}
