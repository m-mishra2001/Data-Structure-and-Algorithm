package Recursion;

import java.util.Scanner;

public class ReverseString {
	
	static String toString(char arr[]) {
		String str=new String(arr);
		return str;
	}
	static void swap(char arr[],int i,int j) {
		char temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
    static void reverse(char arr[],int i,int j) {
    	if(i>j) {
    		return;
    	}
    	swap(arr,i,j);
    	reverse(arr,i+1,j-1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str=new String();
      Scanner sc=new Scanner(System.in);
      str=sc.next();
      char arr[]=new char[str.length()];
      arr=str.toCharArray();
      reverse(arr,0,arr.length-1);
     str=toString(arr);
     System.out.println(str);
	}

}
