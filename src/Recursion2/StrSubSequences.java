package Recursion2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class StrSubSequences {
 
	public static void subsequence(ArrayList<String> result,String str,int indx,String newStr) {
		
		if(indx==str.length()) {
			result.add(newStr);
			return;
		}
		//to add
		subsequence(result,str,indx+1,str.charAt(indx)+newStr);
		//not to add
		subsequence(result,str,indx+1,newStr);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		ArrayList<String> result=new ArrayList<String>();
		
		String newStr="";
		subsequence(result,str,0,newStr);
       
       
	}

}
