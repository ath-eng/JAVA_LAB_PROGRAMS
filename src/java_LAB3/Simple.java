/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_LAB3;

/**
 *
 * @author MCALAB01006
 */
public class Simple {
     private final String i;
    Simple(String i)
    {
        this.i=i;
        System.out.println(i);
    }
    public static void main(String args[])
    {
     String i="Hello World";
     Simple S;
        S= new Simple(i);
    }
    
}
