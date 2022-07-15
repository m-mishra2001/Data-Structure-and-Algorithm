package Array;

public class SwapAlternate {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]=new int[10];
    CArray c=new CArray();
    System.out.println("enter the size of the Array");
    int size=c.sc.nextInt();
    c.input(arr, size);
    int i=0;
    while(i<size&&(i+1)<size) {
    	
    	int temp=arr[i];
    	arr[i]=arr[i+1];
    	arr[i+1]=temp;
    	i+=2;
    }
    System.out.println("Array after the swaping");
    c.print(arr, size);
    
		
		
	}

}
