package PatternProblems;

import java.util.Scanner;

//          *
//        * *
//      * * *
public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows and column");
		int row=sc.nextInt();
		int colm=sc.nextInt();
		
		int i=1;
		while(i<=row) {
			int j=colm-i;
			while(j>=1) {
				System.out.print(" ");
				--j;
			}
			int star=1;
			while(star<=i) {
				System.out.print("*"+"");
				++star;
			}
			System.out.println();
			++i;
		}
	}

}
