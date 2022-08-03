package SearchingAndSorting;

import java.util.Scanner;

public class BinarySearchIteration {
    public static int bSearch(int[]arr,int size,int key) {
    	int start=0;
    	int end=size-1;
    	int mid=(start+end)/2;
    	while(start<=end) {
    		if(arr[mid]==key)
    			return mid;
    		else {
    			if(key<arr[mid])
    				end=mid-1;
    			else
    				start=mid+1;
    		 
    		}
    		mid=(start+end)/2;
    	}
    	
    	return -1;
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
    int result=bSearch(arr,size,key);
		if(result==-1) {
			System.out.println("element not fount");
		}else {
			System.out.println("element fount at index "+result);
		}
		
	}

}
