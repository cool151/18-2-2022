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
public class bt18_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
try{
System.out.print("Nhap a, b: ");
Scanner input= new Scanner(System.in);
byte a=input.nextByte();
byte b=input.nextByte();

System.out.println("a + b = " + (a+b));

System.out.println("a - b = " + (a-b));

System.out.println("a x b = " + (a*b));

System.out.println("a : b = " + (a/b));
double g=Math.pow(a,b);
System.out.println("a ^ b = " + g);}
catch(Exception e){
                        System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.print("Loi"+ e.getMessage());
}
    }
    
}
