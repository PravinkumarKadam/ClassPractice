package anil;
import java.util.Scanner;
public class EvenAndOddNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Inter number to check even and odd Number = ");
		int a = sc.nextInt();

		String output = (a % 2 == 0) ? "evernNumbe" : "oddNumber";

		System.out.println(output);

	}

}

