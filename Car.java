public class Car {
    String carBrand;
    String carColour;
    int carAge;
    int carSpeed;

    public void carInfo(String brand, String colour, int age, int speed) {
        carBrand = brand;
        carColour = colour;
        carAge = age;
        carSpeed = speed;
    }

    public String getCarInfo() {

        // String[] carinfo = { carBrand, carColour };
        return carBrand;

    }
}
