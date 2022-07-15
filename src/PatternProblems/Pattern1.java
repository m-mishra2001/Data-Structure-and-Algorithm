package PatternProblems;

import java.util.Scanner;

//1 2 3
//1 2 3
//1 2 3


public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows and column");
		int row=sc.nextInt();
		int colm=sc.nextInt();
		int i=1;
		while(i<=row) {
			int j=1;
			while(j<=colm) {
				System.out.print(j+" ");
				++j;
			}
			System.out.println();
		    ++i;
		}
	}

}
