package Array;

import java.util.Scanner;

public class MinimumAndMaximum {
  
	static int max(int arr[],int s) {
		
		int max=arr[0];
		int i=1;
		while(i<s) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
			i+=1;
		}
		return max;
		
	}
	
	static int min(int arr[],int s) {
		
		int min=arr[0];
		int i=1;
		while(i<s) {
			if(arr[i]<min) {
				min=arr[i];
				
			}
			i+=1;
		}
		return min;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    int arr[]=new int[10];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of the array");
    int size=sc.nextInt();
    for(int i=0;i<size;++i) {
    	arr[i]=sc.nextInt();
    }
    int m=max(arr,size);
    System.out.println("maximum element="+m);
    int mi=min(arr,size);
    System.out.println("minimum element="+mi);
	}

}
