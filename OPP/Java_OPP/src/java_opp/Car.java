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
public class Car {

    //property
    String model;
    String color;
    
    //Constructor
    
     public Car(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Model: " + model + " Money : " + color);
         
        if(color.matches("blue")){
            System.out.println("Money: 9.000");
        } 
        else{
            System.out.println("Money: 10.000");
        }
    }  
}
