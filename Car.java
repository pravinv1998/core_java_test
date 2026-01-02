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

    public String getCarInfo(String carData) {

        switch (carData) {
            case "colour": {
                return carColour;

            }
            case "brand": {
                return carBrand;
            }
            default: {
                return "please send valid data";

            }

        }

    }
}
