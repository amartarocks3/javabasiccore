package javabasicprogram;

import java.util.Scanner;

public class factor {
	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Prime factors are = ");
		
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
			System.out.println(i);
		}}
	}
}
