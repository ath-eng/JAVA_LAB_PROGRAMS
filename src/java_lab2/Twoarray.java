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

public class Twoarray {
    public static void main(String arg[])
    {
        int i,j,x=0;
        int a[][]=new int[3][3];
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
            {
                a[i][j]=x;
        x++;
            }
    
    for(i=0;i<3;i++)
    {
    for(j=0;j<3;j++)
        System.out.print("\na[i][j]="+ a[i][j]);
    System.out.println("\n");
    }
    
    
        
    
}
}
