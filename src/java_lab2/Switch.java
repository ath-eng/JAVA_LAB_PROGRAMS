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
public class Switch {
 public static void main(String arg[])
 {
  Scanner s=new Scanner(System.in);
  int ch;
  int mark;
  System.out.println("Enter the total mark");
  mark=s.nextInt();
  ch=mark/10;
  switch(ch)
  {
      case 10:
      case 9:
      case 8:System.out.println("excellent");
             break;
      case 7:
      case 6:System.out.println("good");
             break;
      case 5:
      case 4:System.out.println("pass");
             break;
      default:System.out.println("failed");
  }
 }
    
}
