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
public class For {
 public static void main(String arg[])
 {
  int  sum=0,i;
  Scanner s =new Scanner(System.in);
  int n=s.nextInt();
  for(i=0;i<=n;i++)
  sum=sum+i;
  System.out.println("sum="+sum);
 }    
}
