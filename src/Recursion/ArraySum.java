package Recursion;

public class ArraySum {
   
	static int arraySum(int arr[],int size) {
		if(size==0) {
			return 0;
		}
		int arr2[]=new int[size-1];
		int j=0;
		for(int i=1;i<arr.length;i++) {
			arr2[j]=arr[i];
			j++;
		}
		return arr[0]+arraySum(arr2,size-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {10,20,34,56,78};
     int sum=arraySum(arr,arr.length);
     System.out.println("sum of the array is "+sum);
	}

}
