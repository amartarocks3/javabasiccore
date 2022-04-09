package javabasicprogram;

import java.util.Scanner;

public class quotientandremender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quo=0,rem=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value 1");
		int val1=sc.nextInt();
		System.out.println("Enter value 2");
		int val2=sc.nextInt();
		quo=val1/val2;
		rem=val1%val2;
		System.out.println("quotient = "+quo);
		System.out.println("remender = "+rem);
	}

}
