package PatternProblems;

import java.util.Scanner;

//3 2 1
//3 2 1
//3 2 1

public class Pattern2 {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows and  column");
		int rows=sc.nextInt();
		int colm=sc.nextInt();
		int i=1;
		while(i<=rows) {
			int j=colm;
			while(j>0) {
				System.out.print(j+" ");
				--j;
			}
			System.out.println();
			++i;
		}
		
	}
	
}
