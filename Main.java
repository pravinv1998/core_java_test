
// import calculation.*;   //import this way or
// import java.util.Calendar;
// import java.util.Date;

import calculation.Calculation; // this way 

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

    }
}