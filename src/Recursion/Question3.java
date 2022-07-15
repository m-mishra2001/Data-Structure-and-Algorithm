package Recursion;

public class Question3 {

	static int findSum(int arr[], int n) {
        
 
      
        
        int sum = arr[0];
        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i + 1]) {
                sum = sum + arr[i+1];
            }
        }
 
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = {1,2,2,3,4,7,0};
	        int n = arr.length;
	        int sum=findSum(arr, n);
	        System.out.println(sum);
	}

}
