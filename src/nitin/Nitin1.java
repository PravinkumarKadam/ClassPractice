package nitin;

public class Nitin1 {
	
	public Nitin1() {
		
		System.out.println("no arg constructor parent");
	}
	
	public Nitin1(int a) {
		this();
		System.out.println("arg constructor parent");
	}
	
	public static void main(String[] args) {

	Nitin1 ni= new Nitin1();
		
	}
}
