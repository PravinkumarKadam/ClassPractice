package anil;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("please provide number to check even or odd number = ");
		int a = sc.nextInt() ;
	
		if ( a %2==0 ) {
			System.out.println("number is even");
			
		}
		else {   System.out.println("Number is odd");
	}
		}
}
