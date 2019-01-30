import java.util.*;
class Eg{
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
	       catch ( InputMismatchException e){
	   	        System.out.println(e);
	       }
	       catch (Exception e){
	       	   System.out.println(e);
	       }
	    }
	       System.out.println("hellooooooooo");
	}
}