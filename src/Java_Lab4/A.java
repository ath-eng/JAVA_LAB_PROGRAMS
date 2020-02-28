/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Lab4;

/**
 *
 * @author MCALAB01006
 */import java.util.*;
public class A {
   int i,j;
    void read()
    {
        Scanner s=new Scanner(System.in);
        i=s.nextInt();
        j=s.nextInt();
    }
    void display()
    {
        System.out.println(i+j);
    }
}
class B extends A
{
 int k;
 void read()
 {
     super.read();
     Scanner s=new Scanner(System.in);
     k=s.nextInt();
 }
 void display()
 {
     super.display();
     System.out.println(i+j+k);
 }
 public static void main(String a[])
 {
     B b=new B();
     b.read();
     b.display();
 }
}