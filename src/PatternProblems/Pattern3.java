package PatternProblems;

import java.util.Scanner;

//*
//* *
//* * *
//* * * *

//1
//2 2
//3 3 3
//4 4 4 4
public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows ");
		int row=sc.nextInt();
		
		int i=1;
		while(i<=row) {
			int j=1;
			while(j<=i) {
				System.out.print(i+" ");
				++j;
			}
			System.out.println();
			++i;
		}

	}

}
