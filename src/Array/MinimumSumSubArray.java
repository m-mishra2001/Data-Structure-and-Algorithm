package Array;

public class MinimumSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CArray c=new CArray();
		int arr[]=new int[10];
		System.out.println("enter the size of the array");
		int s=c.sc.nextInt();
		c.input(arr, s);
		System.out.println("enter the value of k");
		int k=c.sc.nextInt();
//		sliding window algo start
		int cSum=0;
		int lIndex=k-1;
		for(int i=0;i<k;++i) {
			cSum+=arr[i];
		}
		int minSum=cSum;
		for(int i=k;i<s;++i) {
			cSum+=arr[i];
			cSum-=arr[i-k];
			if(minSum>cSum) {
				minSum=cSum;
				lIndex=i;
			}
		}
		int start=lIndex-k+1;
		int end=lIndex;
		for(int j=start;j<=end;++j) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		System.out.println(minSum);
	}

}
