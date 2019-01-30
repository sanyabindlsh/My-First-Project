import java.util.*;
class Eg1{
	public static void main(String[] args){
	   Scanner in= new Scanner(System.in);
	   System.out.println("Enter first number");
	   int a = in.nextInt();
	   System.out.println("Enter second number");
	   while(true) {
	   	try{
	   	   int b = in.nextInt();
           System.out.println(a/b);
           break;
	   }
	   catch ( Exception e){
	   	    System.out.println(e);
	   }
	}
	   System.out.println("hellooooooooo");
	}
}