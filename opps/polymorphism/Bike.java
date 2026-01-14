package opps.polymorphism;

public class Bike extends Vehicle {
    private String hasCarrier;

    public Bike(String brand, int speed, String hasCarrier) {
        super(brand, speed); // important to get initialization for private variable
        this.hasCarrier = hasCarrier;
    }

    public String getHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(String hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void start() {
        System.out.println("Start Bike");
    }

    public void start(String bike) {
        System.out.println("Start Bike" + bike);
    }

    public void bikeInheritanceDemo() {
        System.out.println(hasCarrier);
        System.out.println(getBrand());
        System.out.println(getSpeed());
    }

}
