import java.util.*;
class Cards{
	String value;
	Cards(String c){
	   value = c;
	}
	String getDescription(){
	   String s1="", s2="";
	   char l = value.charAt(0);
	   char r = value.charAt(1);
	   if(l=='Q')
	   s1="Queen";
	   if(l=='K')
	   s1="King";
	   if(r=='H')
	   s2="Hearts";
	   if(r=='D')
	   s2="Diamonds";
	   if(r=='S')
	   s2="Spades";
	   if(r=='C')
	   s2="Clubs";
	   return(s1+ "of" +s2);
	} 
}
class Cards_main{
	public static void main (String[] args)
	{
	   Scanner in = new Scanner(System.in);
	   String x;
	   System.out.println("Enter a string of required format :");
	   x=in.next();
	   Cards c1=new Cards(x);
	   System.out.println(c1.getDescription());
	}
}