package Array;

import java.util.ArrayList;

public class ArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    CArray c=new CArray();
		int arr1[]=new int[10];
       System.out.println("enter the size of first arry");
       int s1=c.sc.nextInt();
       c.input(arr1, s1);
		int arr2[]=new int[10];
		System.out.println("enter the size of second array");
		int s2=c.sc.nextInt();
		c.input(arr2, s2);
		
		
        //Array Intersection
		int i=0;
		int j=0;
		ArrayList<Integer>ar=new ArrayList();
		while(i<s1&&j<s2) {
			if(arr1[i]<arr2[j]) {
				++i;
			}
			else {
				if(arr1[i]==arr2[j]) {
					ar.add(arr1[i]);
					++i;++j;
				}
				else {
					++j;
				}
			}
		}
		System.out.println(ar);
	}

}
