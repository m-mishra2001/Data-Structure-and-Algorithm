package Recursion;

import java.util.Scanner;

public class Counting {

	
	static int forwardCount(int n) {
		if(n==0) {
			System.out.println(0);
			return n; 
		}
		forwardCount(n-1);
		System.out.println(n);
		return n;
	}
	
	static int count(int n) {
		
		
		if(n==0) {
		return 0;	
		}
		
		System.out.println(n);
		return count(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n;
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
//    System.out.println(count(n));
    forwardCount(n);
	}

}
