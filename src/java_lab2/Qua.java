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
public class Qua {
      public static void main(String args[])
       {
        double a = 2.3, b = 4, c = 5.6;
        double r1, r2;
        double d = b * b - 4 * a * c;
               if(d > 0)
        {
            r1 = (-b + Math.sqrt(d)) / (2 * a);
            r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", r1 , r2);
        }
        
        else if(d == 0)
        {
            r1 = r2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", r1);
        }
      
        else
        {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
        }
       }
  
}
