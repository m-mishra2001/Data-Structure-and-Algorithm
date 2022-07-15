package Array;

import java.util.Arrays;

public class MergeSortedArray {

public static void main(String[]args) {
	int nums1[]= {1,2,3,0,0,0};
	int m = 3;
	int n =3;
	int nums2[] = {2,5,6};

	int j=0;
	for(int i=m;i<nums1.length;++i) {
		nums1[i]=nums2[j];
	
		++j;
	}
//	for(int i=0;i<nums1.length;++i) {
//		System.out.println(nums1[i]);
//	}
	Arrays.sort(nums1);
	for(int i=0;i<nums1.length;++i) {
		System.out.print(nums1[i]);
	}
}
	
}
