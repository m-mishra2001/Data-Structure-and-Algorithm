package Recursion;

import java.util.Scanner;

public class Exponential {
    
	double exponential(double ex){
		double result=Math.pow(2, ex);
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int ex;
    Scanner sc=new Scanner(System.in);
	ex=sc.nextInt();
	Exponential e=new Exponential();
	double result =e.exponential(ex);
	System.out.println(result);
	}

}
