package anil;
import java.util.Scanner;
public class GradingSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Inter Strundent Grade below check result= ");
		
		int StrundentGrade = sc.nextInt();
		
		if (StrundentGrade >= 90) {
			System.out.println("Congratulation you are passed exam in excellent manner ");
		}

		else if (StrundentGrade >= 35) {
			System.out.println(" Congratulation you clear exam ");
		}
		
		else {
			System.out.println("You need more efforts to clear the exam ");}}}
