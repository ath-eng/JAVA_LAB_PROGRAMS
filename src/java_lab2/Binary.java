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
public class Binary {
    public static void main(String arg[])
    {
        int i=0,j=0,n;
        Scanner s =new Scanner(System.in);
        System.out.println("enter the limit");
        n=s.nextInt();
                    System.out.println("TRIANGLE");
                                System.out.println("_______");


                    System.out.println("1");

        for(i=0;i<n-1;i++)
        {
            System.out.print("1");
            
                  //    System.out.print("1");

           // System.out.println("\n");
           
             for(j=0;j<=i;j++)
             {
                 System.out.print("0");
                 
             }
                         System.out.print("1");

            System.out.println();
        }
          
        
    }
}
