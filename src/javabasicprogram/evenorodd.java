package javabasicprogram;

import java.util.Scanner;

public class evenorodd {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}
		
	}
}
