package Array;

import java.util.ArrayList;

public class ArrayIntersaction {

	static void intersaction(int a[],int a2[],int s1,int s2) {
		int i=0;
		int j=0;
		ArrayList<Integer> ans=new ArrayList<Integer>();
		
		while(i<s1&&j<s2) {
			if(a2[j]==a[i]) {
				ans.add(a2[j]);
				j+=1;
				i+=i;
			}else {
				i+=1;
			}
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CArray arr=new CArray();
int a[]=new int[10];
int a2[]=new int[10];
System.out.println("enter the size of the array 1");
int size=arr.sc.nextInt();
arr.input(a, size);
System.out.println("enter the size of the array 2");
int size2=arr.sc.nextInt();
arr.input(a2, size2);
intersaction(a,a2,size,size2);

		
	}

}
