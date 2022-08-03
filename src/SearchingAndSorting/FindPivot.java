package SearchingAndSorting;

import java.util.Scanner;

//find the pivot in rotated array 
//pivot is the smallest element in the array
//solve in O(log n)
public class FindPivot {

	public static int findPivot(int[]arr,int n) {
		int s=0;
		int e=n-1;
		int mid=(s+e)/2;
		while(s<e) {
			if(arr[mid]>=arr[0]) {
				s=mid+1;
			}else {
				e=mid;
			}
			mid=(s+e)/2;
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
	  int arr[]= new int[10];
      System.out.println("Enter the number of element in array");
      int n=sc.nextInt(); 
      System.out.println("Enter element of array");
      for(int i=0;i<n;++i) {
    	  arr[i]=sc.nextInt();
      }
      
      int result=findPivot(arr,n);
      System.out.println("pivot element is ="+arr[result]);
      
	}

}
