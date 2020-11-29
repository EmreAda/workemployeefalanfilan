package dev.azmeal;

enum Job {
    ENGINEER, ACCOUNTANT, TECHNICIAN, TEACHER, DRIVER, STORE_OWNER
}

enum Place {
    PARK, WORK_PLACE, RESTAURANT
}

public class Human {
    private String name;
    private int age;
    private double money = 1000;
    private double health = 20;
    private double hunger = 20;
    private double salary = 0;

    public Human(String name, int age) {
        this.name = name; this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getHunger() {
        return hunger;
    }

    public void setHunger(double hunger) {
        this.hunger = hunger;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addMoney(double money) {
        if (this.money + money < 0) {
            System.out.println("Paranız kalmadı oyun bitti!");
        } else {
            System.out.println("Yeni paranız: " + (this.money + money));
        }
    }

    public void addHealth(double health) {
        if (this.health+health >= 20) {
            this.health = 20;
            System.out.println("Canınız doldu! ");
        } else if (this.health+health <= 0) {
            this.health = 0;
            System.out.println("Öldünüz! Oyun bitti. ");
            System.exit(-1);
        } else {
            this.health=this.health+health;
            System.out.println("Yeni canınız: " + this.health);
        }
    }

    public void addHunger(double hunger) {
        if (this.hunger+hunger >= 20) {
            this.hunger = 20;
            System.out.println("Açlığınız fullendi! Doydunuz. ");
        } else if (this.hunger+hunger <= 0) {
            addHealth(-10);
            System.out.println("Açsınız canınız 10 azaldı. \n Yeni canınız: " + getHealth() + " ");
        } else {
            this.hunger = this.hunger+hunger;
        }
    }

}
