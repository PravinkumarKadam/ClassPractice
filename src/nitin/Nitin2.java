package nitin;

public class Nitin2 extends Nitin1 {

	Nitin2() {
		super(10);

		System.out.println("NO-arg Child");
	}

	Nitin2(int a) {

		this();
		System.out.println("arg chlid");
	}

	public static void main(String[] args) {

		Nitin2 ni = new Nitin2();
	}

}