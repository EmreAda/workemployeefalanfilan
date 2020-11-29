package dev.azmeal;

public class Main {

    public static void main(String[] args) {
	    Employee employee = new Employee("Recep Emre Ada", 17, 31);
        EmployeeManager employeeManager = new EmployeeManager();
        // available jobs: ENGINEER, ACCOUNTANT, TECHNICIAN, TEACHER, DRIVER, STORE_OWNER
	    employeeManager.startWork(employee, Job.ACCOUNTANT);


    }
}
