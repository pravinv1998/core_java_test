
public class Main {
    public static void main(String[] args) {
        System.out.println("java test code....");

        Car car = new Car();
        car.carInfo("audi", "white", 5, 220);

        System.out.println(car.getCarInfo());
    }
}