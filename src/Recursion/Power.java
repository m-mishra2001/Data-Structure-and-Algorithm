package Recursion;

import java.util.Scanner;

public class Power {
     
	static int power(int a,int b) {
		
		if(b==0)
			return 1;
		if(b==1)
			return a;
		int ans =power(a,b/2);
		if(b%2==0) {
			return ans*ans ;
		}
			return a*ans*ans;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
     int ans=power(a,b);
     System.out.println("The power is "+ans );
	}

}
