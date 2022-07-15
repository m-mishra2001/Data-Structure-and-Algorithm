package PatternProblems;

import java.util.Scanner;

//1
//2 3
//3 4 5 
//4 5 6 7 ++count in 2nd while loop

//
//1 
//2 1 
//3 2 1 
//4 3 2 1 --count in 2nd while loop
public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int row=sc.nextInt();
		int i=0;
		while(i<=row) {
			int j=1;
			int count=i;
			while(j<=i) {
				System.out.print(count+" ");
				--count;
				++j;
			}
			System.out.println();
			++i;
		}

	}

}
