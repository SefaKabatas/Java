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
public class AddTools extends Computer{
    //error because we haven't got constructor.
    String mouse="Logitech 101";
    String keyboard = "Logitech 102";
    Computer c;
    public AddTools(String ram, String ssd) {
        super(ram, ssd);
        this.mouse = mouse;
        this.keyboard = keyboard;
        if(!(ram.matches("1"))){
            System.out.println(gift("Gift: "  + mouse, keyboard)); 
        }
        else{
            System.out.println(ram + " " + ssd);
        }

    }  
    public String gift(String mouse, String keyboard){
        this.mouse = mouse;
        this.keyboard = keyboard;
        String giftw = mouse + " " + keyboard;
        return giftw;
        
    }
}

