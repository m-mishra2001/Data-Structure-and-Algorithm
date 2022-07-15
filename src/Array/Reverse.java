package Array;
import Array.CArray;
public class Reverse {
    
	static void reverse(int arr[],int size) {
		
		int i=0;
		int j=size-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			++i;
			--j;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		CArray a=new CArray();
		int arr[]=new int[10];
		System.out.println("enter the size of the array");
		int size=a.sc.nextInt();
		a.input(arr,size);
		System.out.println("Array before reverse");
		a.print(arr, size);
		reverse(arr,size);
		System.out.println();
		System.out.println("Array after reverse");
		a.print(arr, size);
	}

}
