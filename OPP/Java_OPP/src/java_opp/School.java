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
public abstract class School {
    // Abstract method (does not have a body)
    public abstract void ID();
    public abstract void NAME();
    public abstract void SURNAME();
    // Regular method
    public void lesson(String a){
        System.out.println(a);
        
    }
}
