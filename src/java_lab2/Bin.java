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
public class Bin {
    public static void main(String arg[])
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter limit");
        n=s.nextInt();
        System.out.println("enter elements");
        for( int i=0;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
           System.out.print(j);
            }
            System.out.println("");
        }
            
    }
    
}
