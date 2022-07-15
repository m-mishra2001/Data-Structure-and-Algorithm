package Recursion;

import java.util.Scanner;

public class Palindrom {
    static boolean palindrom(String str,int i,int j) {
    	 if(i>j) {
    		 return true;
    	 }
    	 if(str.charAt(i)!=str.charAt(j)) {
    		 return false;
    	 }
        return palindrom(str,i+1,j-1);
    	 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str=new String();
    Scanner sc=new Scanner(System.in);
    str=sc.next();
   if(palindrom(str,0,str.length()-1)) { 
	   System.out.println("String is palindrom");
   
   }else {
	   System.out.println("String is not palindrom");
   }
    
	}

}
