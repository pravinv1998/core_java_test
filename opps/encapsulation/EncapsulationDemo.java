package opps.encapsulation;

class Customer {
    private String customerName;
    private String customerMobNumber;

    public Customer() { // constructor
        this.customerName = "default name";
        this.customerMobNumber = "0000000000";
    }

    // setter for customer name
    public String getCustomerName() {
        return customerName;
    }

    // getter for customer name
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // getter for customer mobile number
    public String getCustomerMobNumber() {
        return customerMobNumber;
    }

    // setter for customer mobile number
    public void setCustomerMobNumber(String customerMobNumber) {
        this.customerMobNumber = customerMobNumber;
    }

    public void showCustomerDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Num: " + customerMobNumber);
    }

}

public class EncapsulationDemo {
    public void encapsulationDemo(String custName, String custMobNum) {
        Customer customer = new Customer();
        System.out.println("Customer data before getter and setterS: ");
        customer.showCustomerDetails(); // call method before getter and setter

        // set customer name through setter
        customer.setCustomerName(custName);
        // set customer mobile number through setter
        customer.setCustomerMobNumber(custMobNum);

        System.out.println("Cstomer Data after getter and setter: ");
        customer.showCustomerDetails();
    }
}
