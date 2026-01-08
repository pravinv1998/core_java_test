package opps.inheritance;

public class Bike extends Vehicle {
    private String hasCarrier;

    public Bike(String brand, int speed, String hasCarrier) {
        super(brand, speed); // important to get initialization for private variable
        this.hasCarrier = hasCarrier;
    }

    public void bikeInheritanceDemo() {
        System.out.println(hasCarrier);
        System.out.println(getBrand());
        System.out.println(getSpeed());
    }

}
