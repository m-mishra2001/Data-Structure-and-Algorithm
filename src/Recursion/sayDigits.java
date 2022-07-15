package Recursion;

import java.util.Scanner;

public class sayDigits {
     static String arr[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
     static void sayD(int num) {
    	
    	 if(num==0)
    		 return;
    	 
    	 int digit=num%10;
    	 num=num/10;
    	 sayD(num);
    	 System.out.println(arr[digit]);
    	 return;
    				 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       sayD(num);
	}

}
