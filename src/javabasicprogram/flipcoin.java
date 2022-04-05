package javabasicprogram;

import java.util.Scanner;

public class flipcoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of times to flip  the coin ");
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			int flip = (int)Math.floor(Math.random()*10)%2;
			System.out.println(flip);
		}
	}

}
