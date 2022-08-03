package SearchingAndSorting;

import java.util.Scanner;

public class BinarySearchRecursion {
   
	public static int bSearch(int start,int end,int size,int key,int []arr) {
		
		int mid=(start+end)/2;
		int result;
		if(start>end) {
			return -1;
		}else {
			if(key==arr[mid]) {
				return mid;
			}else {
				if(key<arr[mid])
				end=mid-1;
				else
					start=mid+1;
				result=bSearch( start,end,size,key,arr);
			}
			
		}
		return result;
		
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
	    System.out.println("Enter the element to be search ");
	    int key=sc.nextInt();
	    int result=bSearch(0,size-1,size,key,arr);
			if(result==-1) {
				System.out.println("element not fount");
			}else {
				System.out.println("element fount at index "+result);
			}
		
	}

}
