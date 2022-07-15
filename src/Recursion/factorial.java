package Recursion;

import java.util.Scanner;

public class factorial {
  
	public static  int fact(int n) {
		
		if(n==0)
			return 1;
		int f=n*fact(n-1);
		return f; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int n=sc.nextInt();
      int f=fact(n);
      System.out.println(f);
	}

}
