package javabasicprogram;
import java.util.Random;
import java.util.Scanner;

public class percentheadtail {

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counthead=0,counttail=0;
		float result=0;
		Random rand = new Random(); 
		System.out.println("Enter number of times to flip  the coin ");
		int a = sc.nextInt();
		
		for(int i=0;i<a;i++) {
			double res = rand.nextDouble();
			if(res<0.5) {
				++counttail;
				System.out.println("Tail");
			}
			else
			{
				System.out.println("Head");
				++counthead;
			}
		
		}
		result=(counthead/counttail)*100;
		System.out.println("Head vs tail percent = "+ result);
	}}

