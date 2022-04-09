package javabasicprogram;

import java.util.Scanner;

public class swapwith2var {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value 1");
		int val1=sc.nextInt();
		System.out.println("Enter value 2");
		int val2=sc.nextInt();
		val1=val1+val2;
		val2=val1-val2;
		val1=val1-val2;
		System.out.println("After swaping value 1 = "+val1);
		System.out.println("After swaping value 2 = "+val2);
	}
}
