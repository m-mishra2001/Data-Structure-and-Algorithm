package PatternProblems;

import java.util.Scanner;

public class DabangPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number of rows");
		 int row=sc.nextInt();
		 int temp=0;
		 int i=1;
		 while(i<=row) {
			 int j=1;
			 while(j<=(row-temp)) {
				 System.out.print(j);
				 ++j;
			 }
			 int star=2*(i-1);
			 while(star>0) {
				 System.out.print("*");
				 --star;
			 }
			 int k=row-temp;
			 while(k>0) {
				 System.out.print(k);
				 --k;
			 }
			 
			 System.out.println();
			 ++temp;
			 ++i;

		 }
		 
	}

}
