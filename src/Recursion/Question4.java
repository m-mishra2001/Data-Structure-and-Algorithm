package Recursion;

public class Question4 {
    static int findFirstMissing(int array[], int start, int end) {
    	 if (start > end)
             return end + 1;
  
         if (start != array[start])
             return start;
  
         int mid = (start + end) / 2;
  
         // Left half has all elements from 0 to mid
         if (array[mid] == mid)
             return findFirstMissing(array, mid+1, end);
  
         return findFirstMissing(array, start, mid);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {0,1,2,3,5,6};
 int ans=findFirstMissing(arr,0,arr.length-1);
 System.out.println(ans);
	}

}
