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
public class Prime {
       public static void main(String args[])
       {
         int n,i=1,p=0;
         Scanner s =new Scanner(System.in);
         n=s.nextInt();
         while(i<n)
         {
             if(n%i==0)
             {
                 p++;
             }
             i++;
         }
          if(p==2)
          {
           System.out.println("not number");
          }
          else
          {
              System.out.println("prime");
          }
       }
    
 
        }
       
    
