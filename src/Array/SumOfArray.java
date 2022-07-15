package Array;

import java.util.Scanner;

public class SumOfArray {
   int sum(int arr[],int s) {
	   
	  int sum=0;
	  for(int i=0;i<s;++i) {
		  sum+=arr[i];
	  }
	  return sum;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]=new int[10];
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size of the array");
   int size=sc.nextInt();
   System.out.println("enter the array element");
   for(int i=0;i<size;++i) {
	   arr[i]=sc.nextInt();
   }
   SumOfArray s=new SumOfArray();
  
	System.out.println("sum="+s.sum(arr,size));	
	}

}
