package tuan2;

import java.util.Scanner;

public class coban {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Nhap a : ");
			double a=input.nextDouble();
			System.out.print("Nhap b : ");
			double b=input.nextDouble();
			if(a==0&&b==0) {System.out.print("PT co vo so nghiem !");}
			else if(a==0) {System.out.print("PT vo nghiem !");}
			else System.out.print("PT co 1 nghiem x= " + (-b/a));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
