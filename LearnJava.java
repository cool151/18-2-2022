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
public class LearnJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                double chuvi;
		System.out.print("Nhap ban kinh: ");
		Scanner input = new Scanner(System.in);
		double d=input.nextDouble();
		chuvi = d*2*3.14159;
		System.out.print("Chu vi la "  +  chuvi);
    }
    
}
