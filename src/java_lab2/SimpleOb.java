/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab2;

/**
 *
 * @author MCALAB01006
 */
public class SimpleOb {
    String y;
    SimpleOb(String y)
    {
        this.y=y;
        System.out.println("welcome to");
    }
    SimpleOb(String z,String x)
    {
        System.out.println(z);
        System.out.println(x);
 
    }
    public static void main(String a[])
    {
        String y="hai";
        String z="sngce";
        String x="mcc";
        SimpleOb o=new SimpleOb(y);
         SimpleOb o1=new SimpleOb(x);
        SimpleOb o2=new SimpleOb(z,x);
        
    }
    
}
