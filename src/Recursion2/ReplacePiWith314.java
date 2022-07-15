package Recursion2;
import java.util.Scanner;
public class ReplacePiWith314 {

	public static String replace(String str) {
		
		if(str.length()<=1) {
			return str;
		}
		
		if(str.charAt(0)=='p'&&str.charAt(1)=='i'&&str.length()>=2) {
			String temp=3.14+replace(str.substring(2, str.length()));
		return temp;
		}
		
		
		String temp=str.charAt(0)+replace(str.substring(1, str.length()));
		
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the input String");
      String str=sc.nextLine();
      System.out.println( replace(str));                                
      
      
		
		
		
		
	}

}
