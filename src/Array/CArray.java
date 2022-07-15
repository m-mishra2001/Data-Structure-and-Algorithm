package Array;

import java.util.Scanner;

public class CArray {
	Scanner sc=new Scanner(System.in);
	void input(int arr[],int size) {
		System.out.println("enter the element");
		for(int i=0;i<size;++i) {
			arr[i]=sc.nextInt();
		}
		
	}
	
	void print(int arr[],int size) {
		for(int i=0;i<size;++i) {
			System.out.print(arr[i]+" ");
		}
	}

}
