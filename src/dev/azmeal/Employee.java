package dev.azmeal;

public class Employee extends Human {
    private int employeeID;
    public Employee(String name, int age, int employeeID) {
        super(name, age);
        this.employeeID = employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getEmployeeID() {
        return employeeID;
    }





}
