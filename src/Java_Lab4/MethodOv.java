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
public class MethodOv {
      int pno;
    String name;
    void read()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter publisher no");
        pno=s.nextInt();
        System.out.println("enter publisher name");
        name=s.next();
    }
    void display()
    {
        System.out.println("enter publisher no is "+ pno);
        System.out.println("enter publisher name is " + name);
    }
        
}
class Book extends MethodOv
{
    int price;
    String bname;
    void read()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter Book price ");
        price=s.nextInt();
        System.out.println("enter Book name");
        bname=s.next();
        super.read();
    }
    void display()
    {
        System.out.println("enter Book name "+bname);
        System.out.println("enter book price "+price);
        super.display();
    }
}
class Issue extends Book
{
    String iname;
    void read()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter issue name");
        iname=s.next();
        super.read();
    }
    void display()
    {
        System.out.println("enter issue name "+iname);
        super.display();
    }
    public static void main(String args[])
    {
        Issue I=new Issue();
        I.read();
        I.display();
    }
}