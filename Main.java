
// import calculation.*;   //import this way or
// import java.util.Calendar;
// import java.util.Date;

import calculation.Calculation; // this way 
import opps.encapsulation.EncapsulationDemo;
import opps.inheritance.Bike;
import opps.inheritance.Car;

class InnerMain {
    public void innerMain() {
        System.out.println("inner main method");
    }
}

public class Main {
    public static void main(String[] args) {
        // System.out.println("java test code....");

        // Car car = new Car();
        // car.carInfo("audi", "yellow", 5, 220);

        // System.out.println(car.getCarInfo("brand"));

        // InnerMain inMain = new InnerMain();
        // inMain.innerMain();

        // call add method from calculation package
        Calculation calc = new Calculation("namedata");
        System.out.println(calc.getData());
        calc.data = "mydata";
        System.out.println(calc.getData());
        // calc.data = "name";
        // calc.add(5, 10);
        // calc.setData("getter-setters");
        // System.out.println(calc.getData());

        // Calculation dataCal = new Calculation(); // one class can have multiple
        // objects
        // dataCal.add(10, 10);

        // date inbuilt class
        // Date dt = new Date();
        // System.out.println(dt.getTime());

        // ===========================**********OPPS*********===========================

        // Encapsulation
        System.out.println("==============Encapsulation==============");
        EncapsulationDemo encapsulationDemo = new EncapsulationDemo();
        encapsulationDemo.encapsulationDemo("Pravin Vargad", "8308383832");

        // inheritance
        System.out.println("\n\n==============Inheritance==============");
        Bike bike = new Bike("maruti suzuki", 150, "no");
        bike.bikeInheritanceDemo();
        // bike.setBrand("Audi");
        // System.out.println(bike.brand); // only work if parent class variable is
        // public
        // System.out.println(bike.getBrand()); // use getter and setter to access
        // private varible - encapsulation

        Car car = new Car("Audi", 200, 5);
        System.out.println(car.getDoors());
        car.displayInfo();

    }

}