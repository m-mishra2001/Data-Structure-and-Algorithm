package PatternProblems;

import java.util.Scanner;
//A A A 
//B B B 
//C C C 

//A B C 
//A B C 
//A B C 
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows and column");
		int row=sc.nextInt();
		int colm=sc.nextInt();
		
		int i=1;
		while(i<=row) {
			int j=1;
			char c='A';
			while(j<=colm) {
				System.out.print(c+" ");
				++j;
				++c;
			}
			System.out.println();
			++i;
			
		}
	}

}
