package Recursion;

public class Question5 {
	static int findNumberOfTriangles(int arr[], int n)
    {
        // Sort the array
       
       
        // Count of triangles
        int count = 0;
     
        // The three loops select three
        // different values from array
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
     
                // The innermost loop checks for
                // the triangle property
                for (int k = j + 1; k < n; k++)
     
                    // Sum of two sides is greater
                    // than the third
                      if (arr[i] + arr[j] > arr[k]) {
                        count++;
                    }
                    
            }
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int arr[] = { 10, 21, 22, 100, 101, 200, 300 };
        int size = arr.length;
     
        System.out.println( "Total number of triangles possible is "+
        findNumberOfTriangles(arr, size));
	}

}
