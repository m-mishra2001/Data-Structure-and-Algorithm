package Array;

import java.util.Scanner;
import java.util.*;
public class PairSum {

	public static void main(String[]args) {
		int k=0;
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		System.out.println("enter the array element");
		for(int i=0;i<size;++i) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the targer value");
		int s=sc.nextInt();
		for(int i=0;i<size;++i) {
			for(int j=i+1;j<size;++j) {
				 if(arr[i]+arr[j]==s){
					 result.add(new ArrayList<Integer>());
		                result.get(k).add(Math.min(arr[i],arr[j]));
		                result.get(k).add(Math.max(arr[i],arr[j]));
		                ++k; 
				 }
				
			}
		}
		
		System.out.println(result);
	}
	
	
}
