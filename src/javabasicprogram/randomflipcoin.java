package javabasicprogram;

import java.util.Random;
import java.util.Scanner;

public class randomflipcoin {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Random rand = new Random(); 
	System.out.println("Enter number of times to flip  the coin ");
	int a = sc.nextInt();
	
	for(int i=0;i<a;i++) {
		double res = rand.nextDouble();
		if(res<0.5) {
			System.out.println("Tail");
		}
		else
		{
			System.out.println("Head");
		}
	}
}}
