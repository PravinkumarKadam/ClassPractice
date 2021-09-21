package sidhant;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Inter number to check Prime number upto : ");
		int g = sc.nextInt();
		String primeNumber = "";
		for (int i = 1; i <= g; i++) {
			int flag = 0;
			for (int a = i; a >= 1; a--) {
				if (i % a == 0) {
					flag = flag + 1;
				}
			}
			if (flag == 2) {
				primeNumber = primeNumber + i + " ";
			}
		}
		System.out.println("Prime number are given below : \n" + primeNumber);

System.out.println("------------------------------");

		System.out.println("Who many prime number between two number");
		System.out.println("Inter first Number :");
		int j, n1, n2;
		n1 = sc.nextInt();
		System.out.println("Inter second Number :");
		n2 = sc.nextInt();

		for (int i = n1; i <= n2; i++) {
			for (j = 2; j <= i; j++) {
				if (i % j == 0) {
					break;
				}

			}
			if (i == j) {
				System.out.println(j + " ");
			}

		}
	}
}
