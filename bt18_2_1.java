/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package learnjava;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class bt18_2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
try{
System.out.print("Nhap a, b: ");
Scanner input= new Scanner(System.in);
int a=input.nextInt();
int b=input.nextInt();
int c=a+b;
System.out.println("a + b = " + c);
int d=a-b;
System.out.println("a - b = " + d);
int e=a*b;
System.out.println("a x b = " + e);
int f=a/b;
System.out.println("a : b = " + f);
double g=Math.pow(a,b);
System.out.println("a ^ b = " + g);}
catch(Exception e){
                        System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.print("Loi"+ e.getMessage());
}
    }
    
}
