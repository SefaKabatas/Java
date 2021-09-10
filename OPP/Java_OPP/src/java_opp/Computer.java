/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_opp;

/**
 *
 * @author sefa_
 */
public class Computer {

    //private
    //property
    private String ram;
    private String ssd;
    private int money = 10000;

    //Constructor
    public Computer(String ram, String ssd) {
        this.ram = ram;
        this.ssd = ssd;
        this.money = money;
        if (!(ssd.matches("1"))) {
            money += 1000;
        } else {
            money += 500;
        }
        System.out.println("Money: " + money);
    }
    //Getter Setter

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }
}
