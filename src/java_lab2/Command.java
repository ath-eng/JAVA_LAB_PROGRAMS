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
public class Command {
    public static void main(String args[]) {
  int sum=0;
  for(int i=0;i<args.length;i++)
  {
    int val = Integer.parseInt(args[i]);
     sum = val+sum;
  }
  System.out.println(sum);
  }

    
}
