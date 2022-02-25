package tuan2;

import java.util.Scanner;

public class bac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Nhap a : ");
			double a=input.nextDouble();
			System.out.println("Nhap b : ");
			double b=input.nextDouble();
			System.out.println("Nhap c : ");
			double c=input.nextDouble();
			if(a==0) {
				if(b==0) {
					if(c==0) System.out.println("Pt co vo so nghiem");
					else System.out.println("Pt vo nghiem");
				}
				else System.out.println("Pt co nghiem x= "+ (-c/b));
			}
			else {
			double del=b*b-4*a*c;
			if(del==0) { System.out.println("Pt co nghiem kep x= "+ (-b-Math.sqrt(del))/(2*a));} else
				if (del>0) {System.out.println("Pt co nghiem x1= "+ (-b-Math.sqrt(del))/(2*a));
							System.out.println("Pt co nghiem x2= "+ (-b+Math.sqrt(del))/(2*a));} else
							{System.out.println("PT da cho vo nghiem");}	}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("Loi");
		}
	}

}
