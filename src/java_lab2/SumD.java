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
public class SumD {
    public static void main(String arg[])
    {
        int n,m=0,sum=0;
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        while(n>0)
        {
            m=n%10;
            sum=sum+m;
            n=n/10;
        }
        System.out.println("sum=" + sum);
    }
    
}
