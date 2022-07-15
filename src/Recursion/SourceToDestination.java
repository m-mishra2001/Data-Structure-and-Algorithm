package Recursion;

import java.util.Scanner;

public class SourceToDestination {

	static void reachHome(int src,int des) {
		if(src==des)
		{
			System.out.println("reached home in "+src+"steps");
			return;
		}
		reachHome(++src,des);
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int source,destination;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the source and destination");
		source=sc.nextInt();
		destination=sc.nextInt();
		reachHome(source,destination);
		
		
	}

}
