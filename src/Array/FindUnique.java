package Array;

import java.util.Scanner;

public class FindUnique {
	
	static void bubbleSort(int arr[],int size)
    {
        
        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
 

	static int findUnique(int arr[],int size) {
		
		int i=0;
		
		while(i<size) {
			if(arr[i]==arr[i+1]) {
				i+=2;
			}else {
				break;
			}
		}
		return arr[i];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
  CArray a=new CArray();
   int arr[]=new int[10];
   System.out.println("enter the size of the array");
   int size=sc.nextInt();
   a.input(arr, size);
   bubbleSort(arr,size);
  
   int element=findUnique(arr,size);
   System.out.println("unique element is ="+element);
	}

}
