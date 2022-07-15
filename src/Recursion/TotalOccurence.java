package Recursion;

import java.util.Scanner;

public class TotalOccurence {
    static int Lans;
    static int Rans;
   static void leftOccurence(int arr[],int s,int e, int item) {
	   int mid=(s+e)/2;
	 
		   if(s>e) {   
			   return;
		   }
		   
		   if(arr[mid]==item) {
			   Lans=mid;
			   e=mid-1;
		   }
		   if(arr[mid]>item) {
			   e=mid-1;
		   }
		   else {
			   if(arr[mid]<item) {
				   s=mid+1;
			   }
			   
		   }
		   leftOccurence(arr,s,e,item);
	

	   
   }
   static void rightOccurence(int arr[],int s,int e, int item) {
	   int mid=(s+e)/2;
	 
		   if(s>e) {   
			   return;
		   }
		   
		   if(arr[mid]==item) {
			   Rans=mid;
			   s=mid+1;
		   }
		   if(arr[mid]>item) {
			   e=mid-1;
		   }
		   else {
			   if(arr[mid]<item) {
				   s=mid+1;
			   }
			   
		   }
		 rightOccurence(arr,s,e,item);
	

	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]={1,2,4,4,6,9};
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the item value");
	        int item=sc.nextInt();
	        leftOccurence(arr,0,arr.length-1,item);
	     System.out.println("the left most occurence of "+item+" is "+Lans);
	     rightOccurence(arr,0,arr.length-1,item);
	     System.out.println("the left most occurence of "+item+" is "+Rans);
	     int total=(Rans-Lans)+1;
	     System.out.println("total occurence="+total);
       
	}

}
