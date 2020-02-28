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
public class While {
 public static void main(String args[])
 {
  int sum=0,i=0;
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  while(i<n)
  {
   sum=sum+i;
   System.out.println("sum="+ sum);
   i++;
  }
  
 }
    
}
