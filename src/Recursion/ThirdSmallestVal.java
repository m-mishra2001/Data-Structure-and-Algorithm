package Recursion;

public class ThirdSmallestVal {
	public static int getThirdSmallest(int[] a) {
	      int temp;
	      //sort the array
	      for (int i = 0; i < a.length; i++) {
	         for (int j = i + 1; j < a.length; j++) {
	            if (a[i] > a[j]) {
	               temp = a[i];
	               a[i] = a[j];
	               a[j] = temp;
	            }
	         }
	      }
	      //return third smallest element
	      return a[2];
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = { 11,10,4, 15, 16, 13, 2 };
        int ans=getThirdSmallest(a);
        System.out.println(ans);
	}

}
