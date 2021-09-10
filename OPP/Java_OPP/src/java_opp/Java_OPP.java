/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_opp;

import java.util.Scanner;

/**
 *
 * @author sefa_
 */
public class Java_OPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" ____  ____  ____  ____ \n"
                + "||S ||||E ||||F ||||A ||\n"
                + "||__||||__||||__||||__||\n"
                + "|/__\\||/__\\||/__\\||/__\\|");
        boolean start = true;
        while (start) {
            System.out.println("1-)Constructor\n2-)Encapsulation\n3-)Inheritace\n4-)Polymorphism\n5-)Abstract\n6-)Interface\nQUIT = Q");
            Scanner scan = new Scanner(System.in);
            System.out.print(" USE: ");
            String guess = scan.nextLine();
            if (guess.matches("1")) {
                System.out.println("Enter model: ");
                String model = scan.nextLine();
                System.out.println("Enter color");
                String color = scan.nextLine();
                new Car(model, color);
                System.out.println("Constructor Write");
                Car car = new Car(model, color);
                //System.out.println(car.model); no error
                System.out.println(car.model);

            } else if (guess.matches("2")) {
                System.out.println("How many ram: ");
                String ram = scan.nextLine();
                System.out.println("How many ssd: ");
                String ssd = scan.nextLine();
                new Computer(ram, ssd);
                //System.out.println(computer.ram); //error because private 
                System.out.println("Getter - Setter Write ");
                Computer computer = new Computer(ram, ssd);
                System.out.println("Getter");
                System.out.println(computer.getRam());
                System.out.println("Change Ram Setter ");
                computer.setRam("4");
                System.out.println(computer.getRam());

            } else if (guess.matches("3")) {
                new AddTools("2", "3");
                

            } else if (guess.matches("4")) {
                
                System.out.println("Static Polymorhism");
                MathCal c = new MathCal();
                System.out.println(c.sum());
                System.out.println(c.sum(2, 3));
                System.out.println(c.sum(1, 2, 5));
                System.out.println("Dynamic Polymorhism");
                Voleyball v = new Voleyball();
                System.out.println(v.ball("a"));


            } else if (guess.matches("5")) {
                SefaStudent sf = new SefaStudent();
                sf.ID();
                sf.NAME();
                sf.SURNAME();
                

            } else if (guess.matches("6")) {
                FoodCook fd = new FoodCook();
                fd.a = "112";
                fd.b = "22";
                System.out.println(fd.a + " " + fd.b);
                

            } else if (guess.matches("Q")) {
                System.out.println("Application Quit...");
                start = false;
            } else {
                System.out.println("Wrong key");
            }

        }
    }
}
