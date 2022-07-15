package Recursion;

import java.util.Scanner;

public class BubbleSort {
    static void swap(int arr[],int i) {
    	
    	System.out.println("values swapped"+arr[i]+" "+arr[i+1]);
    	int temp=arr[i];
    	arr[i]=arr[i+1];
    	arr[i+1]=temp;
    }
	static void bubbleSort(int arr[],int s) {
		if(s==1||s==0)
			return;
		
		for(int i=0;i<s-1;++i) {
			if(arr[i]>arr[i+1])
			swap(arr,i);
		}
//		for(int i=0;i<s;i++) {
//			System.out.println(arr[i]);
//			
//		}
//		System.out.println("break");
		bubbleSort(arr,s-1);
	
					
					
					
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]=new int[10];
     Scanner sc=new Scanner(System.in);
     int s=sc.nextInt();
     System.out.println("enter the array element");
     for(int i=0;i<s;i++) {
    	 arr[i]=sc.nextInt();
     }
     System.out.println("array before sorting");
     for(int i=0;i<s;i++) {
    	 System.out.print(arr[i]+" ");
     }
     bubbleSort(arr,s);
     System.out.println("array after sorting");
     for(int i=0;i<s;i++) {
    	 System.out.print(arr[i]+" ");
     }
	}

}
