package Array;

public class SwapAlt {
    
	static void swapAlt(int arr[],int size){
		int i=0;
		int j=i+1;
	 while(j<size){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i=i+2;
		j=i+1;
	 }
	 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]=new int [10];
    CArray a=new CArray();
    System.out.println("enter the size of the Array");
    int size=a.sc.nextInt();
    a.input(arr, size);
    swapAlt(arr,size);
    System.out.println("array after swapping");
    a.print(arr, size);
	}

}
