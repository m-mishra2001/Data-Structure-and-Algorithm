package Recursion;
import java.util.Scanner;
public class Fabonacci {

	static int nfabonacci(int num){
		if(num==0)
			return 0;
		if(num==1)
			return 1;
		
		return nfabonacci(num-1)+nfabonacci(num-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.println(nfabonacci(num));
	}

}
