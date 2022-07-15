package PatternProblems;

import java.util.Scanner;

//   1
//  121
// 12321
//1234321
public class PyramidPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows ");
		int row=sc.nextInt();
		
		int i=1;
		while(i<=row) {
			int space=row-i;
			while(space>0) {
				System.out.print(" ");
				--space;
			}
			
			int j=1;
			while(j<=i) {
				System.out.print(j);
				++j;
			}
			
			int k=i-1;
			while(k>0) {
				System.out.print(k);
				--k;
			}
            System.out.println();
			++i;
		}
		
		
		
		
		

	}

}
