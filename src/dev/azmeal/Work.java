package dev.azmeal;

import java.util.Scanner;

public class Work {

    public void work(Employee employee, Job job) {
        System.out.println("sa");
        Scanner scan = new Scanner(System.in);
        boolean isWorking = true;
        do {
            System.out.println("Hoş geldin! " + employee.getName() + " (" + employee.getEmployeeID() + ") \n" + "" +
                    "Mesleğin: " + job + "\n" +
                    "Ne Yapmak İstersin?(1: işe git, 2: yemek ye, 3: parka git, q: çık): ");
            String input = scan.next();
            if (input.equalsIgnoreCase("q")) {
                System.exit(0);
                System.out.println("Görüşürüz !");
            } else {
                doWork(input, employee);
            }
        } while (isWorking);
    }

    private void doWork(String input, Employee employee) {
        switch(input) {
            case "1":
                System.out.println("İşe gittiniz, kazandığınız para: " + employee.getSalary() + "\nYeni açlığınız: " + (employee.getHunger()-5) + "Toplam paranız: " + (employee.getMoney()+employee.getSalary()));
                employee.addMoney(employee.getSalary()); employee.addHunger(-5);
                break;
            case "2":
                System.out.println("Restoranta hoş geldiniz!");
                new Restaurant().showMenu(employee, Place.RESTAURANT);
                break;
            case "3":
                System.out.println("Parka hoş geldiniz!");
                new Restaurant().showMenu(employee, Place.PARK);
                break;
            default:
                System.out.println("uh, oh");
                break;

            //yarın case 2,3 ü tamamla
            //case 2 için yemekleri detaylandır
            //case 3 için yemek entegre et
        }

    }
}
