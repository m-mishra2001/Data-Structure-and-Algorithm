
//Answer: The function fun() calculates and returns ((1 + 2 … + x-1 + x) +y), which is x(x+1)/2 + y. 
//For example, if x is 5 and y is 2, then fun should return 15 + 2 = 17.
package Recursion;

import java.util.Scanner;

public class GeeksSet1 {
     static int calc(int num) {
    	 if(num==1) {
    		 return 1;
    	 }
    	 
    	 return num+calc(num-1);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);	
    int x=sc.nextInt();
    int y=sc.nextInt();
    int sSum=calc(x);
    System.out.println(sSum+y);
	}

}
