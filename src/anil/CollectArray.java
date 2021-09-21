package anil;

import java.util.Scanner;

public class CollectArray {
public static void main(String[] args) {
System.out.println("====  Q 1  ======");

	String ab= "Pravin Kadam";
	
	System.out.println("It is count of String : "+ab.length());
	System.out.println("It is count of Charecters in String : "+ ab.trim().length());

System.out.println("====  Q 2  ======");
// Q 2
	StringBuilder raj = new StringBuilder("Pravin Kadam");
     System.out.println("Given String is revers : "+raj.reverse());

     
System.out.println("====  Q 3  ======");

// Q 3
     
     StringBuffer ac = new StringBuffer( "aaraa");
     
     if(ac.equals(ac.reverse()))
      {
    	 System.out.println("Congrats given word is Palindrome");
      }
     else
      {
    System.out.println("Sorry Word is not Palindrome");	 
      }
     
     
 System.out.println("====  Q 4  ======");

  //4

	 int flag = 0;
	 int count = 0;
	 
     for (int i = 0; i<= ac.length()-1;i++)
     {    
    	 if(ac.charAt(i)== 'a')
    	 {
    		 ++flag;
    	 }
     	 else if(ac.charAt(i)=='r')
     	 {
     		 ++ count;
     	 }
     }
     System.out.println("Occurrence of 'a' in StringBuffer ac :"+ flag );
     System.out.println("Occurrence of 'r' in StringBuffer ac: "+ count);

     System.out.println("====  Q 5  ======");
     // 5

     System.out.println("Given String : " + ab);
     
     String k= "Pravin Kadam";
     
     if(ab == k)
     {
    	 System.out.println("Yes, Both Veriables point to some litrals");
     }
     else 
     {
    	 System.out.println("No, Both Veriables point to different litrals"); 
     }
     
     
     System.out.println("====  Q 6  ======");
//6
   int p =0;
    StringBuffer kk= new StringBuffer("Hello@every@one");
     for(int i=0;i<= kk.length()-1;i++)
     {      
    	 char ch = kk.charAt(i);
    	 if ( ch == '@' )
    	 {
    		 ++p;
    	 }
    	
     }
     
     System.out.println("Total World in Sentance : " + (p+1));
     
     
     System.out.println("====  Q 7  ======");
     //7 
   
     System.out.println("String Character are same :"+ac.equals(kk));
 //8
     Scanner sc = new Scanner(System.in);
   
     
     System.out.println("Please Provide First String input :");
     
     String  a1=sc.nextLine();
    
     System.out.println("Please Provide Second String input "); 
     String a2=sc.nextLine();
  	 
    System.out.println("Both String same contain : " + a1.equals(a2) );

    
    System.out.println("====  Q 9  ======");
//9
    
    
    
    System.out.println("non repeted cahracter : ");

}}
