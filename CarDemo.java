public class CarDemo {
    String carBrand;
    String carColour;
    int carAge;
    int carSpeed;

    public void carInfo(String carBrand, String colour, int age, int speed) {
        this.carBrand = carBrand;
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
