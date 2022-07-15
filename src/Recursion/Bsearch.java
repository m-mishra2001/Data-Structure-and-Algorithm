package Recursion;

import java.util.Scanner;

public class Bsearch{
   static int arr[]= new int[10];
   
   static boolean bsearch(int s,int e,int item) {
	   int mid=(s+e)/2;
	   boolean ans;
	   if(arr[mid]==item) {
		   return true;
	   }
	   if(s>e) {
		   return false;
	   }
	   if(item<arr[mid]) {
		   e=mid-1;
		   
		   
	   }else {
		   s=mid+1;
		  
	   }
	   ans=bsearch(s,e,item);
	   return ans;
	   
	      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the array element");
       for(int i=0;i<arr.length;i++) {
    	   arr[i]=sc.nextInt();
       }
       System.out.println("enter the element to be searcdhg for ");
       int item=sc.nextInt();
       boolean ans=bsearch(0,arr.length-1,item);
       if(ans==true) {
    	   System.out.println("item found");
       }
       else {
    	   System.out.println("item not found");
       }
	}

}
