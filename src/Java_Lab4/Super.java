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
public class Super {
    int l,b;
    void read()
    {
        Scanner s=new Scanner(System.in);
        l=s.nextInt();
        b=s.nextInt();
    }
    void area()
    {
        System.out.println(l*b);
    }
    
}
class Box extends Super
{
    int h;
    void read()
    {
        Scanner s=new Scanner(System.in);
        super.read();
        h=s.nextInt();
    }
    void volume()
    {
        System.out.println(l*b*h);
    }
    public static void main(String args[])
    {
        Box b=new Box();
        b.read();
        b.volume();
    }
}