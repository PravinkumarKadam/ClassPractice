package sidhant;

public class ConvertStringToChar {

	public static void main(String[] args) {
		String p = "Pravin";

		for (int i = 0; i <= p.length() - 1; i++) {
			System.out.println("CharAt " + i + " : " + p.charAt(i) + " ");
		}
		
		System.out.println("------------------------");
		
		String	 j = "45.25f";
		String k = "5";
		String t = "true" ; 
		String n = "1.001d" ;
		String o = "2345" ;
		String w = "124" ;
		
		int i = 23;
		String a = Integer.toString(i); // Integer convert into string
	// String convert in all possible data type
		float b = Float.parseFloat(j);
		byte c = Byte.parseByte(k);
		 // char  d = Character.parseCharacter(y); // we can't  convert String to Character
		boolean e = Boolean.parseBoolean(t);
		double  f =  Double.parseDouble(n);
		long  g = Long.parseLong(o);
		short  h = Short.parseShort(w);
		System.out.println( a +" "+ b + " " + c +" "+ e +" "+ f + " " + g +" "+ h );

	}
}
