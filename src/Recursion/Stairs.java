package Recursion;

import java.util.Scanner;

public class Stairs {

	static int countStairs(int num) {
		if(num<0)
			return 0;
		if(num==0)
			return 1;
		
		return countStairs(num-1)+countStairs(num-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(countStairs(num));
	}

}
