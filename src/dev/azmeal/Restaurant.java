package dev.azmeal;

import java.util.Scanner;

public class Restaurant {
    public void showMenu(Human human, Place place) {
        Scanner scan = new Scanner(System.in);
        switch (place) {
            case RESTAURANT:
                System.out.print("Menü:\n1: Mercimek Çorbası (5₺)\n2: Kıymalı Pide (8₺)\n3: Kavurma (20₺)\n4: Adana (30₺)\n5: Hamburger (35₺)\n6: Antrikot Biftek (80₺) q: Çıkış  ");
                String input = scan.next();
                switch (input) {
                    case "1":
                        System.out.println("Mecimek Çorbası İçtiniz \nYeni Açlığınız: " + ((human.getHunger() + 3 > 20) ? 20 : human.getHunger() + 3) );
                        human.addMoney(-5); human.addHunger(3);
                        break;
                    case "2":
                        System.out.println("Kıymalı Pide Yediniz \nYeni Açlığınız: " + ((human.getHunger() + 5 > 20) ? 20 : human.getHunger() + 5) );
                        human.addMoney(-8); human.addHunger(5);
                        break;
                    case "3":
                        System.out.println("Kavurma Yediniz \nYeni Açlığınız: " + ((human.getHunger() + 6 > 20) ? 20 : human.getHunger() + 6) );
                        human.addMoney(-20); human.addHunger(6);
                        break;
                    case "4":
                        System.out.println("Adana Yediniz\nYeni Açlığınız: " + ((human.getHunger() + 8 > 20) ? 20 : human.getHunger() + 8) );
                        human.addMoney(-30); human.addHunger(8);
                        break;
                    case "5":
                        System.out.println("Hamburger Yediniz\nYeni Açlığınız: " + ((human.getHunger() + 9 > 20) ? 20 : human.getHunger() + 9) );
                        human.addMoney(-35); human.addHunger(9);
                        break;
                    case "6":
                        System.out.println("Antrikot Biftek Yediniz\nYeni Açlığınız: " + ((human.getHunger() + 10 > 20) ? 20 : human.getHunger() + 10) );
                        human.addMoney(-80); human.addHunger(10);
                        break;
                    case "q":
                        System.out.println("Restoranttan çıkılıyor.");
                        break;
                    default:
                        System.out.println("uh, oh!");
                        break;
                }
                break;
            case PARK:
                System.out.print("Menü:\n1: Dondurma (3₺), 2: Kola (5₺), 3: Çikolata (2,5₺), q: çıkış  ");
                String input2 = scan.next();
                switch (input2) {
                    case "1":
                        System.out.println("Dondurma Yediniz \nYeni Paranız: " + (human.getMoney()-3) + "\nYeni Açlığınız: " + ((human.getHunger() + 0.5 > 20) ? 20 : human.getHunger() + 0.5));
                        human.addMoney(-3); human.addHunger(0.5);
                        break;
                    case "2":
                        System.out.println("Kola İçtiniz \nYeni Paranız: " + (human.getMoney()-5) + "\nYeni Açlığınız: " + ((human.getHunger() + 0.3 > 20) ? 20 : human.getHunger() + 0.3));
                        human.addMoney(-5); human.addHunger(0.3);
                        break;
                    case "3":
                        System.out.println("Çikolata Yediniz \nYeni Paranız: " + (human.getMoney()-2.5) + "\nYeni Açlığınız: " + ((human.getHunger() + 0.6 > 20) ? 20 : human.getHunger() + 0.6));
                        human.addMoney(-2.5); human.addHunger(0.6);
                        break;
                    case "q":
                        System.out.println("Parktan çıkılıyor.");
                        break;
                    default:
                        System.out.println("uh, oh!");
                        break;
                }
                break;
            default:
                System.out.println("uh, oh!");
                break;
        }
    }
}
