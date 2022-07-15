package Recursion;

public class IsSorted {
    static void isSorted(int arr[],int size) {
     
    	if(size==1||size==0) {
    		System.out.println("array is sorted");
    		return ;
    	}
    		
    	int arr2[]=new int[size-1] ;
    	if(arr[0]<arr[1])
    	{ 
    		
    		int j=0;
    		for(int i=1;i<arr.length;i++) {
    			arr2[j]=arr[i];
    			j++;
    		}
    		
   		isSorted(arr2,size-1);
   		
    	}else {
    		System.out.println("Array is not sorted");
    		return ;
    	}
    				
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,45,78,90,99,100};
	 isSorted(arr,arr.length);
		
		
	}

}
