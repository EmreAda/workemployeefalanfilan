package dev.azmeal;

public class EmployeeManager {

    public void startWork(Employee employee, Job job) {
        System.out.println("\"" + employee.getName() + "\" adlı kişi \"" + job + "\" işini yapmaya başladı.");
        switch (job) {
            case ACCOUNTANT:
                System.out.println("Muhasebecisiniz, matematikle aranız umarım iyidir.");
                employee.setSalary(1500);
                new Work().work(employee, Job.ACCOUNTANT);
                break;
            case DRIVER:
                System.out.println("Şöförsünüz, refleksler bu işte çok önemlidir.");
                employee.setSalary(1450);
                break;
            case TEACHER:
                System.out.println("Öğretmensiniz, Cumhuriyet sizden 'Fikri Hür, Vicdanı Hür, İrfanı Hür' nesiller ister.");
                employee.setSalary(2500);
                break;
            case ENGINEER:
                System.out.println("Mühendissiniz, ülkenin iskeletini kurma görevi sizindir.");
                employee.setSalary(2250);
                break;
            case TECHNICIAN:
                System.out.println("Teknisyensiniz, ülkenin iskeletini kurma görevi sizindir.");
                employee.setSalary(1600);
                break;
            case STORE_OWNER:
                System.out.println("Dükkan sahibisiniz, düzgün satış yapın.");
                employee.setSalary(1550);
                break;
            default:
                System.out.println("uh, oh.");
                break;
        }
    }
}
