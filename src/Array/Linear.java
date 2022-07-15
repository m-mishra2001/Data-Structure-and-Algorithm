package Array;

import java.util.Scanner;

public class Linear {

	static int linearSearch(int arr[],int s,int item){
		
		for(int i=0;i<s;++i) {
			if(item==arr[i]){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]=new int[10];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of the array");
    int size=sc.nextInt();
    System.out.println("enter the array element");
    for(int i=0;i<size;++i) {
    	arr[i]=sc.nextInt();
    }
    
    System.out.println("enter the item to be search");
    int item=sc.nextInt();
    
    int i=linearSearch(arr,size,item);
    if(i>0) {
    	System.out.println("element found at index="+i);
    }
    else {
    	System.out.println("element not found ");
    }
    
	}

}
