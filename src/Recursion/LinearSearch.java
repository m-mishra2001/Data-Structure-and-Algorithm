package Recursion;

import java.util.Scanner;

public class LinearSearch {

	static boolean linearSearch(int arr[],int size,int num)
	{
		if(size==0) {
			return false;
		}
		int arr2[]=new int[size-1];
		int j=0;
		for(int i=1;i<arr.length;i++) {
			arr2[j]=arr[i];
			j++;
		}
		boolean ans;
		if(arr[0]!=num)
			ans= linearSearch(arr2,size-1,num);
		else 
			return true;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {10,67,57,89,10};
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number to found");
      int num=sc.nextInt();
      boolean ans=linearSearch(arr,arr.length,num);
      if(ans==true) {
    	  System.out.println("element found");
      }else {
    	  System.out.println("element not found ");
      }
	}

}
