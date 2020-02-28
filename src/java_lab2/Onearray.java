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
import java.util.*;
public class Onearray {
    public static void main(String args[])
    {
        int i;
        int a[]=new int[5];
        Scanner s=new Scanner(System.in);
        System.out.println("enter elements");
        for(i=0;i<5;i++)
            a[i]=s.nextInt();
        System.out.println("display elements");
        for(i=0;i<5;i++)
            System.out.println(a[i]);
    }
    
}
