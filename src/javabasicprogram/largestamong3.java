package javabasicprogram;

import java.util.Scanner;

public class largestamong3 {
	public static void main(String[] args) {
		System.out.println("Enter three values:");
		Scanner sc = new Scanner(System.in);
		int val1 = sc.nextInt();
		int val2 = sc.nextInt();
		int val3 = sc.nextInt();
		if(val1 >= val2 && val1 >= val3) {
			System.out.println(val1+" is the largest element");
		}
		else if(val2 >= val2 && val2 >= val3) {
			System.out.println(val2+" is the largest element");
		}
		else {
			System.out.println(val3+" is the largest element");
		}
	}
}
