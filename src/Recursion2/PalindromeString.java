package Recursion2;
import java.util.Scanner;
public class PalindromeString {
    
	static boolean palindrome(String str,int i,int j) {
		boolean ans;
		if(i>j) return true;
		
		if(str.charAt(i)==str.charAt(j)) {
			 ans=palindrome(str,++i,--j);
		}
		else {
			return false;
		}
		return ans;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		System.out.println(palindrome(str,0,str.length()-1));		

	}

}
