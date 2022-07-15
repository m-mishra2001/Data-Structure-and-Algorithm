package Recursion2;
import java.math.BigInteger;
import java.util.Scanner;
public class Power {

    static long  pow(int num,int n) {
    	if(n==0) return 1;
    	long temp=pow(num,(n/2));
    	
    	if(n%2==1) {
    		long m=temp*temp*num;
    		System.out.println(n+" "+ m);
    		return 1;
    	}
    	long m=temp*temp ;
		System.out.println(n+" "+ m);
    	return 1;
    	
    } 
	
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int num=sc.nextInt();
	 int n=sc.nextInt();
     System.out.println(pow(num,n));
	}

}
