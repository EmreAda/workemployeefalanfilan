package dev.azmeal;

public class Customer extends Human {
    private int customerid;
    public Customer(String name, int age, int customerid) {
        super(name, age);
        this.customerid = customerid;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }
}
