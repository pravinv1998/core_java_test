import calculation.*;

class InnerMain {
    public void innerMain() {
        System.out.println("inner main method");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("java test code....");

        Car car = new Car();
        car.carInfo("audi", "yellow", 5, 220);

        System.out.println(car.getCarInfo("colour"));

        InnerMain inMain = new InnerMain();
        inMain.innerMain();

        // call add method from calculation package
        Calculation calc = new Calculation();
        calc.add(5, 10);

    }
}